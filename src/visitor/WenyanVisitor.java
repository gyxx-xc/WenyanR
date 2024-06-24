package visitor;

import antlr.WenyanRBaseVisitor;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

import java.util.Stack;

public abstract class WenyanVisitor extends WenyanRBaseVisitor<WenyanValue> {
    protected WenyanFunctionEnvironment functionEnvironment;
    protected Stack<WenyanValue> reaultStack;

    public WenyanVisitor(WenyanFunctionEnvironment functionEnvironment, Stack<WenyanValue> reaultStack) {
        this.functionEnvironment = functionEnvironment;
        this.reaultStack = reaultStack;
    }
}
