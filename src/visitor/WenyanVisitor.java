package visitor;

import antlr.WenyanRBaseVisitor;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

public abstract class WenyanVisitor extends WenyanRBaseVisitor<WenyanValue> {
    protected WenyanFunctionEnvironment functionEnvironment;

    public WenyanVisitor(WenyanFunctionEnvironment functionEnvironment) {
        this.functionEnvironment = functionEnvironment;
    }
}
