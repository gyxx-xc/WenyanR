package visitor;

import antlr.WenyanRParser;
import utils.WenyanDataPhaser;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

import java.util.ArrayList;
import java.util.Stack;

public class WenyanExprVisitor extends WenyanVisitor{
    public WenyanExprVisitor(WenyanFunctionEnvironment functionEnvironment, Stack<WenyanValue> reaultStack) {
        super(functionEnvironment, reaultStack);
    }

    // maybe it is better to use a function to push return value...
    @Override
    public WenyanValue visitReference_statement(WenyanRParser.Reference_statementContext ctx) {
        WenyanValue value = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data());
        return reultStack.push(WenyanValue.constOf(value));
    }

    @Override
    public WenyanValue visitDeclare_statement(WenyanRParser.Declare_statementContext ctx) {
        try {
            int n = WenyanDataPhaser.parseInt(ctx.INT_NUM().getText());
            if (!ctx.d.isEmpty() && n != ctx.d.size())
                throw new RuntimeException("number of variables does not match number of values");
            WenyanValue.Type type = WenyanDataPhaser.parseType(ctx.type().getText());
            for (int i = 0; i < n; i++) {
                if (!ctx.d.isEmpty()) {
                    WenyanValue value = (new WenyanDataVisitor(functionEnvironment, reultStack)).visit(ctx.d.get(i));
                    reultStack.push(WenyanValue.constOf(value).casting(type));
                } else {
                    reultStack.push(WenyanValue.emptyOf(WenyanDataPhaser.parseType(ctx.type().getText()), true));
                }
            }
            return reultStack.peek();
        } catch (WenyanDataPhaser.WenyanNumberException | WenyanDataPhaser.WenyanDataException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WenyanValue visitInit_declare_statement(WenyanRParser.Init_declare_statementContext ctx) {
        try {
            WenyanValue value = (new WenyanDataVisitor(functionEnvironment, reultStack)).visit(ctx.data());
            return reultStack.push(WenyanValue.constOf(value)
                    .casting(WenyanDataPhaser.parseType(ctx.type().getText())));
        } catch (WenyanDataPhaser.WenyanDataException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WenyanValue visitDefine_statement(WenyanRParser.Define_statementContext ctx) {
        int n = ctx.d.size();
        for (int i = 0; i < n; i ++) {
            functionEnvironment.setVariable(ctx.d.get(i).getText(),
                    WenyanValue.varOf(reultStack.get(reultStack.size() - n + i)));
        }
        return reultStack.peek();
    }

    @Override
    public WenyanValue visitAssign_data_statement(WenyanRParser.Assign_data_statementContext ctx) {
        WenyanValue var = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(0));
        if (var.isConst())
            throw new RuntimeException("cannot assign to constant");
        WenyanValue value = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(1));
        var.setValue(value.casting(value.getType()).getValue());
        return reultStack.push(var);
    }

    @Override
    public WenyanValue visitAssign_null_statement(WenyanRParser.Assign_null_statementContext ctx) {
        WenyanValue var = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data());
        if (var.isConst())
            throw new RuntimeException("cannot assign to constant");
        var.setValue(null);
        return reultStack.push(null);
    }

    @Override
    public WenyanValue visitBoolean_algebra_statement(WenyanRParser.Boolean_algebra_statementContext ctx) {
        WenyanValue left = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(0));
        WenyanValue right = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(1));
        left = left.casting(WenyanValue.Type.BOOL);
        right = right.casting(WenyanValue.Type.BOOL);
        return switch (ctx.op.getType()) {
            case WenyanRParser.AND -> reultStack.push(new WenyanValue(WenyanValue.Type.BOOL,
                    (boolean) left.getValue() && (boolean) right.getValue(), true));
            case WenyanRParser.OR -> reultStack.push(new WenyanValue(WenyanValue.Type.BOOL,
                    (boolean) left.getValue() || (boolean) right.getValue(), true));
            default -> throw new RuntimeException("unknown operator");
        };
    }

    @Override
    public WenyanValue visitMod_math_statement(WenyanRParser.Mod_math_statementContext ctx) {
        WenyanValue left = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(0));
        WenyanValue right = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(1));
        return switch (ctx.pp.getType()) {
            case WenyanRParser.PREPOSITION_RIGHT -> reultStack.push(left.mod(right));
            case WenyanRParser.PREPOSITION_LEFT -> reultStack.push(right.mod(left));
            default -> throw new RuntimeException("unknown preposition");
        };
    }

    @Override
    public WenyanValue visitKey_function_call_statement(WenyanRParser.Key_function_call_statementContext ctx) {
        ArrayList<WenyanValue> args = new ArrayList<>();
        WenyanValue returnValue;
        if (ctx.KEY_FUN_ID_LAST() != null) {
            args.add(0, reultStack.peek());
        }
        for (WenyanRParser.DataContext d : ctx.data()) {
            args.add(new WenyanDataVisitor(functionEnvironment, reultStack).visit(d));
        }
        if (args.size() == 2) { // deal pp
            returnValue = switch (ctx.pp.get(0).getType()) {
                case WenyanRParser.PREPOSITION_RIGHT ->
                        (new WenyanKeyFunctionVisitor()).visit(ctx.key_function())
                                .apply(new WenyanValue[]{args.get(0), args.get(1)});
                case WenyanRParser.PREPOSITION_LEFT ->
                        (new WenyanKeyFunctionVisitor()).visit(ctx.key_function())
                                .apply(new WenyanValue[]{args.get(1), args.get(0)});
                default -> throw new RuntimeException("unknown preposition");
            };
        } else { // ignore pp
            returnValue = (new WenyanKeyFunctionVisitor()).visit(ctx.key_function())
                    .apply(args.toArray(new WenyanValue[0]));
        }
        if (ctx.KEY_FUN_ID_LAST() != null) {
            return null; // not change stack
        }
        return reultStack.push(returnValue);
    }
}
