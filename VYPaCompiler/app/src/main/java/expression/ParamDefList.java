package expression;

import tables.SymbolTable;

import java.util.List;

public class ParamDefList extends AST{
    private List<ParamDef> parameters;

    public ParamDefList(List<ParamDef> par){
        this.parameters = par;
    }

    public List<ParamDef> getParameters() {
        return parameters;
    }

    @Override
    public void checkType(SymbolTable st) {
        if (parameters != null) {
            parameters.forEach(ast -> ast.checkType(st));
        }
    }
}
