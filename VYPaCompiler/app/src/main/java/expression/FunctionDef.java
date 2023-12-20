/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import tables.SymbolTable;

public class FunctionDef extends Expression{
    private String type;
    private String identifier;
    private ParamDefList params;
    private Statements body;

    public FunctionDef(String type,String identifier, ParamDefList params, CodeBlock body){
        this.type=type;
        this.identifier = identifier;
        this.params = params;
        this.body = new Statements(body.getStatements());
    }

    public String getIdentifier() {
        return identifier;
    }

    public ParamDefList getParams() {
        return params;
    }

    public Statements getBody() {
        return body;
    }

    @Override
    public void checkType(SymbolTable st) {
        if (this.params != null) {
            params.checkType(st);
        }
        body.checkType(st);
    }

    @Override
    public String getType() {
        return type;
    }
}
