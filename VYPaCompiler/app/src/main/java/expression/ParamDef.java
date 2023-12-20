/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import tables.SymbolTable;

public class ParamDef extends AST{
    private String type;
    private String name;

    public ParamDef(String type, String name){
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public void checkType(SymbolTable st) {
        st.addLocalDef(ParamDef.this);
    }

}
