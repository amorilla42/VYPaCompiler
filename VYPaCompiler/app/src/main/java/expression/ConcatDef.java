package expression;

import java.util.Collections;

public class ConcatDef extends FunctionDef{
    private static ParamDefList params;
    public ConcatDef() {
        super(STRING_TYPE, "+", params, new CodeBlock(Collections.emptyList()));
    }
}
