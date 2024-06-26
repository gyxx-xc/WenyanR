package visitor;

import antlr.WenyanRBaseVisitor;
import antlr.WenyanRParser;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

import java.util.Stack;

// this class is for
// flush_statement
// if_statement
// for_statement
// return_statement
// BREAK
public class WenyanControlVisitor extends WenyanVisitor{
    public WenyanControlVisitor(WenyanFunctionEnvironment functionEnvironment, Stack<WenyanValue> reultStack) {
        super(functionEnvironment, reultStack);
    }

    @Override
    public WenyanValue visitFlush_statement(WenyanRParser.Flush_statementContext ctx) {
        reultStack.empty();
        return null;
    }

    @Override
    public WenyanValue visitIf_statement(WenyanRParser.If_statementContext ctx) {
        if (new IfExprVisitor(functionEnvironment, reultStack).visit(ctx.if_expression())) {
            WenyanMainVisitor visitor = new WenyanMainVisitor(functionEnvironment, reultStack);
            for (WenyanRParser.StatementContext statementContext : ctx.if_) {
                visitor.visit(statementContext);
            }
        } else if (!ctx.else_.isEmpty()) {
            WenyanMainVisitor visitor = new WenyanMainVisitor(functionEnvironment, reultStack);
            for (WenyanRParser.StatementContext statementContext : ctx.else_) {
                visitor.visit(statementContext);
            }
        }
        return null;
    }

    @Override
    public WenyanValue visitFor_arr_statement(WenyanRParser.For_arr_statementContext ctx) {
        throw new RuntimeException("not implemented");
    }

    @Override
    public WenyanValue visitFor_enum_statement(WenyanRParser.For_enum_statementContext ctx) {
        WenyanValue value = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data());
        if (!value.isType(WenyanValue.Type.INT))
            throw new RuntimeException("for enum must be int");
        int count = (int) value.getValue();
        WenyanMainVisitor visitor = new WenyanMainVisitor(functionEnvironment, reultStack);
        for (int i = 0; i < count; i++) {
            try {
                for (WenyanRParser.StatementContext statementContext : ctx.statement()) {
                    visitor.visit(statementContext);
                }
            } catch (BreakException e) {
                break;
            }
        }
        return null;
    }

    @Override
    public WenyanValue visitFor_while_statement(WenyanRParser.For_while_statementContext ctx) {
        WenyanMainVisitor visitor = new WenyanMainVisitor(functionEnvironment, reultStack);
        while (true) {
            try {
                for (WenyanRParser.StatementContext statementContext : ctx.statement()) {
                    visitor.visit(statementContext);
                }
            } catch (BreakException e) {
                break;
            }
        }
        return null;
    }

    @Override
    public WenyanValue visitBreak(WenyanRParser.BreakContext ctx) {
        throw new BreakException();
    }

    private static class IfExprVisitor extends WenyanRBaseVisitor<Boolean> {
        protected WenyanFunctionEnvironment functionEnvironment;
        protected Stack<WenyanValue> reultStack;

        public IfExprVisitor(WenyanFunctionEnvironment functionEnvironment, Stack<WenyanValue> reultStack) {
            this.functionEnvironment = functionEnvironment;
            this.reultStack = reultStack;
        }

        @Override
        public Boolean visitIf_data(WenyanRParser.If_dataContext ctx) {
            WenyanValue value = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data());
            if (value.isType(WenyanValue.Type.BOOL)) {
                return (Boolean) value.getValue();
            } else {
                throw new RuntimeException("if expression must be bool");
            }
        }

        @Override
        public Boolean visitIf_logic(WenyanRParser.If_logicContext ctx) {
            WenyanValue left, right;
            switch (ctx.if_logic_op().op.getType()) {
                case WenyanRParser.EQ :
                    left = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(0));
                    right = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(1));
                    return left.equals(right);
                case WenyanRParser.NEQ :
                    left = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(0));
                    right = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(1));
                    return !left.equals(right);
                case WenyanRParser.GT :
                    left = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(0));
                    right = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(1));
                    return left.compareTo(right) > 0;
                case WenyanRParser.GTE :
                    left = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(0));
                    right = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(1));
                    return left.compareTo(right) >= 0;
                case WenyanRParser.LT :
                    left = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(0));
                    right = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(1));
                    return left.compareTo(right) < 0;
                case WenyanRParser.LTE :
                    left = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(0));
                    right = new WenyanDataVisitor(functionEnvironment, reultStack).visit(ctx.data(1));
                    return left.compareTo(right) <= 0;
                default:
                    throw new RuntimeException("unknown operator");
            }
        }
    }

    private static class BreakException extends RuntimeException {
        public BreakException() {
            super("break");
        }
    }
}
