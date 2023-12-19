package vypacompiler;

import expression.AST;
import expression.Program;
import expression.VYPAParserVisitorImplementation;
import parser.VYPALexer;
import parser.VYPAParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import parser.VYPAParserVisitor;
import tables.SymbolTable;


public class App {

    public static void main(String[] args) {


        String input = "void main(void) { // Program Main function\n" +
                "int a, res;\n" +
                "print(\"Enter an integer to compute its factorial:\");\n" +
                "a = readInt();\n" +
                "if (a < 0) {\n" +
                "print(\"\\nFactorial of a negative integer is undefined!\\n\"); }\n" +
                "else {\n" +
                "res = 1;\n" +
                "while (a > 0) {res = res * a; a = a - 1;\n" +
                "} // endwhile\n" +
                "print(\"\\nThe result is: \", res, \"\\n\");\n" +
                "} // endif\n" +
                "} ";
        CharStream stream = CharStreams.fromString(input);

        VYPALexer lexer = new VYPALexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);


        VYPAParser parser = new VYPAParser(tokens);
        ParseTree tree = parser.program();

        VYPAParserVisitor<AST> visitor = new VYPAParserVisitorImplementation();
        AST abstractSyntaxTree = visitor.visit(tree);




        if (abstractSyntaxTree instanceof Program){ //true if the root of the abstract syntax tree is a Program Type Node
            Program program = (Program) abstractSyntaxTree;
            SymbolTable st = new SymbolTable();

            program.checkType(st);


        }

        System.out.println(tree.toStringTree(parser));

    }
}
