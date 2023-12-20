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
import exceptions.Error;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class App {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("argument missing: input file");
            System.exit(Error.VALUE_COMPILER);
        }
        if (args.length > 2) {
            System.err.println("too many arguments");
            System.exit(Error.VALUE_COMPILER);
        }

        String inFile = args[0];
        String outFile = null;
        if (args.length > 1) {
             outFile = args[1];
        }
        else {
            outFile = "out.vc";
        }

        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(outFile));
        } catch (Exception e) {
            System.err.println("cannot write to file");
            System.exit(Error.VALUE_COMPILER);
        }
        try {
            VYPAParser parser = parserFromFile(inFile);
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
                for (String s : codeGen.getTargetCode()){
                    printWriter.write(s);
                    printWriter.write("\n");
                }
                printWriter.close();
            }else {
                System.err.println("the inputFile is not a VYPALanguage program");
                System.exit(Error.VALUE_SYNTAX);
            }
        } catch (CustomException e) {
            System.err.println(e.getReturnValue());
            System.err.println(e.getMessage());
            System.exit(e.getReturnValue());
        }

    }

    private static VYPAParser parserFromFile(String filename) {
        VYPAParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(filename);
            VYPALexer lexer = new VYPALexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new VYPAParser(tokens);
        } catch (IOException e) {
            System.err.println("cannot read the input");
            System.exit(Error.VALUE_COMPILER);
        }
        return parser;
    }
}