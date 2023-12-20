/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package vypacompiler;

import codeGenerator.CodeGenerator;
import exceptions.CustomErrorStrategy;
import exceptions.CustomException;
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

        try {
            String input = "int a; int main() { int b; b = 1; a = 2; return 0; }";
            CharStream stream = CharStreams.fromString(input);

            VYPALexer lexer = new VYPALexer(stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);


            VYPAParser parser = new VYPAParser(tokens);
            parser.setErrorHandler(new CustomErrorStrategy());
            ParseTree tree = parser.program();

            VYPAParserVisitor<AST> visitor = new VYPAParserVisitorImplementation();
            AST abstractSyntaxTree = visitor.visit(tree);


            if (abstractSyntaxTree instanceof Program) { //true if the root of the abstract syntax tree is a Program Type Node
                Program program = (Program) abstractSyntaxTree;
                SymbolTable st = new SymbolTable();
                program.checkType(st);
                CodeGenerator codeGen = new CodeGenerator(st);
                program.generateCode(st,codeGen);
                for (String s : codeGen.getTargetCode())
                    System.out.println(s);

            }

            System.out.println(tree.toStringTree(parser));

        } catch (CustomException e) {
            System.err.println(e.getReturnValue());
            System.err.println(e.getMessage());
            System.exit(e.getReturnValue());
        }

    }
}