/*
 * Project: VYPALanguage compileur
 * Author: NGUYEN Huu TU xnguye08 and Morilla Andrés xmoril01
 */
package expression;

public class SubStrFunction extends FunctionInvokeExpression{
    public SubStrFunction(ExpressionList arguments) {
        super("subStr", arguments);
    }

    @Override
    public String getType() {
        return STRING_TYPE;
    }
}
