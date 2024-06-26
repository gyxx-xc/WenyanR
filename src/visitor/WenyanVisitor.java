package visitor;

import antlr.WenyanRBaseVisitor;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

import java.util.Stack;

public abstract class WenyanVisitor extends WenyanRBaseVisitor<WenyanValue> {
    protected WenyanFunctionEnvironment functionEnvironment;
    protected Stack<WenyanValue> reultStack;

    public WenyanVisitor(WenyanFunctionEnvironment functionEnvironment, Stack<WenyanValue> reultStack) {
        this.functionEnvironment = functionEnvironment;
        this.reultStack = reultStack;
    }
}
