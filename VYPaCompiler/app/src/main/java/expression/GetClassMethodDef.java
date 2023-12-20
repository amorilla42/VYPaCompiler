/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import java.util.Collections;

public class GetClassMethodDef extends MethodDef{
    public GetClassMethodDef() {
        super(AST.STRING_TYPE, "getClass", new ParamDefList(Collections.emptyList()), new CodeBlock(Collections.emptyList()));
    }
}
