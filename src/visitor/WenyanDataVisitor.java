package visitor;

import antlr.WenyanRParser;
import utils.WenyanDataPhaser;
import utils.WenyanFunctionEnvironment;
import utils.WenyanValue;

public class WenyanDataVisitor extends WenyanVisitor {
    public WenyanDataVisitor(WenyanFunctionEnvironment functionEnvironment) {
        super(functionEnvironment);
    }

    @Override
    public WenyanValue visitData_primary(WenyanRParser.Data_primaryContext ctx) {
        return switch (ctx.data_type.getType()) {
            case WenyanRParser.BOOL_VALUE -> new WenyanValue(WenyanValue.Type.BOOL,
                    WenyanDataPhaser.parseBool(ctx.BOOL_VALUE().getText()), true);
            case WenyanRParser.INT_NUM -> new WenyanValue(WenyanValue.Type.INT,
                    WenyanDataPhaser.parseInt(ctx.INT_NUM().getText()), true);
            case WenyanRParser.FLOAT_NUM -> new WenyanValue(WenyanValue.Type.DOUBLE,
                    WenyanDataPhaser.parseFloat(ctx.FLOAT_NUM().getText()),
                    true);
            case WenyanRParser.STRING_LITERAL -> new WenyanValue(WenyanValue.Type.STRING,
                    WenyanDataPhaser.parseString(ctx.STRING_LITERAL().getText()), true);
            default -> throw new RuntimeException("unknown data type");
        };
    }

    @Override
    public WenyanValue visitId_last(WenyanRParser.Id_lastContext ctx) {
        WenyanValue value = this.functionEnvironment.resultStack.peek();
        if (value == null)
            throw new RuntimeException("last result is null");
        functionEnvironment.resultStack.empty();
        return value;
    }

    @Override
    public WenyanValue visitId(WenyanRParser.IdContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        return functionEnvironment.getVariable(id);
    }

    // TODO: maybe refactor this by calling function
    @Override
    public WenyanValue visitData_child(WenyanRParser.Data_childContext ctx) {
        WenyanValue parent = visit(ctx.data());
        switch (ctx.p.getType()) {
            case WenyanRParser.INT_NUM -> {
                WenyanValue index = new WenyanValue(WenyanValue.Type.INT,
                        WenyanDataPhaser.parseInt(ctx.INT_NUM().getText()), true);
                return ((WenyanValue.WenyanValueArray) parent.getValue()).get(index);
            }
            case WenyanRParser.IDENTIFIER -> {
                String id = ctx.IDENTIFIER().getText();
                WenyanValue value = functionEnvironment.getVariable(id);
                return ((WenyanValue.WenyanValueArray) parent.getValue()).get(value);
            }
            case WenyanRParser.DATA_ID_LAST -> {
                WenyanValue value = this.functionEnvironment.resultStack.peek();
                if (value == null)
                    throw new RuntimeException("last result is null");
                functionEnvironment.resultStack.empty();
                return ((WenyanValue.WenyanValueArray) parent.getValue()).get(value);
            }
            // TODO: change this very very bad code
            case 1 -> { // chang
                return new WenyanValue(WenyanValue.Type.INT,
                        ((WenyanValue.WenyanValueArray) parent.getValue()).size(), true);
            }
            default -> throw new RuntimeException("unknown data type");
        }
    }
}
