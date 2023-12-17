package expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectClassDef extends ClassDef{
    private static List<MethodDef> methodDefs;
    private static List<VariableDef> variableDefs;

    static {
        methodDefs = new ArrayList<>();
        methodDefs.add(new ToStringMethodDef());
        methodDefs.add(new GetClassMethodDef());
        methodDefs.add(new MethodDef("Object", "Object", new ParamDefList(Collections.emptyList()), new CodeBlock(Collections.emptyList())));
        variableDefs = new ArrayList<>();
        variableDefs.add(new VariableDef(AST.STRING_TYPE, "name"));
    }
    public ObjectClassDef() {
        super("Object", null, variableDefs, methodDefs);
    }
}
