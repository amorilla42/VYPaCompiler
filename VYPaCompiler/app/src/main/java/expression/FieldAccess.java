package expression;

import exceptions.SemanticTypeException;
import tables.SymbolTable;

public class FieldAccess extends Expression{

    private String type;
    private String identifier;
    private Expression father; //The expression just before this one

    public FieldAccess(String id){
        this.identifier = id;
    }

    public void setFather(Expression father) {
        this.father = father;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Expression getFather() {
        return father;
    }

    @Override
    public void checkType(SymbolTable st) {
        father.checkType(st);
        if (st.getClassDef(father.getType()) == null) {
            throw new SemanticTypeException("Accessing field of a non-object.");
        }
        type = st.getFieldType(father.getType(), identifier);

    }

    @Override
    public String getType() {
        return type;
    }
}
