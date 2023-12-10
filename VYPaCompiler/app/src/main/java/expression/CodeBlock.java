package expression;

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

    }
}
