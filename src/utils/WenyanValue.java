package utils;

import java.util.function.Function;

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
        // case num
        if (isType(Type.INT) && other.isType(Type.INT)) {
            if (this.type == Type.INT) {
                if (other.type == Type.INT)
                    return new WenyanValue(Type.INT, (int) this.value - (int) other.value, true);
                else if (other.type == Type.DOUBLE)
                    return new WenyanValue(Type.DOUBLE, (int) this.value - (double) other.value, true);
                else
                    throw new RuntimeException("big int not implemented");
            } else if (this.type == Type.DOUBLE) {
                if (other.type == Type.INT)
                    return new WenyanValue(Type.DOUBLE, (double) this.value - (int) other.value, true);
                else if (other.type == Type.DOUBLE)
                    return new WenyanValue(Type.DOUBLE, (double) this.value - (double) other.value, true);
                else
                    throw new RuntimeException("big int not implemented");
            } else {
                throw new RuntimeException("big int not implemented");
            }
        }
        // case not num
        throw new RuntimeException("type cannot be subtracted");
    }

    public WenyanValue mul(WenyanValue other) {
        // case num
        if (isType(Type.INT) && other.isType(Type.INT)) {
            if (this.type == Type.INT) {
                if (other.type == Type.INT)
                    return new WenyanValue(Type.INT, (int) this.value * (int) other.value, true);
                else if (other.type == Type.DOUBLE)
                    return new WenyanValue(Type.DOUBLE, (int) this.value * (double) other.value, true);
                else
                    throw new RuntimeException("big int not implemented");
            } else if (this.type == Type.DOUBLE) {
                if (other.type == Type.INT)
                    return new WenyanValue(Type.DOUBLE, (double) this.value * (int) other.value, true);
                else if (other.type == Type.DOUBLE)
                    return new WenyanValue(Type.DOUBLE, (double) this.value * (double) other.value, true);
                else
                    throw new RuntimeException("big int not implemented");
            } else {
                throw new RuntimeException("big int not implemented");
            }
        }
        // case not num
        throw new RuntimeException("type cannot be multiplied");
    }

    public WenyanValue div(WenyanValue other) {
        // case num
        if (isType(Type.INT) && other.isType(Type.INT)) {
            if (this.type == Type.INT) {
                if (other.type == Type.INT)
                    return new WenyanValue(Type.INT, (double)((int) this.value) / (int) other.value, true);
                else if (other.type == Type.DOUBLE)
                    return new WenyanValue(Type.DOUBLE, (int) this.value / (double) other.value, true);
                else
                    throw new RuntimeException("big int not implemented");
            } else if (this.type == Type.DOUBLE) {
                if (other.type == Type.INT)
                    return new WenyanValue(Type.DOUBLE, (double) this.value / (int) other.value, true);
                else if (other.type == Type.DOUBLE)
                    return new WenyanValue(Type.DOUBLE, (double) this.value / (double) other.value, true);
                else
                    throw new RuntimeException("big int not implemented");
            } else {
                throw new RuntimeException("big int not implemented");
            }
        }
        // case not num
        throw new RuntimeException("type cannot be divided");
    }

    public WenyanValue not() {
        if (isType(Type.BOOL)) {
            return new WenyanValue(Type.BOOL, !(boolean) value, true);
        } else {
            throw new RuntimeException("type cannot be reversed");
        }
    }

    public WenyanValue mod(WenyanValue other) {
        // case num
        if (isType(Type.INT) && other.isType(Type.INT)) {
            if (this.type == Type.INT) {
                if (other.type == Type.INT)
                    return new WenyanValue(Type.INT, (int) this.value % (int) other.value, true);
                else if (other.type == Type.DOUBLE)
                    return new WenyanValue(Type.DOUBLE, (int) this.value % (double) other.value, true);
                else
                    throw new RuntimeException("big int not implemented");
            } else if (this.type == Type.DOUBLE) {
                if (other.type == Type.INT)
                    return new WenyanValue(Type.DOUBLE, (double) this.value % (int) other.value, true);
                else if (other.type == Type.DOUBLE)
                    return new WenyanValue(Type.DOUBLE, (double) this.value % (double) other.value, true);
                else
                    throw new RuntimeException("big int not implemented");
            } else {
                throw new RuntimeException("big int not implemented");
            }
        }
        // case not num
        throw new RuntimeException("type cannot be modulated");
    }

    public WenyanValue combine(WenyanValue other) {
        if (isType(Type.LIST) && other.isType(Type.LIST)) {
            return null;
        } else {
            throw new RuntimeException("type cannot be combined");
        }
    }

    public boolean equals(WenyanValue other) {
        if (isType(Type.LIST) || other.isType(Type.LIST)) {
            throw new RuntimeException("type does not support equals");
        }
        return this.value.equals(other.value);
    }

    public int compareTo(WenyanValue other) {
        // case num
        if (isType(Type.INT) && other.isType(Type.INT)) {
            if (this.type == Type.INT) {
                if (other.type == Type.INT)
                    return Integer.compare((int) this.value, (int) other.value);
                else if (other.type == Type.DOUBLE)
                    return Double.compare((int) this.value, (double) other.value);
                else
                    throw new RuntimeException("big int not implemented");
            } else if (this.type == Type.DOUBLE) {
                if (other.type == Type.INT)
                    return Double.compare((double) this.value, (int) other.value);
                else if (other.type == Type.DOUBLE)
                    return Double.compare((double) this.value, (double) other.value);
                else
                    throw new RuntimeException("big int not implemented");
            } else {
                throw new RuntimeException("big int not implemented");
            }
        }
        throw new RuntimeException("type does not support compare");
    }
}
