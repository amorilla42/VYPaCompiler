package expression;

import exceptions.SemanticException;
import tables.SymbolTable;

public class IdentifierExpression extends Expression {

    private String identifier;
    private String type;

    public IdentifierExpression(String name) {
        this.identifier = name;
        type = null;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void checkType(SymbolTable st) {
        this.type = st.getType(identifier);
        if (type == null) {
            throw new SemanticException("Unknown type for variable " + identifier);
        }

    }
}
