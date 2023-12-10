package vypacompiler;

import expression.AST;
import expression.Program;
import expression.VYPAParserVisitorImplementation;
import parser.VYPALexer;
import parser.VYPAParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import parser.VYPAParserVisitor;


public class App {

    public static void main(String[] args) {


        String input = "int lmao=4; void main() { return 0;}";
        CharStream stream = CharStreams.fromString(input);

        VYPALexer lexer = new VYPALexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);


        VYPAParser parser = new VYPAParser(tokens);
        ParseTree tree = parser.program();

        VYPAParserVisitor<AST> visitor = new VYPAParserVisitorImplementation();
        AST abstractSyntaxTree = visitor.visit(tree);
        if (abstractSyntaxTree instanceof Program){ //true if the root of the abstract syntax tree is a Program Type Node
            Program program = (Program) abstractSyntaxTree;
            System.out.println(program.getGlobalVariableDefinitions().get(0).getIdentifier());
            System.out.println(program.getFunctionDefinitions().get(0).getType());
            System.out.println("i am a program");
        }

        System.out.println(tree.toStringTree(parser));

    }
}
