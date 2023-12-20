/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import tables.SymbolTable;

import java.util.Objects;

public class FunctionDef extends Expression{
    private String type;
    private String identifier;
    private ParamDefList params;
    private Statements body;

    public FunctionDef(String type,String identifier, ParamDefList params, CodeBlock body){
        this.type=type;
        this.identifier = identifier;
        this.params = params;
        this.body = new Statements(body.getStatements());
    }

    public String getIdentifier() {
        return identifier;
    }

    public ParamDefList getParams() {
        return params;
    }

    public Statements getBody() {
        return body;
    }

    @Override
    public void checkType(SymbolTable st) {
        if (this.params != null) {
            params.checkType(st);
        }
        body.checkType(st);
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        cg.addLine("LABEL "+this.identifier);

        //parameters definitions
        this.params.generateCode(st,cg);
        //Params are in the local addresses and stored in user register in reverse
        // if N is the size of params, the first one is stored in ($SP-N-1)
        // and the last parameter is in ($SP-2)

        //definition of the body
        body.getStatements().forEach(statement -> statement.generateCode(st,cg));

        //restore the PC register if the function is void if not, it will be a return statement in the function
        if (this.type.equals(VOID_TYPE))
            cg.addLine("RETURN [$SP-1]");

        //remove local definitions
        cg.getAddrTable().clearLocalAdresses();
    }


}
