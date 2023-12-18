package expression;

import tables.SymbolTable;

public class ThisExpression extends Expression{

    private ClassDef instance;
    private String type = null;

    public ThisExpression(){}

    @Override
    public String getType() {
        return type;
    }


    @Override
    public void checkType(SymbolTable st) {
        instance = st.getCurrentClassDefinition();
        if (instance == null) {
            throw new RuntimeException("expression is outside class");
        }
        type = instance.getName();
    }


}
