package expression;

import exceptions.SemanticException;
import exceptions.SemanticTypeException;
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


    /**
     * This method checks the type of the super method invocation.
     * It retrieves the current class definition from the symbol table and checks if it's null.
     * If it's null, it throws a semantic exception because super cannot be used outside of a class definition.
     * It then retrieves the superclass definition and the method definition from the symbol table.
     * If the method definition is null, it throws a semantic exception because the super method does not exist.
     * It then sets the type of the super method invocation to the type of the method and checks the types of the parameters and arguments.
     *
     * @param st The symbol table to use for type checking.
     * @throws SemanticException If super is used outside of a class definition or if the super method does not exist.
     */
    @Override
    public void checkType(SymbolTable st) {
        this.classDef = st.getCurrentClassDefinition();
        if (this.classDef == null)
            throw new SemanticException("Using super outside of a class definition");
        this.superDef = this.classDef.getSuperClassDef();
        MethodDef method = st.getMethodDef(this.superDef.getName(), methodId);
        if (method == null)
            throw new SemanticException("Super method: "+this.methodId+" does not exist");
        this.type = method.getType();
        st.checkTypes(method.getParams(),this.args);
    }

    @Override
    public String getType() {
        return type;
    }
}
