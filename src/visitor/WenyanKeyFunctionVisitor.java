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
            case WenyanRParser.ADD -> argsCheck(2, args -> args[0].add(args[1]));
            case WenyanRParser.SUB -> argsCheck(2, args -> args[0].sub(args[1]));
            case WenyanRParser.MUL -> argsCheck(2, args -> args[0].mul(args[1]));
            case WenyanRParser.DIV -> argsCheck(2, args -> args[0].div(args[1]));
            case WenyanRParser.UNARY_OP -> argsCheck(1, args -> args[0].not());
            case WenyanRParser.ARRAY_ADD_OP -> arrayAddFunction();
            case WenyanRParser.ARRAY_COMBINE_OP -> arrayCombineFunction();
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

    public static Function<WenyanValue[], WenyanValue> writeKeyFunction() {
        return args -> {
            String result = "";
            for (WenyanValue arg : args) {
                result += (result.isEmpty()?"":" ") + arg.toString();
            }
            System.out.println(result);
            return new WenyanValue(WenyanValue.Type.STRING, result, true);
        };
    }

    public static Function<WenyanValue[], WenyanValue> arrayAddFunction() {
        return args -> {
            if (args.length <= 1)
                throw new RuntimeException("number of arguments does not match");
            for (int i = 1; i < args.length; i++) {
                args[0].append(args[i]);
            }
            return args[0];
        };
    }

    public static Function<WenyanValue[], WenyanValue> arrayCombineFunction() {
        return args -> {
            if (args.length <= 1)
                throw new RuntimeException("number of arguments does not match");
            for (int i = 1; i < args.length; i++) {
                args[0].add(args[i]);
            }
            return args[0];
        };
    }
}
