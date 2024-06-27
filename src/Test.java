import antlr.WenyanRLexer;
import antlr.WenyanRParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.WenyanMainVisitor;

public class Test {

    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("test.wy");
        WenyanRLexer lexer = new WenyanRLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WenyanRParser parser = new WenyanRParser(tokens);
        ParseTree tree = parser.program();

        WenyanMainVisitor eval = new WenyanMainVisitor();
        System.out.println(tree.toStringTree(parser));
        eval.visit(tree);
    }
}
