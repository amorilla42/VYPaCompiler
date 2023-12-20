package vypacompiler;

import codeGenerator.CodeGenerator;
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


        String input = "void main(void) {int a; if(1==1){int a,b;}}";
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
            CodeGenerator codeGen = new CodeGenerator(st);
            program.generateCode(st,codeGen);
            int owo = 0;

        }

        System.out.println(tree.toStringTree(parser));

    }
}
