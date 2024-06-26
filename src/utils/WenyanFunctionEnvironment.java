package utils;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;

public class WenyanFunctionEnvironment {
    private final WenyanFunctionEnvironment parentEnvironment;
    private final HashMap<String, WenyanValue> variables;
    private final HashMap<String, ParserRuleContext> functions;

    public WenyanFunctionEnvironment(WenyanFunctionEnvironment parentEnvironment) {
        this.parentEnvironment = parentEnvironment;
        this.variables = new HashMap<>();
        this.functions = new HashMap<>();
    }

    public WenyanFunctionEnvironment() {
        this.parentEnvironment = null;
        this.variables = new HashMap<>();
        this.functions = new HashMap<>();
    }

    public WenyanValue getVariable(String id) {
        return variables.get(id);
    }

    public void setVariable(String id, WenyanValue value) {
        variables.put(id, value);
    }

    public boolean hasVariable(String id) {
        return variables.containsKey(id);
    }
}
