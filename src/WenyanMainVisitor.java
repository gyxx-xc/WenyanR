import antlr.WenyanRParser;

public class WenyanMainVisitor extends WenyanExecVisitor {
    public WenyanMainVisitor(WenyanFunctionEnvironment functionEnvironment) {
        super(functionEnvironment);
    }

    @Override
    public WenyanValue visitDeclare_statement(WenyanRParser.Declare_statementContext ctx) {
        System.out.println(ctx.d.getType());
        return super.visitDeclare_statement(ctx);
    }
}
