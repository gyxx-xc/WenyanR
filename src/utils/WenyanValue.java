package utils;

public class WenyanValue {
    public enum Type {
        BOOL,
        NUMBER,
        STRING,
        LIST
    }

    private final Type type;
    private Object value;
    private final boolean isConst;

    public WenyanValue(Type type, Object value, boolean isConst) {
        this.type = type;
        this.value = value;
        this.isConst = isConst;
    }

    public Type getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean isConst() {
        return isConst;
    }
}
