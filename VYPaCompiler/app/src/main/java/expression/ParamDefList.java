/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.Address;
import codeGenerator.CodeGenerator;
import tables.SymbolTable;

import java.util.List;

public class ParamDefList extends AST{
    private List<ParamDef> parameters;

    public ParamDefList(List<ParamDef> par){
        this.parameters = par;
    }

    public List<ParamDef> getParameters() {
        return parameters;
    }

    @Override
    public void checkType(SymbolTable st) {
        if (parameters != null) {
            parameters.forEach(ast -> ast.checkType(st));
        }
    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        int relativeAddress = -2;
        if (parameters!=null){
            for (ParamDef param : parameters){
                cg.getAddrTable().addParam(param.getName(), new Address(Address.Type.STACK_REL, relativeAddress--));
            }
        }
    }



}
