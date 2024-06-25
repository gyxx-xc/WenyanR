package visitor;

import antlr.WenyanRParser;
import utils.WenyanDataPhaser;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

import java.math.BigInteger;
import java.util.Stack;

public class WenyanDataVisitor extends WenyanVisitor {
    public WenyanDataVisitor(WenyanFunctionEnvironment functionEnvironment, Stack<WenyanValue> reaultStack) {
        super(functionEnvironment, reaultStack);
    }

    @Override
    public WenyanValue visitData_primary(WenyanRParser.Data_primaryContext ctx) {
        try {
            switch (ctx.data_type.getType()) {
                case WenyanRParser.BOOL_VALUE:
                    return new WenyanValue(WenyanValue.Type.BOOL,
                            WenyanDataPhaser.parseBool(ctx.BOOL_VALUE().getText()), true);
                case WenyanRParser.INT_NUM:
                    return new WenyanValue(WenyanValue.Type.NUMBER,
                            WenyanDataPhaser.parseInt(ctx.INT_NUM().getText()), true);
                case WenyanRParser.FLOAT_NUM:
                    return new WenyanValue(WenyanValue.Type.NUMBER,
                            WenyanDataPhaser.parseFloat(ctx.FLOAT_NUM().getText()),
                            true);
                case WenyanRParser.STRING_LITERAL:
                    return new WenyanValue(WenyanValue.Type.STRING,
                            WenyanDataPhaser.parseString(ctx.STRING_LITERAL().getText()), true);
                default:
                    throw new RuntimeException("unknown data type");
            }
        } catch (WenyanDataPhaser.WenyanNumberException | WenyanDataPhaser.WenyanDataException e) {
            // TODO: need better error handling
            System.out.println(e.getMessage());
            throw new RuntimeException("error");
        }
    }

    @Override
    public WenyanValue visitId_last(WenyanRParser.Id_lastContext ctx) {
        return this.reaultStack.peek();
    }

    @Override
    public WenyanValue visitId_last_with_self(WenyanRParser.Id_last_with_selfContext ctx) {
        return this.reaultStack.peek();
    }

    @Override
    public WenyanValue visitId(WenyanRParser.IdContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        return this.functionEnvironment.getVariable(id.substring(1, id.length() - 1));
    }

}
