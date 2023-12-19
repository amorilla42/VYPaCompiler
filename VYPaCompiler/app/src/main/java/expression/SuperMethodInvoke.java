package expression;

import tables.SymbolTable;

public class SuperMethodInvoke extends Expression {

    private String methodId;
    private ExpressionList args;
    private ClassDef classDef;
    private ClassDef superDef;
    private String type;

    public SuperMethodInvoke(String id,ExpressionList args){
        this.methodId = id;
        this.args = args;
    }


    @Override
    public void checkType(SymbolTable st) {
        this.classDef = st.getCurrentClassDefinition();
        if (this.classDef == null)
            throw new RuntimeException("Using super outside of a class definition");
        this.superDef = this.classDef.getSuperClassDef();
        MethodDef method = st.getMethodDef(this.superDef.getName(), methodId);
        if (method == null)
            throw new RuntimeException("Super method: "+this.methodId+" does not exist");
        this.type = method.getType();
        st.checkTypes(method.getParams(),this.args);
    }

    @Override
    public String getType() {
        return type;
    }
}
