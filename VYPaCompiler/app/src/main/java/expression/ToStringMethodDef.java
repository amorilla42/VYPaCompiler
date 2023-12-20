/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import java.util.Collections;

public class ToStringMethodDef extends MethodDef{
    public ToStringMethodDef() {
        super(AST.STRING_TYPE, "toString", new ParamDefList(Collections.emptyList()), new CodeBlock(Collections.emptyList()));
    }
}
