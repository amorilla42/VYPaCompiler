/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */package expression;

import tables.SymbolTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubStrFunctionDef extends FunctionDef{
    private static  ParamDefList parameters;
    static {
        List<ParamDef> paramList = new ArrayList<>(Arrays.asList(
                new ParamDef("string", "s"),
                new ParamDef("int", "from"),
                new ParamDef("int", "to")
        ));
        parameters = new ParamDefList(paramList);
    }
    public SubStrFunctionDef() {
        super(STRING_TYPE, "subStr", parameters, new CodeBlock(Collections.emptyList()));
    }

    @Override
    public void generateCode(SymbolTable st, codeGenerator.CodeGenerator cg){
        cg.addLine("LABEL subStr");
        cg.addLine("LTI $0 [$SP-3] 0");
        cg.addLine("JUMPNZ @emptySubStr $0");//check if the first elem of the string is the string terminator, which means the string is empty
        cg.addLine("GETSIZE $0 [$SP-2]");//get the size of the string
        cg.addLine("SET [$SP] $0");
        cg.addLine("LTI $0 [$SP-3] $0");//check if the from index is smaller than the size of the string
        cg.addLine("JUMPZ @emptySubStr $0");
        cg.addLine("SUBI $0 [$SP] [$SP-3]");//get the size of the substring
        cg.addLine("SET [$SP+1] $0");
        cg.addLine("GTI $0 [$SP-4] $0");//check if the to index is bigger than the size of the substring
        cg.addLine("JUMPZ @subStrCreate $0");
        cg.addLine("SET [$SP-4] [$SP+1]");
        cg.addLine("LABEL @subStrCreate");
        cg.addLine("CREATE $0 [$SP-4]"); //create the substring
        cg.addLine("SET [$SP+2] $0"); //save the substring address
        cg.addLine("SET [$SP+1] 0"); //set the index of the substring to 0
        cg.addLine("LABEL @subStrLoop"); //loop to copy the substring
        cg.addLine("GETWORD $0 [$SP-2] [$SP-3]"); //get the char from the string
        cg.addLine("SETWORD [$SP+2] [$SP+1] $0"); //set the char in the substring
        cg.addLine("ADDI $0 [$SP-3] 1"); //increment the index of the string
        cg.addLine("SET [$SP-3] $0");
        cg.addLine("ADDI $0 [$SP+1] 1");
        cg.addLine("SET [$SP+1] $0");
        cg.addLine("LTI $0 $0 [$SP-4]"); //check if the index of the substring is smaller than the size of the substring
        cg.addLine("JUMPNZ @subStrLoop $0");//if yes, loop
        cg.addLine("JUMP @endSubStr");//if not, end
        cg.addLine("LABEL @emptySubStr");//if the string is empty, return an empty string
        cg.addLine("CREATE $0 0");//create an empty string
        cg.addLine("SET [$SP+2] $0");//save the empty string address
        cg.addLine("LABEL @endSubStr");
        cg.addLine("SET $0 [$SP+2]");//return the substring address
        cg.addLine("RETURN [$SP-1]");//restore the PC
    }
}
