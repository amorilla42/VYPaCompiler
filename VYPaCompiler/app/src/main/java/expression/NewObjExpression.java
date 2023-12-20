/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import exceptions.SemanticException;
import exceptions.SemanticTypeException;
import tables.SymbolTable;

public class NewObjExpression extends Expression{
    private String className;
    private ExpressionList params;
    private ClassDef classDef;

    public NewObjExpression(String className, ExpressionList params) {
        this.className = className;
        this.params = params;
    }

    /**
     * This method checks the type of the new object expression.
     * It checks the types of the parameters and retrieves the class definition from the symbol table.
     * If the class definition is null, it throws a semantic exception because the class name is invalid.
     * It then retrieves the constructor definition from the class definition and checks the types of the constructor parameters.
     * If the types of the constructor parameters do not match the types of the parameters, it throws a semantic type exception.
     *
     * @param st The symbol table to use for type checking.
     * @throws SemanticException If the class name is invalid.
     * @throws SemanticTypeException If the types of the constructor parameters do not match the types of the parameters.
     */
    @Override
    public void checkType(SymbolTable st) {
        params.checkType(st);
        classDef = st.getClassDef(className);
        if (classDef == null) {
            throw new SemanticException("Invalid class name");
        }
        MethodDef constructor = classDef.getConstructorDef();
        if (!st.checkTypes(constructor.getParams(), params)) {
            throw new SemanticTypeException("Wrong constructor parameters");
        }
    }

    @Override
    public String getType() {
        return className;
    }
}
