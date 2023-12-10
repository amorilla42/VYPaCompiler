package expression;

import tables.SymbolTable;

public class ParamDef extends AST{
    private String type;
    private String name;

    public ParamDef(String type, String name){
        this.type = type;
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void checkType(SymbolTable st) {

    }

}
