package expression;

import java.util.Collections;

public class ConcatDef extends FunctionDef{
    public ConcatDef(String type, String identifier, ParamDefList params, CodeBlock body) {
        super(STRING_TYPE, "+", params, new CodeBlock(Collections.emptyList()));
    }
}
