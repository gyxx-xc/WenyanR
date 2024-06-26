package utils;

import java.util.HashMap;

public class WenyanValue {

    public enum Type {
        INT, // used as default number type
        DOUBLE,
        BOOL,
        STRING,
        LIST // not implemented
    }

    public static final HashMap<Type, Integer> TYPE_CASTING_ORDER = new HashMap<>() {{
        put(Type.LIST, 0);
        put(Type.STRING, 1);
        put(Type.DOUBLE, 2);
        put(Type.INT, 3);
        put(Type.BOOL, 4);
    }};

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

    public static WenyanValue constOf(WenyanValue value) {
        return new WenyanValue(value.type, value.value, true);
    }

    public static WenyanValue varOf(WenyanValue value) {
        return new WenyanValue(value.type, value.value, false);
    }

    public boolean isType(Type type) {
        if (type == Type.INT) {
            return this.type == Type.INT || this.type == Type.DOUBLE;
        } else {
            return this.type == type;
        }
    }

    // our purpose: auto casting
    // when?
    // all operator
    // function call
    // what to consider
    // required type != current type
    // narrow with wide -> auto cast to wide

    // what we need to do these function?
    // 1. wide link
    // 2. required type

    // 1. wide link
    // string -> big_int, double -> int -> bool

    // 2. required type
    // downgrade + wide link
    // double -> int
    // ~list -> bool
    // list -> string
    public WenyanValue casting(Type type) {
        if (this.type == type)
            return this;
        if (type == Type.INT) {
            if (this.type == Type.DOUBLE) {
                return new WenyanValue(Type.INT, (int) (double) value, isConst);
            }
            if (this.type == Type.BOOL) {
                return new WenyanValue(Type.INT, (boolean) value ? 1 : 0, isConst);
            }
        }
        if (type == Type.DOUBLE) {
            if (this.type == Type.INT) {
                return new WenyanValue(Type.DOUBLE, (double) (int) value, isConst);
            }
            if (this.type == Type.BOOL) {
                return new WenyanValue(Type.DOUBLE, (boolean) value ? 1.0 : 0.0, isConst);
            }
        }
        if (type == Type.STRING) {
            return new WenyanValue(Type.STRING, this.toString(), isConst);
        }
        if (type == Type.BOOL) {
            if (this.type == Type.INT) {
                return new WenyanValue(Type.BOOL, (int) value != 0, isConst);
            }
            if (this.type == Type.DOUBLE) {
                return new WenyanValue(Type.BOOL, (double) value != 0.0, isConst);
            }
            if (this.type == Type.STRING) {
                return new WenyanValue(Type.BOOL, !((String) value).isEmpty(), isConst);
            }
        }
        throw new WenyanTypeException("cannot cast " + this.type + " to " + type);
    }

    public Type widerType(Type type) {
        if (TYPE_CASTING_ORDER.get(this.type) < TYPE_CASTING_ORDER.get(type))
            return this.type;
        return type;
    }

    public WenyanValue add(WenyanValue other) {
        // require type >int
        Type addType = widerType(other.widerType(Type.INT)); // widest type in three
        WenyanValue left = this.casting(addType);
        WenyanValue right = other.casting(addType);
        return switch (addType) {
            case INT -> new WenyanValue(addType, (int) left.value + (int) right.value, true);
            case DOUBLE -> new WenyanValue(addType, (double) left.value + (double) right.value, true);
            case STRING -> new WenyanValue(addType, left.value.toString() + right.value.toString(), true);
            default -> throw new WenyanTypeException("type cannot be added");
        };
    }

    public WenyanValue sub(WenyanValue other) {
        // require type >int
        Type subType = widerType(other.widerType(Type.INT)); // widest type in three
        WenyanValue left = this.casting(subType);
        WenyanValue right = other.casting(subType);
        return switch (subType) {
            case INT -> new WenyanValue(subType, (int) left.value - (int) right.value, true);
            case DOUBLE -> new WenyanValue(subType, (double) left.value - (double) right.value, true);
            default -> throw new WenyanTypeException("type cannot be subtracted");
        };
    }

    public WenyanValue mul(WenyanValue other) {
        // require type >int
        Type mulType = widerType(other.widerType(Type.INT)); // widest type in three
        WenyanValue left = this.casting(mulType);
        WenyanValue right = other.casting(mulType);
        return switch (mulType) {
            case INT -> new WenyanValue(mulType, (int) left.value * (int) right.value, true);
            case DOUBLE -> new WenyanValue(mulType, (double) left.value * (double) right.value, true);
            default -> throw new WenyanTypeException("type cannot be multiplied");
        };
    }

    public WenyanValue div(WenyanValue other) {
        // require type double
        Type divType = widerType(other.widerType(Type.DOUBLE)); // widest type in three
        WenyanValue left = this.casting(divType);
        WenyanValue right = other.casting(divType);
        if (divType == Type.DOUBLE) {
            return new WenyanValue(divType, (double) left.value / (double) right.value, true);
        } else {
            throw new WenyanTypeException("type cannot be divided");
        }
    }

    public WenyanValue not() {
        // require type bool
        WenyanValue wenyanValue = this.casting(Type.BOOL);
        return new WenyanValue(Type.BOOL, !(boolean) wenyanValue.value, true);
    }

    public WenyanValue mod(WenyanValue other) {
        // require type >int
        Type modType = widerType(other.widerType(Type.INT)); // widest type in three
        WenyanValue left = this.casting(modType);
        WenyanValue right = other.casting(modType);
        return switch (modType) {
            case INT -> new WenyanValue(modType, (int) left.value % (int) right.value, true);
            case DOUBLE -> new WenyanValue(modType, (double) left.value % (double) right.value, true);
            default -> throw new WenyanTypeException("type cannot be mod");
        };
    }

    public WenyanValue append(WenyanValue other) {
        // require type this list, other any
        if (isType(Type.LIST)) {
            return null;
        } else {
            throw new RuntimeException("type cannot be append");
        }
    }

    public boolean equals(WenyanValue other) {
        Type eqType = widerType(other.type);
        WenyanValue left, right;
        try {
            left = this.casting(eqType);
            right = other.casting(eqType);
        } catch (WenyanTypeException e) {
            return false;
        }
        return switch (eqType) {
            case INT -> (int) left.value == (int) right.value;
            case DOUBLE -> (double) left.value == (double) right.value;
            case BOOL -> (boolean) left.value == (boolean) right.value;
            case STRING -> left.value.equals(right.value);
            default -> throw new WenyanTypeException("type cannot be compared");
        };
    }

    public int compareTo(WenyanValue other) {
        // require type >int
        Type cmpType = widerType(other.widerType(Type.INT)); // widest type in three
        WenyanValue left = this.casting(cmpType);
        WenyanValue right = other.casting(cmpType);
        return switch (cmpType) {
            case INT -> Integer.compare((int) left.value, (int) right.value);
            case DOUBLE -> Double.compare((double) left.value, (double) right.value);
            case STRING -> left.value.toString().compareTo(right.value.toString());
            default -> throw new WenyanTypeException("type cannot be compared");
        };
    }

    public static class WenyanTypeException extends RuntimeException {
        public WenyanTypeException(String message) {
            super(message);
        }
    }
}
