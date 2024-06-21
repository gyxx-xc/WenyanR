import antlr.WenyanRBaseVisitor;
import antlr.WenyanRParser;

import java.math.BigInteger;
import java.util.HashMap;

public class DataVisitor extends WenyanRBaseVisitor<WenyanValue> {
    @Override
    public WenyanValue visitData_primary(WenyanRParser.Data_primaryContext ctx) {
        try {
            switch (ctx.data_type.getType()) {
                case WenyanRParser.BOOL_VALUE:
                    System.out.println("bool");
                    return new WenyanValue(WenyanValue.Type.BOOL,
                            WenyanBoolPhaser.parseBool(ctx.BOOL_VALUE().getText()), true);
                case WenyanRParser.INT_NUM:
                    System.out.println("int");
                    String intString = WenyanNumPhaser.parseIntString(ctx.INT_NUM().getText());
                    if (intString.length() < 9) {
                        return new WenyanValue(WenyanValue.Type.INT, Integer.parseInt(intString), true);
                    } else {
                        return new WenyanValue(WenyanValue.Type.BIG_INT, new BigInteger(intString), true);
                    }
                case WenyanRParser.FLOAT_NUM:
                    System.out.println("float");
                    return new WenyanValue(WenyanValue.Type.FLOAT,
                            WenyanNumPhaser.parseFloat(ctx.FLOAT_NUM().getText()),
                            true);
                case WenyanRParser.STRING_LITERAL:
                    System.out.println("string");
                    return new WenyanValue(WenyanValue.Type.STRING,
                            WenyanStringPhaser.parseString(ctx.STRING_LITERAL().getText()), true);
                default:
                    throw new RuntimeException("unknown data type");
            }
        } catch (WenyanNumPhaser.WenyanNumberException | WenyanDataException e) {
            // TODO: need better error handling
            System.out.println(e.getMessage());
            throw new RuntimeException("error");
        }
    }

    private static class WenyanBoolPhaser {
        private static final HashMap<String, Boolean> BOOL_MAP = new HashMap<>() {{
            put("陰", false);
            put("陽", true);
        }};

        public static boolean parseBool(String text) throws WenyanDataException {
            if (BOOL_MAP.containsKey(text))
                return BOOL_MAP.get(text);
            else
                throw new WenyanDataException("invalid bool value");
        }
    }

    private static class WenyanStringPhaser {
        public static String parseString(String text) {
            return text.substring(2, text.length() - 2);
        }
    }

    public static class WenyanDataException extends Exception {
        public WenyanDataException(String message) {
            super(message);
        }
    }
}
