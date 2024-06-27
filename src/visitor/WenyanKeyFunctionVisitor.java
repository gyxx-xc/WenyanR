package visitor;

import antlr.WenyanRBaseVisitor;
import antlr.WenyanRParser;
import utils.WenyanValue;

import java.util.Arrays;
import java.util.function.Function;

public class WenyanKeyFunctionVisitor extends WenyanRBaseVisitor<Function<WenyanValue[], WenyanValue>> {
    @Override
    public Function<WenyanValue[], WenyanValue> visitKey_function(WenyanRParser.Key_functionContext ctx) {
        return switch (ctx.op.getType()) {
            case WenyanRParser.ADD, WenyanRParser.ARRAY_COMBINE_OP -> argsCheck(2, args -> args[0].add(args[1]));
            case WenyanRParser.SUB -> argsCheck(2, args -> args[0].sub(args[1]));
            case WenyanRParser.MUL -> argsCheck(2, args -> args[0].mul(args[1]));
            case WenyanRParser.DIV -> argsCheck(2, args -> args[0].div(args[1]));
            case WenyanRParser.UNARY_OP -> argsCheck(1, args -> args[0].not());
            case WenyanRParser.ARRAY_ADD_OP -> argsCheck(2, args -> args[0].append(args[1]));
            case WenyanRParser.WRITE_KEY_FUNCTION -> writeKeyFunction();
            default -> throw new IllegalStateException("Unexpected value: " + ctx.op.getType());
        };
    }

    private static Function<WenyanValue[], WenyanValue> argsCheck(int n, Function<WenyanValue[], WenyanValue> function) {
        return args -> {
            if (args.length != n)
                throw new RuntimeException("number of arguments does not match");
            return function.apply(args);
        };
    }

    private static Function<WenyanValue[], WenyanValue> writeKeyFunction() {
        return args -> {
            System.out.println(Arrays.toString(args));
            return args[0];
        };
    }
}
