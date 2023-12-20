/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import tables.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvokeExpression extends Expression {

    private String type;
    private String funcId;
    private ExpressionList args;

    public FunctionInvokeExpression(String id, ExpressionList arguments){
        this.args = arguments;
        this.funcId= id;
    }

    ExpressionList getArgs(){return this.args;}

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void checkType(SymbolTable st) {
        args.checkType(st);
        FunctionDef functionDef = st.getFunctionDef(funcId);
        type = functionDef.getType();
        st.checkTypes(functionDef.getParams(), args);

    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
       int localVarsSize = cg.getAddrTable().localVarsSize();
       int argsSize = args.getExpressions().size();
       List<String> argsAdresses = new ArrayList<>();
       for (Expression expr : args.getExpressions()){
          argsAdresses.add(cg.generateExpression(expr));
       }
       int offSetSP = localVarsSize + argsSize + 1; // +1 for the return address ($SP)
        for (int i = 0; i< argsSize; i++){
            int paramOffset = offSetSP - 2 - i;// -2 because of the return address and the old $SP, is never less than 0
            cg.addLine("SET [$SP+" + paramOffset + "] "+ argsAdresses.get(i));
        }
        cg.addLine("ADDI $SP $SP " + offSetSP);
        cg.addLine("CALL [$SP-1] " + this.funcId); //call the function, the return value is stored in $0
        cg.addLine("SUBI $SP $SP " + offSetSP); //restore SP to the previous value (local SP)
    }

}
