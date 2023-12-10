package vypacompiler;

import parser.VYPALexer;
import parser.VYPAParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class App {

    public static void main(String[] args) {


        String input = "int main() { return 0;             }";
        CharStream stream = CharStreams.fromString(input);

        VYPALexer lexer = new VYPALexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);


        VYPAParser parser = new VYPAParser(tokens);
        ParseTree tree = parser.program();

        System.out.println(tree.toStringTree(parser));

    }
}
