/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import codeGenerator.CodeGenerator;
import tables.SymbolTable;

import java.util.Collections;

public class ConcatDef extends FunctionDef{
    private static ParamDefList params;
    public ConcatDef() {
        super(STRING_TYPE, "+", params, new CodeBlock(Collections.emptyList()));
    }

    @Override
    public void generateCode(SymbolTable st, CodeGenerator cg) {
        String lenstr1 = "[$SP]";
        String lenstr2 = "[$SP+1]";
        String result = "[$SP+2]";
        String iterator = "[$SP+3]";

        cg.addLine("LABEL " + CONCAT_FUN_LABEL);
        cg.addLine("GETSIZE $0 [$SP-2]");
        cg.addLine("SET " + lenstr1 + " $0");
        cg.addLine("GETSIZE $0 [$SP-3]");
        cg.addLine("SET " + lenstr2 + " $0");
        cg.addLine("ADDI $0 " + lenstr1 + " " + lenstr2); //total length of the result string
        cg.addLine("SET " + result + " $0");
        cg.addLine("COPY $0 [$SP-2]");
        cg.addLine("RESIZE $0 " + result); //resize the result string which contains the first string at this point
        cg.addLine("SET " + result + " $0");
        cg.addLine("SET " + iterator + " 0");
        cg.addLine("LABEL @concatLoop"); //loop to copy the second string to the result string
        cg.addLine("LTI $0 " + iterator + " " + lenstr2); //if iterator < lenstr2
        cg.addLine("JUMPZ @concatEnd $0"); //if not, jump to the end
        cg.addLine("GETWORD $0 [$SP-3] " + iterator); //get the character at the iterator position
        cg.addLine("SETWORD " + result + " " + lenstr1 + " $0"); //set the character at the end of the result string
        cg.addLine("ADDI $0 1 " + iterator);
        cg.addLine("SET " + iterator + " $0"); //iterator++
        cg.addLine("ADDI $0 1 " + lenstr1); //lenstr1++
        cg.addLine("SET " + lenstr1 + " $0");
        cg.addLine("JUMP @concatLoop"); //jump to the beginning of the loop
        cg.addLine("LABEL @concatEnd"); //end of the loop
        cg.addLine("SET $0 " + result); //return the result string
        cg.addLine("RETURN [$SP-1]"); //restore the pc and return
    }


}
