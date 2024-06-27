package visitor;

import antlr.WenyanRParser;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

import java.util.Stack;

public class WenyanMainVisitor extends WenyanVisitor {
    public WenyanMainVisitor(WenyanFunctionEnvironment functionEnvironment) {
        super(functionEnvironment);
    }

    public WenyanMainVisitor() {
        super(new WenyanFunctionEnvironment());
    }

    @Override
    public WenyanValue visitExpr_statement(WenyanRParser.Expr_statementContext ctx) {
        return new WenyanExprVisitor(functionEnvironment).visit(ctx);
    }

    @Override
    public WenyanValue visitControl_statement(WenyanRParser.Control_statementContext ctx) {
        return new WenyanControlVisitor(functionEnvironment).visit(ctx);
    }
}
