/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import tables.SymbolTable;

import java.util.Collections;

public class ToStringMethodDef extends MethodDef{
    public ToStringMethodDef() {
        super(AST.STRING_TYPE, "toString", new ParamDefList(Collections.emptyList()), new CodeBlock(Collections.emptyList()));
    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        cg.addLine("LABEL Object.toString");
        cg.addLine("INT2STRING $0 [$SP-2]");
        cg.addLine("RETURN [$SP-1]");
        cg.getAddrTable().clearLocalAdresses(); //in case of nested functions
    }
}
