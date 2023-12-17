package expression;

import tables.SymbolTable;

public class MethodDef extends AST{
    private String name;
    private ParamDefList params;
    private String type;
    private CodeBlock body;
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public ParamDefList getParams() {
        return params;
    }


    public CodeBlock getBody() {
        return body;
    }



    public MethodDef(String type, String name, ParamDefList params, CodeBlock body) {
        this.type = type;
        this.name = name;
        this.params = params;
        this.body = body;
    }


    @Override
    public void checkType(SymbolTable st) {

    }
}
