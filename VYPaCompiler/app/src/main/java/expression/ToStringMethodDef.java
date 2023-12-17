package expression;

import java.util.Collections;

public class ToStringMethodDef extends MethodDef{
    public ToStringMethodDef() {
        super(AST.STRING_TYPE, "toString", new ParamDefList(Collections.emptyList()), new CodeBlock(Collections.emptyList()));
    }
}
