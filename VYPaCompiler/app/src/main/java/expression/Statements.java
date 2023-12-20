package expression;

import exceptions.SyntaxException;
import tables.SymbolTable;

import java.util.List;

public class Statements extends AST {

    private List<AST> statements;

    public Statements(List<AST> st){
        this.statements=st;
    }

    public List<AST> getStatements() {
        return statements;
    }

    @Override
    public void checkType(SymbolTable st) {
        boolean returnFound = false;
        for (AST ast : statements) {
            ast.checkType(st);
            if (returnFound) {
                throw new SyntaxException("no statement after return allowed");
            }
            if (ast instanceof ReturnStatement) {
                returnFound = true;
            }
        }
    }
}
