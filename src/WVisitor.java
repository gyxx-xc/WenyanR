import antlr.WenyanRBaseVisitor;
import antlr.WenyanRLexer;
import antlr.WenyanRParser;

import java.util.Stack;

public class WVisitor extends WenyanRBaseVisitor<WenyanValue> {
    Stack<WenyanValue> resultStack = new Stack<>();

    @Override
    public WenyanValue visitDeclare_statement(WenyanRParser.Declare_statementContext ctx) {
        System.out.println(ctx.d.getType());
        return super.visitDeclare_statement(ctx);
    }
}
