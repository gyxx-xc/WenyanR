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

    public WenyanValue add(WenyanValue other) {
        if (this.type != other.type)
            throw new RuntimeException("type does not match");
        if (this.type == Type.BOOL)
            throw new RuntimeException("cannot add bool");
        return new WenyanValue(this.type,
                switch (this.type) {
                    case BOOL -> throw new RuntimeException("not reachable");
                    case NUMBER -> (double) this.value + (double) other.value;
                    case STRING -> (String) this.value + other.value;
                    case LIST -> null;
                }, true);
    }

    public WenyanValue sub(WenyanValue arg) {
        return null;
    }

    public WenyanValue mul(WenyanValue arg) {
        return null;
    }

    public WenyanValue div(WenyanValue arg) {
        return null;
    }

    public WenyanValue not() {
        return null;
    }

    public WenyanValue combine(WenyanValue arg) {
        return null;
    }
}
