package expression;

import tables.SymbolTable;

public class MethodDef extends AST{
    private String name;
    private ParamDefList params;
    private String type;
    private Statements body;
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public ParamDefList getParams() {
        return params;
    }


    public Statements getBody() {
        return body;
    }



    public MethodDef(String type, String name, ParamDefList params, Statements body) {
        this.type = type;
        this.name = name;
        this.params = params;
        this.body = body;
    }


    @Override
    public void checkType(SymbolTable st) {

    }
}
