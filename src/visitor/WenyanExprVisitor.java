package visitor;

import antlr.WenyanRParser;
import utils.WenyanDataPhaser;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

import java.util.Stack;

public class WenyanExprVisitor extends WenyanVisitor{
    public WenyanExprVisitor(WenyanFunctionEnvironment functionEnvironment, Stack<WenyanValue> reaultStack) {
        super(functionEnvironment, reaultStack);
    }

    // maybe it is better to use a function to push return value...
    @Override
    public WenyanValue visitReference_statement(WenyanRParser.Reference_statementContext ctx) {
        WenyanValue value = (new WenyanDataVisitor(functionEnvironment, reaultStack)).visit(ctx.data());
        return reaultStack.push(value);
    }

    @Override
    public WenyanValue visitDeclare_statement(WenyanRParser.Declare_statementContext ctx) {
        try {
            int n = WenyanDataPhaser.parseInt(ctx.INT_NUM().getText());
            if (!ctx.d.isEmpty() && n != ctx.d.size())
                throw new RuntimeException("number of variables does not match number of values");
            if (ctx.define_statement() != null && n != ctx.define_statement().d.size())
                throw new RuntimeException("number of variables does not match number of values");
            for (int i = 0; i < n; i++) {
                if (!ctx.d.isEmpty()) {
                    WenyanValue value = (new WenyanDataVisitor(functionEnvironment, reaultStack)).visit(ctx.d.get(i));
                    if (WenyanDataPhaser.parseType(ctx.type().getText()) != value.getType())
                        throw new RuntimeException("type does not match");
                    reaultStack.push(new WenyanValue(value.getType(), value.getValue(), false));
                } else {
                    reaultStack.push(new WenyanValue(WenyanDataPhaser.parseType(ctx.type().getText()), null, false));
                }
                if (ctx.define_statement() != null)
                    functionEnvironment.setVariable(ctx.define_statement().d.get(i).getText(), reaultStack.peek());
            }
            return reaultStack.peek();
        } catch (WenyanDataPhaser.WenyanNumberException | WenyanDataPhaser.WenyanDataException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WenyanValue visitInit_declare_statement(WenyanRParser.Init_declare_statementContext ctx) {
        try {
            if (ctx.define_statement() != null && ctx.define_statement().d.size() != 1)
                throw new RuntimeException("number of variables does not match number of values");
            WenyanValue value = (new WenyanDataVisitor(functionEnvironment, reaultStack)).visit(ctx.data());
            if (WenyanDataPhaser.parseType(ctx.type().getText()) != value.getType())
                throw new RuntimeException("type does not match");
            reaultStack.push(new WenyanValue(value.getType(), value.getValue(), false));
            if (ctx.define_statement() != null)
                functionEnvironment.setVariable(ctx.define_statement().d.get(1).getText(), reaultStack.peek());
            return reaultStack.peek();
        } catch (WenyanDataPhaser.WenyanDataException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WenyanValue visitAssign_data_statement(WenyanRParser.Assign_data_statementContext ctx) {
        WenyanValue var = new WenyanDataVisitor(functionEnvironment, reaultStack).visit(ctx.data(0));
        if (var.isConst())
            throw new RuntimeException("cannot assign to constant");
        WenyanValue value = new WenyanDataVisitor(functionEnvironment, reaultStack).visit(ctx.data(1));
        if (var.getType() != value.getType())
            throw new RuntimeException("type does not match");
        var.setValue(value.getValue());
        return reaultStack.push(var);
    }

    @Override
    public WenyanValue visitAssign_null_statement(WenyanRParser.Assign_null_statementContext ctx) {
        WenyanValue var = new WenyanDataVisitor(functionEnvironment, reaultStack).visit(ctx.data());
        if (var.isConst())
            throw new RuntimeException("cannot assign to constant");
        var.setValue(null);
        return reaultStack.push(null);
    }

    @Override
    public WenyanValue visitBoolean_algebra_statement(WenyanRParser.Boolean_algebra_statementContext ctx) {
        WenyanValue left = new WenyanDataVisitor(functionEnvironment, reaultStack).visit(ctx.data(0));
        WenyanValue right = new WenyanDataVisitor(functionEnvironment, reaultStack).visit(ctx.data(1));
        if (left.getType() != WenyanValue.Type.BOOL || right.getType() != WenyanValue.Type.BOOL)
            throw new RuntimeException("type does not match");
        return switch (ctx.op.getType()) {
            case WenyanRParser.AND -> reaultStack.push(new WenyanValue(WenyanValue.Type.BOOL,
                    (boolean) left.getValue() && (boolean) right.getValue(), true));
            case WenyanRParser.OR -> reaultStack.push(new WenyanValue(WenyanValue.Type.BOOL,
                    (boolean) left.getValue() || (boolean) right.getValue(), true));
            default -> throw new RuntimeException("unknown operator");
        };
    }

    @Override
    public WenyanValue visitMod_math_statement(WenyanRParser.Mod_math_statementContext ctx) {
        WenyanValue left = new WenyanDataVisitor(functionEnvironment, reaultStack).visit(ctx.data(0));
        WenyanValue right = new WenyanDataVisitor(functionEnvironment, reaultStack).visit(ctx.data(1));
        if (left.getType() != WenyanValue.Type.NUMBER || right.getType() != WenyanValue.Type.NUMBER)
            throw new RuntimeException("mod need to be number");
        return switch (ctx.pp.getType()) {
            case WenyanRParser.PREPOSITION_RIGHT -> reaultStack.push(new WenyanValue(WenyanValue.Type.NUMBER,
                    (int) left.getValue() % (int) right.getValue(), true));
            case WenyanRParser.PREPOSITION_LEFT -> reaultStack.push(new WenyanValue(WenyanValue.Type.NUMBER,
                    (int) right.getValue() % (int) left.getValue(), true));
            default -> throw new RuntimeException("unknown preposition");
        };
    }

    @Override
    public WenyanValue visitKey_function_call_statement(WenyanRParser.Key_function_call_statementContext ctx) {
        return super.visitKey_function_call_statement(ctx);
    }
}
