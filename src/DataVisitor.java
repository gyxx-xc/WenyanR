import antlr.WenyanRBaseVisitor;
import antlr.WenyanRParser;

import java.math.BigInteger;

public class DataVisitor extends WenyanRBaseVisitor<WenyanValue> {
    @Override
    public WenyanValue visitData_primary(WenyanRParser.Data_primaryContext ctx) {
        switch (ctx.type.getType()) {
            case WenyanRParser.BOOL_VALUE:
                System.out.println("bool");
                return new WenyanValue(WenyanValue.Type.BOOL, true, true);
            case WenyanRParser.INT_NUM:
                System.out.println("int");
                try {
                    String intString = WenyanNumPhaser.parseIntString(ctx.INT_NUM().getText());
                    if (intString.length() < 9) {
                        return new WenyanValue(WenyanValue.Type.INT, Integer.parseInt(intString), true);
                    } else {
                        return new WenyanValue(WenyanValue.Type.BIG_INT, new BigInteger(intString), true);
                    }
                } catch (WenyanNumPhaser.ChineseNumberException e) {
                    throw new RuntimeException(e);
                }
            case WenyanRParser.FLOAT_NUM:
                System.out.println("float");
                try {
                    return new WenyanValue(WenyanValue.Type.FLOAT,
                            WenyanNumPhaser.parseFloat(ctx.FLOAT_NUM().getText()),
                            true);
                } catch (WenyanNumPhaser.ChineseNumberException | NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            case WenyanRParser.STRING_LITERAL:
                System.out.println("string");
                return new WenyanValue(WenyanValue.Type.STRING, ctx.STRING_LITERAL().getText(), true);
            default:
                throw new RuntimeException("unknown data type");
        }
    }
}
