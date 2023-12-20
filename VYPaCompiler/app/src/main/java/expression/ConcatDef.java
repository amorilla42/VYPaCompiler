/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

import java.util.Collections;

public class ConcatDef extends FunctionDef{
    private static ParamDefList params;
    public ConcatDef() {
        super(STRING_TYPE, "+", params, new CodeBlock(Collections.emptyList()));
    }
}
