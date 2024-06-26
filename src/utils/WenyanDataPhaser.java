package utils;

import java.util.HashMap;
import java.util.HashSet;

public class WenyanDataPhaser {
    public static HashMap<String, Integer> DIGIT = new HashMap<>() {{
        put("〇", 0);
        put("又", 0);
        put("零", 0);
        put("一", 1);
        put("二", 2);
        put("三", 3);
        put("四", 4);
        put("五", 5);
        put("六", 6);
        put("七", 7);
        put("八", 8);
        put("九", 9);
    }};

    public static HashMap<String, Integer> EXP = new HashMap<>() {{
        put("十", 1);
        put("百", 2);
        put("千", 3);
        put("萬", 4);
        put("億", 8);
        put("兆", 12);
        put("京", 16);
        put("垓", 20);
        put("秭", 24);
        put("穰", 28);
        put("溝", 32);
        put("澗", 36);
        put("正", 40);
        put("載", 44);
        put("極", 48);
    }};

    public static HashSet<String> SIGN = new HashSet<>() {{
        add("負");
    }};

    public static HashSet<String> FLOAT_DIVISION = new HashSet<>() {{
        add("又");
    }};

    public static HashMap<String, Integer> FLOAT_EXP = new HashMap<>() {{
        put("分", -1);
        put("釐", -2);
        put("毫", -3);
        put("絲", -4);
        put("忽", -5);
        put("微", -6);
        put("纖", -7);
        put("沙", -8);
        put("塵", -9);
        put("埃", -10);
        put("渺", -11);
        put("漠", -12);
    }};

    private static final HashMap<String, Boolean> BOOL_MAP = new HashMap<>() {{
        put("陰", false);
        put("陽", true);
    }};

    private static final HashMap<String, WenyanValue.Type> TYPE_MAP = new HashMap<>() {{
        put("爻", WenyanValue.Type.BOOL);
        put("數", WenyanValue.Type.DOUBLE);
        put("言", WenyanValue.Type.STRING);
        put("列", WenyanValue.Type.LIST);
    }};

    public static int parseInt(String text) throws WenyanNumberException {
        if (SIGN.contains(text.substring(0, 1)))
            return -parseInt(text.substring(1));
        Num num = parseIntHelper(text);
        return Integer.parseInt(num.num + "0".repeat(num.exp));
    }

    public static double parseFloat(String text) throws WenyanNumberException, NumberFormatException {
        for (String div : FLOAT_DIVISION) {
            if (text.contains(div)) {
                String[] parts = text.split(div);
                if (parts.length != 2)
                    throw new WenyanNumberException("invalid float number");
                // parts 1
                double result = parseInt(parts[0]);
                // parts 2 (Int FLOAT_EXP)+
                int last = 0;
                for (int i = 0; i < parts[1].length(); i ++) {
                    if (FLOAT_EXP.containsKey(parts[1].substring(i, i+1))) {
                        result += Double.parseDouble(parseInt(parts[1].substring(last, i))
                                +"e"+FLOAT_EXP.get(parts[1].substring(i, i+1)));
                        last = i + 1;
                    }
                }
                return result;
            }
        }
        throw new WenyanNumberException("invalid float number");
    }

    public static boolean parseBool(String text) throws WenyanDataException {
        if (BOOL_MAP.containsKey(text))
            return BOOL_MAP.get(text);
        else
            throw new WenyanDataException("invalid bool value");
    }

    public static String parseString(String text) {
        return text.substring(2, text.length() - 2);
    }

    public static WenyanValue.Type parseType(String text) throws WenyanDataException {
        if (TYPE_MAP.containsKey(text))
            return TYPE_MAP.get(text);
        else
            throw new WenyanDataException("invalid data type");
    }

    private static Num parseIntHelper(String num) throws WenyanNumberException {
        if (num.isEmpty())
            return new Num("", 0);
        String lastChar = num.substring(num.length() - 1);
        if (EXP.containsKey(lastChar)) {
            // case of (num EXP num EXP) 一萬一百
            for (int i = num.length() - 2; i >= 0; i--) {
                if (EXP.containsKey(num.substring(i, i+1))
                        && EXP.get(num.substring(i, i+1)) > EXP.get(lastChar)) {

                    Num l = parseIntHelper(num.substring(0, i+1));
                    Num r;
                    // if (num EXP 0 num EXP) 一萬零一百
                    if (DIGIT.containsKey(num.substring(i+1, i+2))
                            && DIGIT.get(num.substring(i+1, i+2)) == 0)
                        r = parseIntHelper(num.substring(i+2));
                    else
                        r = parseIntHelper(num.substring(i+1));
                    return l.add(r);
                }
            }
            // case of (EXP) 萬
            if (num.length() == 1)
                return new Num("1", EXP.get(lastChar));
            // case of (num EXP) 一百萬
            return parseIntHelper(num.substring(0, num.length() - 1)).shift(EXP.get(lastChar));
        } else if (DIGIT.containsKey(lastChar)) {
            // case of (num EXP num EXP) 一萬一
            for (int i = num.length() - 2; i >= 0; i--) {
                if (EXP.containsKey(num.substring(i, i+1))) {
                    Num l = parseIntHelper(num.substring(0, i+1));
                    Num r;
                    // if (num EXP 0 num EXP) 一萬零一
                    if (DIGIT.containsKey(num.substring(i+1, i+2))
                            && DIGIT.get(num.substring(i+1, i+2)) == 0)
                        r = parseIntHelper(num.substring(i+2));
                    else
                        r = parseIntHelper(num.substring(i+1));
                    return l.add(r);
                }
            }
            // case of (num) 一
            StringBuilder res = new StringBuilder();
            boolean zero = true;
            for (int i = 0; i < num.length(); i++) {
                if (!DIGIT.containsKey(num.substring(i, i+1)))
                    throw new WenyanNumberException("unexpected character");
                if (zero && DIGIT.get(num.substring(i, i+1)) != 0)
                    zero = false;
                if (!zero)
                    res.append(DIGIT.get(num.substring(i, i+1)));
            }
            if (zero)
                return new Num("0", 0);
            else
                return new Num(res.toString(), 0);
        } else {
            throw new WenyanNumberException("unexpected character");
        }
    }

    private static class Num {
        String num;
        int exp;

        Num(String num, int exp) {
            this.num = num;
            this.exp = exp;
        }

        Num add(Num other) throws WenyanNumberException {
            if (exp - other.exp < other.num.length())
                throw new WenyanNumberException("invalid number");
            return new Num(
                    num + "0".repeat(exp - other.exp - other.num.length()) + other.num,
                    other.exp);
        }

        Num shift(int exp) {
            if (num.equals("0"))
                return this;
            else
                return new Num(this.num, this.exp + exp);
        }
    }

    public static class WenyanNumberException extends RuntimeException {
        public WenyanNumberException(String message) {
            super(message);
        }
    }

    public static class WenyanDataException extends RuntimeException {
        public WenyanDataException(String message) {
            super(message);
        }
    }

//    public static void main(String[] args) throws WenyanNumberException {
//        System.out.println(parseInt("一百二十三"));
//        System.out.println(parseInt("一二三"));
//        System.out.println(parseInt("一百十萬一百"));
//        System.out.println(parseInt("一百二十三萬零一一百"));
//        System.out.println(parseInt("一百百二十十一一"));
//        System.out.println(parseInt("一百二十三萬零"));
//        System.out.println(parseFloat("一一又一分"));
//    }
}
