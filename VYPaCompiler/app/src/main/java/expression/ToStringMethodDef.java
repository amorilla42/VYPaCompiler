package expression;

import java.util.Collections;

public class ToStringMethodDef extends MethodDef{
    public ToStringMethodDef(String type, String name, ParamDefList params, CodeBlock body) {
        super(AST.STRING_TYPE, "toString", new ParamDefList(Collections.emptyList()), new CodeBlock(Collections.emptyList()));
    }
}
