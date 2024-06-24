package visitor;

import antlr.WenyanRBaseVisitor;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

public abstract class WenyanExecVisitor extends WenyanRBaseVisitor<WenyanValue> {
    protected WenyanFunctionEnvironment functionEnvironment;

    public WenyanExecVisitor(WenyanFunctionEnvironment functionEnvironment) {
        this.functionEnvironment = functionEnvironment;
    }
}
