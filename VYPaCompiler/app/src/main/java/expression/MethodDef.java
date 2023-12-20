/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import tables.SymbolTable;

public class MethodDef extends AST{
    private String name;
    private ParamDefList params;
    private String type;
    private Statements body;
    private ClassDef classDef;
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

    public void setClassDef(ClassDef classDef) {
        this.classDef = classDef;
    }

    public void setBody(Statements body) {
        this.body = body;
    }

    public MethodDef(String type, String name, ParamDefList params, CodeBlock body) {
        this.type = type;
        this.name = name;
        this.params = params;
        this.body = new Statements(body.getStatements());
    }


    @Override
    public void checkType(SymbolTable st) {
        if (params != null) {
            params.checkType(st);
        }
        body.checkType(st);
        st.addMethodDef(classDef.getName(), this);

    }

    @Override
    public void generateCode(SymbolTable st, codeGenerator.CodeGenerator cg){

        return;
    }


}
