import antlr.WenyanRParser;

import java.math.BigInteger;

public class WenyanValue {
    public enum Type {
        BOOL,
        INT,
        BIG_INT,
        FLOAT,
        STRING,
        LIST
    }

    Type type;
    Object value;
    boolean isConst;

    public WenyanValue(Type type, Object value, boolean isConst) {
        this.type = type;
        this.value = value;
        this.isConst = isConst;
    }
}
