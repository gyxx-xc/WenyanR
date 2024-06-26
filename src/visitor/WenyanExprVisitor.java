package visitor;

import antlr.WenyanRParser;
import utils.WenyanDataPhaser;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class WenyanExprVisitor extends WenyanVisitor{
    public WenyanExprVisitor(WenyanFunctionEnvironment functionEnvironment, Stack<WenyanValue> reaultStack) {
        super(functionEnvironment, reaultStack);
    }

    // maybe it is better to use a function to push return value...
    @Override
    public WenyanValue visitReference_statement(WenyanRParser.Reference_statementContext ctx) {
        WenyanValue value = new WenyanDataVisitor(functionEnvironment, reaultStack).visit(ctx.data());
        return reaultStack.push(WenyanValue.constOf(value));
    }

    @Override
    public WenyanValue visitDeclare_statement(WenyanRParser.Declare_statementContext ctx) {
        try {
            int n = WenyanDataPhaser.parseInt(ctx.INT_NUM().getText());
            if (!ctx.d.isEmpty() && n != ctx.d.size())
                throw new RuntimeException("number of variables does not match number of values");
            for (int i = 0; i < n; i++) {
                if (!ctx.d.isEmpty()) {
                    WenyanValue value = (new WenyanDataVisitor(functionEnvironment, reaultStack)).visit(ctx.d.get(i));
                    if (!value.isType(WenyanDataPhaser.parseType(ctx.type().getText())))
                        throw new RuntimeException("type does not match");
                    reaultStack.push(WenyanValue.constOf(value));
                } else {
                    reaultStack.push(new WenyanValue(WenyanDataPhaser.parseType(ctx.type().getText()), null, true));
                }
            }
            return reaultStack.peek();
        } catch (WenyanDataPhaser.WenyanNumberException | WenyanDataPhaser.WenyanDataException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WenyanValue visitInit_declare_statement(WenyanRParser.Init_declare_statementContext ctx) {
        try {
            WenyanValue value = (new WenyanDataVisitor(functionEnvironment, reaultStack)).visit(ctx.data());
            if (!value.isType(WenyanDataPhaser.parseType(ctx.type().getText())))
                throw new RuntimeException("type does not match");
            reaultStack.push(WenyanValue.constOf(value));
            return reaultStack.peek();
        } catch (WenyanDataPhaser.WenyanDataException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WenyanValue visitDefine_statement(WenyanRParser.Define_statementContext ctx) {
        int n = ctx.d.size();
        for (int i = 0; i < n; i ++) {
            functionEnvironment.setVariable(ctx.d.get(i).getText(),
                    WenyanValue.varOf(reaultStack.get(reaultStack.size() - n + i)));
        }
        return reaultStack.peek();
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
        return switch (ctx.pp.getType()) {
            case WenyanRParser.PREPOSITION_RIGHT -> reaultStack.push(right.mod(left));
            case WenyanRParser.PREPOSITION_LEFT -> reaultStack.push(left.mod(right));
            default -> throw new RuntimeException("unknown preposition");
        };
    }

    @Override
    public WenyanValue visitKey_function_call_statement(WenyanRParser.Key_function_call_statementContext ctx) {
        if (ctx.d.size() == 2) { // deal pp
            WenyanValue[] args = new WenyanValue[2];
            args[0] = new WenyanDataVisitor(functionEnvironment, reaultStack).visit(ctx.d.get(0));
            args[1] = new WenyanDataVisitor(functionEnvironment, reaultStack).visit(ctx.d.get(1));
            return switch (ctx.pp.get(0).getType()) {
                case WenyanRParser.PREPOSITION_RIGHT -> reaultStack.push((new WenyanKeyFunctionVisitor()).visit(ctx.key_function()).apply(args));
                case WenyanRParser.PREPOSITION_LEFT -> reaultStack.push((new WenyanKeyFunctionVisitor()).visit(ctx.key_function()).apply(new WenyanValue[]{args[1], args[0]}));
                default -> throw new RuntimeException("unknown preposition");
            };
        } else { // ignore pp
            List<WenyanValue> args = new ArrayList<>();
            for (WenyanRParser.DataContext data : ctx.d) {
                args.add(new WenyanDataVisitor(functionEnvironment, reaultStack).visit(data));
            }
            return reaultStack.push((new WenyanKeyFunctionVisitor()).visit(ctx.key_function()).apply(args.toArray(new WenyanValue[0])));
        }
    }
}
