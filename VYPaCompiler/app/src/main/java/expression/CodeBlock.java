/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import exceptions.SyntaxException;
import tables.SymbolTable;

import java.util.List;

public class CodeBlock extends AST{

    private List<AST> statements;

    public CodeBlock(List<AST> statements){
        this.statements = statements;
    }

    public List<AST> getStatements() {
        return statements;
    }

    @Override
    public void checkType(SymbolTable st) {
        boolean foundReturn = false;
        st.pushLocalStack();
        for (AST ast : statements) {
            if (foundReturn) {
                throw new SyntaxException("Found statement following return.");
            }
            ast.checkType(st);
            if (ast instanceof ReturnStatement) {
                foundReturn = true;
            }
        }
        st.popLocalStack();

    }
    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        for (AST ast : statements) {
            ast.generateCode(st,cg);
        }
    }
}
