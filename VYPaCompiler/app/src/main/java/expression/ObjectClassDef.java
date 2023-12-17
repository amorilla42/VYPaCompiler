package expression;

import java.util.List;

public class ObjectClassDef extends ClassDef{
    private static List<MethodDef> methodDefs;
    private static List<VariableDef> variableDefs;
    public ObjectClassDef(String name, String classExtends, List<VariableDef> variableDefs, List<MethodDef> methodDefs) {
        super("Object", null, variableDefs, methodDefs);
    }
}
