package expression;

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

    }
}
