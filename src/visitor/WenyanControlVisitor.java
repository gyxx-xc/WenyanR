package visitor;

import antlr.WenyanRBaseVisitor;
import antlr.WenyanRParser;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

// this class is for
// flush_statement
// if_statement
// for_statement
// return_statement
// BREAK
public class WenyanControlVisitor extends WenyanVisitor{
    public WenyanControlVisitor(WenyanFunctionEnvironment functionEnvironment) {
        super(functionEnvironment);
    }

    @Override
    public WenyanValue visitFlush_statement(WenyanRParser.Flush_statementContext ctx) {
        functionEnvironment.resultStack.empty();
        return null;
    }

    @Override
    public WenyanValue visitIf_statement(WenyanRParser.If_statementContext ctx) {
        if (new IfExprVisitor(functionEnvironment).visit(ctx.if_expression())) {
            WenyanMainVisitor visitor = new WenyanMainVisitor(functionEnvironment);
            for (WenyanRParser.StatementContext statementContext : ctx.if_) {
                visitor.visit(statementContext);
            }
        } else if (!ctx.else_.isEmpty()) {
            WenyanMainVisitor visitor = new WenyanMainVisitor(functionEnvironment);
            for (WenyanRParser.StatementContext statementContext : ctx.else_) {
                visitor.visit(statementContext);
            }
        }
        return null;
    }

    @Override
    public WenyanValue visitFor_arr_statement(WenyanRParser.For_arr_statementContext ctx) {
        WenyanValue value = new WenyanDataVisitor(functionEnvironment).visit(ctx.data());
        value = WenyanValue.constOf(value).casting(WenyanValue.Type.LIST);
        WenyanMainVisitor visitor = new WenyanMainVisitor(functionEnvironment);
        for (WenyanValue item : (WenyanValue.WenyanValueArray) value.getValue()) {
            functionEnvironment.setVariable(ctx.IDENTIFIER().getText(), item);
            try {
                for (WenyanRParser.StatementContext statementContext : ctx.statement()) {
                    visitor.visit(statementContext);
                }
            } catch (BreakException e) {
                break;
            } catch (ContinueException ignored) { // i.e. continue
            }
        }
        return null;
    }

    @Override
    public WenyanValue visitFor_enum_statement(WenyanRParser.For_enum_statementContext ctx) {
        WenyanValue value = new WenyanDataVisitor(functionEnvironment).visit(ctx.data());
        value = WenyanValue.constOf(value).casting(WenyanValue.Type.INT);
        int count = (int) value.getValue();
        WenyanMainVisitor visitor = new WenyanMainVisitor(functionEnvironment);
        for (int i = 0; i < count; i++) {
            try {
                for (WenyanRParser.StatementContext statementContext : ctx.statement()) {
                    visitor.visit(statementContext);
                }
            } catch (BreakException e) {
                break;
            } catch (ContinueException ignored) { // i.e. continue
            }
        }
        return null;
    }

    @Override
    public WenyanValue visitFor_while_statement(WenyanRParser.For_while_statementContext ctx) {
        WenyanMainVisitor visitor = new WenyanMainVisitor(functionEnvironment);
        while (true) {
            try {
                for (WenyanRParser.StatementContext statementContext : ctx.statement()) {
                    visitor.visit(statementContext);
                }
            } catch (BreakException e) {
                break;
            } catch (ContinueException ignored) { // i.e. continue
            }
        }
        return null;
    }

    @Override
    public WenyanValue visitBreak(WenyanRParser.BreakContext ctx) {
        throw new BreakException();
    }

    @Override
    public WenyanValue visitContinue(WenyanRParser.ContinueContext ctx) {
        throw new ContinueException();
    }

    @Override
    public WenyanValue visitReturn_data_statement(WenyanRParser.Return_data_statementContext ctx) {
        throw new ReturnException(new WenyanDataVisitor(functionEnvironment).visit(ctx.data()));
    }

    @Override
    public WenyanValue visitReturn_last_statement(WenyanRParser.Return_last_statementContext ctx) {
        throw new ReturnException(functionEnvironment.resultStack.peek());
    }

    @Override
    public WenyanValue visitReturn_void_statement(WenyanRParser.Return_void_statementContext ctx) {
        throw new ReturnException(null);
    }

    private static class IfExprVisitor extends WenyanRBaseVisitor<Boolean> {
        protected WenyanFunctionEnvironment functionEnvironment;

        public IfExprVisitor(WenyanFunctionEnvironment functionEnvironment) {
            this.functionEnvironment = functionEnvironment;
        }

        @Override
        public Boolean visitIf_data(WenyanRParser.If_dataContext ctx) {
            WenyanValue value = new WenyanDataVisitor(functionEnvironment).visit(ctx.data());
            value = WenyanValue.constOf(value).casting(WenyanValue.Type.BOOL);
            return (Boolean) value.getValue();
        }

        @Override
        public Boolean visitIf_logic(WenyanRParser.If_logicContext ctx) {
            WenyanValue left = new WenyanDataVisitor(functionEnvironment).visit(ctx.data(0));
            WenyanValue right = new WenyanDataVisitor(functionEnvironment).visit(ctx.data(1));
            left = WenyanValue.constOf(left);
            right = WenyanValue.constOf(right);
            return switch (ctx.if_logic_op().op.getType()) {
                case WenyanRParser.EQ -> left.equals(right);
                case WenyanRParser.NEQ -> !left.equals(right);
                case WenyanRParser.GT -> left.compareTo(right) > 0;
                case WenyanRParser.GTE -> left.compareTo(right) >= 0;
                case WenyanRParser.LT -> left.compareTo(right) < 0;
                case WenyanRParser.LTE -> left.compareTo(right) <= 0;
                default -> throw new RuntimeException("unknown operator");
            };
        }
    }

    public static class BreakException extends RuntimeException {
        public BreakException() {
            super("break");
        }
    }

    public static class ContinueException extends RuntimeException {
        public ContinueException() {
            super("continue");
        }
    }

    public static class ReturnException extends RuntimeException {
        public WenyanValue value;

        public ReturnException(WenyanValue value) {
            super("return");
            this.value = value;
        }
    }
}
