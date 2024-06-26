package utils;

public class WenyanValue {

    public enum Type {
        INT, // used as default number type
        BIG_INT, // not implemented
        DOUBLE,
        BOOL,
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

    public static WenyanValue constOf(WenyanValue value) {
        return new WenyanValue(value.type, value.value, true);
    }

    public static WenyanValue varOf(WenyanValue value) {
        return new WenyanValue(value.type, value.value, false);
    }

    public boolean isType(Type type) {
        if (type == Type.INT) {
            return this.type == Type.INT || this.type == Type.BIG_INT || this.type == Type.DOUBLE;
        } else {
            return this.type == type;
        }
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
        // case num
        if (isType(Type.INT) && other.isType(Type.INT)) {
            if (this.type == Type.INT) {
                if (other.type == Type.INT)
                    return new WenyanValue(Type.INT, (int) this.value + (int) other.value, true);
                else if (other.type == Type.DOUBLE)
                    return new WenyanValue(Type.DOUBLE, (int) this.value + (double) other.value, true);
                else
                    throw new RuntimeException("big int not implemented");
            } else if (this.type == Type.DOUBLE) {
                if (other.type == Type.INT)
                    return new WenyanValue(Type.DOUBLE, (double) this.value + (int) other.value, true);
                else if (other.type == Type.DOUBLE)
                    return new WenyanValue(Type.DOUBLE, (double) this.value + (double) other.value, true);
                else
                    throw new RuntimeException("big int not implemented");
            } else {
                throw new RuntimeException("big int not implemented");
            }
        }
        // case not num
        if (this.type != other.type)
            throw new RuntimeException("type does not match");
        if (this.type == Type.BOOL)
            throw new RuntimeException("cannot add bool");
        return new WenyanValue(this.type,
                switch (this.type) {
                    case STRING -> (String) this.value + other.value;
                    case LIST -> null;
                    default -> throw new RuntimeException("not reachable");
                }, true);
    }

    public WenyanValue sub(WenyanValue other) {
        return null;
    }

    public WenyanValue mul(WenyanValue other) {
        return null;
    }

    public WenyanValue div(WenyanValue other) {
        return null;
    }

    public WenyanValue not() {
        return null;
    }

    public WenyanValue mod(WenyanValue other) {
        return null;
    }

    public WenyanValue combine(WenyanValue other) {
        if (isType(Type.LIST) && other.isType(Type.LIST)) {
            return null;
        } else {
            throw new RuntimeException("type does not match");
        }
    }
}
