package expression;

import exceptions.SemanticTypeException;
import tables.SymbolTable;

public class VariableDef extends AST{

    private String type;
    private String identifier;
    private Expression expr;

    public VariableDef(String type,String identifier){
        this.type = type;
        this.identifier = identifier;
        this.expr = null;
    }

    public VariableDef(String type,String identifier, Expression expr){
        this.type = type;
        this.identifier = identifier;
        this.expr = expr;
    }

    public String getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Expression getExpr() {
        return expr;
    }

    @Override
    public void checkType(SymbolTable st) {
        st.addLocalDef(this);
        if (expr != null) {
            expr.checkType(st);
            if (!type.equals(expr.getType())) {
                throw new SemanticTypeException("type:" +type + " is not " + expr.getType());
            }
        }

    }
}
