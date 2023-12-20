/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */package expression;

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
}
