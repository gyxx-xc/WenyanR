package visitor;

import antlr.WenyanRParser;
import utils.WenyanDataPhaser;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class WenyanExprVisitor extends WenyanVisitor{
    public WenyanExprVisitor(WenyanFunctionEnvironment functionEnvironment) {
        super(functionEnvironment);
    }

    // maybe it is better to use a function to push return value...
    @Override
    public WenyanValue visitReference_statement(WenyanRParser.Reference_statementContext ctx) {
        WenyanValue value = new WenyanDataVisitor(functionEnvironment).visit(ctx.data());
        return functionEnvironment.resultStack.push(value);
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
                    WenyanValue value = (new WenyanDataVisitor(functionEnvironment)).visit(ctx.d.get(i));
                    functionEnvironment.resultStack.push(WenyanValue.constOf(value).casting(type));
                } else {
                    functionEnvironment.resultStack.push(WenyanValue.emptyOf(WenyanDataPhaser.parseType(ctx.type().getText()), true));
                }
            }
            return functionEnvironment.resultStack.peek();
        } catch (WenyanDataPhaser.WenyanNumberException | WenyanDataPhaser.WenyanDataException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WenyanValue visitInit_declare_statement(WenyanRParser.Init_declare_statementContext ctx) {
        try {
            WenyanValue value = (new WenyanDataVisitor(functionEnvironment)).visit(ctx.data());
            return functionEnvironment.resultStack.push(WenyanValue.constOf(value)
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
                    WenyanValue.varOf(functionEnvironment.resultStack.get(functionEnvironment.resultStack.size() - n + i)));
        }
        return functionEnvironment.resultStack.peek();
    }

    @Override
    public WenyanValue visitAssign_data_statement(WenyanRParser.Assign_data_statementContext ctx) {
        WenyanValue var = new WenyanDataVisitor(functionEnvironment).visit(ctx.data(0));
        if (var.isConst())
            throw new RuntimeException("cannot assign to constant");
        WenyanValue value = new WenyanDataVisitor(functionEnvironment).visit(ctx.data(1));
        // although the constOf do nothing here,
        // it is better to keep the code consistent
        var.setValue(WenyanValue.constOf(value).casting(value.getType()).getValue());
        return functionEnvironment.resultStack.push(var);
    }

    @Override
    public WenyanValue visitAssign_null_statement(WenyanRParser.Assign_null_statementContext ctx) {
        WenyanValue var = new WenyanDataVisitor(functionEnvironment).visit(ctx.data());
        if (var.isConst())
            throw new RuntimeException("cannot assign to constant");
        var.setValue(null);
        return functionEnvironment.resultStack.push(null);
    }

    @Override
    public WenyanValue visitBoolean_algebra_statement(WenyanRParser.Boolean_algebra_statementContext ctx) {
        WenyanValue left = new WenyanDataVisitor(functionEnvironment).visit(ctx.data(0));
        WenyanValue right = new WenyanDataVisitor(functionEnvironment).visit(ctx.data(1));
        // although the constOf do nothing here,
        // it is better to keep the code consistent
        left = WenyanValue.constOf(left).casting(WenyanValue.Type.BOOL);
        right = WenyanValue.constOf(right).casting(WenyanValue.Type.BOOL);
        return switch (ctx.op.getType()) {
            case WenyanRParser.AND -> functionEnvironment.resultStack.push(new WenyanValue(WenyanValue.Type.BOOL,
                    (boolean) left.getValue() && (boolean) right.getValue(), true));
            case WenyanRParser.OR -> functionEnvironment.resultStack.push(new WenyanValue(WenyanValue.Type.BOOL,
                    (boolean) left.getValue() || (boolean) right.getValue(), true));
            default -> throw new RuntimeException("unknown operator");
        };
    }

    @Override
    public WenyanValue visitMod_math_statement(WenyanRParser.Mod_math_statementContext ctx) {
        WenyanValue left = new WenyanDataVisitor(functionEnvironment).visit(ctx.data(0));
        WenyanValue right = new WenyanDataVisitor(functionEnvironment).visit(ctx.data(1));
        left = WenyanValue.constOf(left);
        right = WenyanValue.constOf(right);
        return switch (ctx.pp.getType()) {
            case WenyanRParser.PREPOSITION_RIGHT -> functionEnvironment.resultStack.push(left.mod(right));
            case WenyanRParser.PREPOSITION_LEFT -> functionEnvironment.resultStack.push(right.mod(left));
            default -> throw new RuntimeException("unknown preposition");
        };
    }

    @Override
    public WenyanValue visitKey_function_call_statement(WenyanRParser.Key_function_call_statementContext ctx) {
        ArrayList<WenyanValue> args = new ArrayList<>();
        WenyanValue returnValue;
        if (ctx.FUN_ID_LAST() != null) {
            args.add(WenyanValue.constOf(functionEnvironment.resultStack.peek()));
        }
        for (WenyanRParser.DataContext d : ctx.data()) {
            args.add(WenyanValue.constOf(new WenyanDataVisitor(functionEnvironment).visit(d)));
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
        if (ctx.FUN_ID_LAST() != null) {
            return null; // not change stack
        }
        return functionEnvironment.resultStack.push(returnValue);
    }

    @Override
    public WenyanValue visitFunction_define_statement(WenyanRParser.Function_define_statementContext ctx) {
        if (!ctx.IDENTIFIER(0).getText().equals(ctx.IDENTIFIER(ctx.IDENTIFIER().size()-1).getText())) {
            throw new RuntimeException("function name does not match");
        }
        ArrayList<WenyanValue.Type> argsType = new ArrayList<>();
        try {
            for (int i = 0; i < ctx.INT_NUM().size(); i ++) {
                int n = WenyanDataPhaser.parseInt(ctx.INT_NUM(i).getText());
                for (int j = 0; j < n; j ++)
                    argsType.add(WenyanDataPhaser.parseType(ctx.type(i).getText()));
            }
        } catch (WenyanDataPhaser.WenyanDataException | WenyanDataPhaser.WenyanNumberException e) {
            throw new RuntimeException(e);
        }
        WenyanFunctionEnvironment.FunctionSign sign = new WenyanFunctionEnvironment.FunctionSign(
                ctx.IDENTIFIER(0).getText(), argsType.toArray(new WenyanValue.Type[0]));
        functionEnvironment.setFunction(sign, ctx);
        WenyanValue func = new WenyanValue(WenyanValue.Type.FUNCTION, sign, true);
        functionEnvironment.setVariable(ctx.IDENTIFIER(0).getText(), func);
        return functionEnvironment.resultStack.push(func);
    }

    @Override
    public WenyanValue visitFunction_pre_call(WenyanRParser.Function_pre_callContext ctx) {
        ArrayList<WenyanValue> args = new ArrayList<>();
        WenyanValue returnValue;
        if (ctx.FUN_ID_LAST() != null) {
            args.add(WenyanValue.constOf(functionEnvironment.resultStack.peek()));
        }
        for (WenyanRParser.DataContext d : ctx.args) {
            args.add(WenyanValue.constOf(new WenyanDataVisitor(functionEnvironment).visit(d)));
        }
        if (ctx.key_function() != null) {
            returnValue = (new WenyanKeyFunctionVisitor()).visit(ctx.key_function())
                    .apply(args.toArray(new WenyanValue[0]));
        } else { // id function
            WenyanFunctionEnvironment.FunctionSign sign =
                    (WenyanFunctionEnvironment.FunctionSign)
                            (new WenyanDataVisitor(functionEnvironment)
                                    .visit(ctx.data(0)).getValue());
            returnValue = callFunction(sign, args.toArray(new WenyanValue[0]));
        }
        if (ctx.FUN_ID_LAST() != null) {
            return null; // not change stack
        }
        return functionEnvironment.resultStack.push(returnValue);
    }

    @Override
    public WenyanValue visitFunction_post_call(WenyanRParser.Function_post_callContext ctx) {
        ArrayList<WenyanValue> args = new ArrayList<>();
        int n;
        try {
            n = WenyanDataPhaser.parseInt(ctx.INT_NUM().getText());
        } catch (WenyanDataPhaser.WenyanNumberException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < n; i ++) {
            args.add(0, WenyanValue.constOf(functionEnvironment.resultStack.pop()));
        }
        // Collections.reverse(args);
        if (ctx.key_function() != null) {
            return functionEnvironment.resultStack.push(((new WenyanKeyFunctionVisitor()).visit(ctx.key_function())
                    .apply(args.toArray(new WenyanValue[0]))));
        } else { // id function
            WenyanFunctionEnvironment.FunctionSign sign =
                    (WenyanFunctionEnvironment.FunctionSign)
                            (new WenyanDataVisitor(functionEnvironment)
                                    .visit(ctx.data()).getValue());
            return functionEnvironment.resultStack.push(callFunction(sign, args.toArray(new WenyanValue[0])));
        }

    }

    private WenyanValue callFunction(WenyanFunctionEnvironment.FunctionSign sign, WenyanValue[] args) {
        WenyanRParser.Function_define_statementContext func = functionEnvironment.getFunction(sign);
        // casting args
        for (int i = 0; i < args.length; i ++) {
            args[i] = args[i].casting(sign.argTypes()[i]);
        }
        WenyanFunctionEnvironment functionEnvironment = new WenyanFunctionEnvironment(this.functionEnvironment);
        for (int i = 0; i < args.length; i ++) {
            functionEnvironment.setVariable(func.id.get(i).getText(), args[i]);
        }
        WenyanMainVisitor visitor = new WenyanMainVisitor(functionEnvironment);
        try {
            for (WenyanRParser.StatementContext statementContext : func.statement()) {
                visitor.visit(statementContext);
            }
        } catch (WenyanControlVisitor.ReturnException e) {
            return e.value;
        }
        return null;
    }
}
