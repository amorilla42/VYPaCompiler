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


        String input = "class Shape : Object {\n" +
                "int id;\n" +
                "void Shape(void) { print(\"constructor of Shape\"); }\n" +
                "string toString(void) { return \"instance of Shape \" + (string)this.id; }\n" +
                "}\n" +
                "class Rectangle : Shape {\n" +
                "int height, width;\n" +
                "string toString(void) { return super.toString()\n" +
                "+ \" - rectangle \" + (string)(this.area()); }\n" +
                "int area(void) { return this.height * this.width; }\n" +
                "}\n" +
                "void main(void) {\n" +
                "Rectangle r; r = new Rectangle;\n" +
                "r.id = 42; r.width = readInt(); r.height = readInt();\n" +
                "Shape s; s = r;\n" +
                "print(s.toString());\n" +
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
          //  program.checkType(st);
            int owo = 0;

        }

        System.out.println(tree.toStringTree(parser));

    }
}
