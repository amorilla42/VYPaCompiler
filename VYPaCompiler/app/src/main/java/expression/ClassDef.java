package expression;

import codeGenerator.CodeGenerator;
import tables.SymbolTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassDef extends AST {


    private ClassDef superClassDef;
    private String name;
    private String superClass;
    private List<VariableDef> variableDefs;
    private List<MethodDef> methodDefs;
    private MethodDef constructorDef = null;
    public ClassDef getSuperClassDef() {
        return superClassDef;
    }
    public void setSuperClassDef(ClassDef superClassDef) {
        this.superClassDef = superClassDef;
    }

    public String getName() {
        return name;
    }

    public String getSuperClass() {
        return superClass;
    }

    public List<VariableDef> getVariableDefs() {
        return variableDefs;
    }

    public List<MethodDef> getMethodDefs() {
        return methodDefs;
    }
    List<MethodDef> allMethods = null;
    public MethodDef getMethodDef(String dn) {
        for (MethodDef md : getAllMethods()) {
            if (md.getName().equals(dn)) {
                return md;
            }
        }
        return null;
    }
    public List<MethodDef> getAllMethods() {
        if (allMethods == null) {
            allMethods = new ArrayList<>();
            for (MethodDef md : superClassDef.getAllMethods()) {
                MethodDef overwrite = null;
                for (MethodDef loc : methodDefs) {
                    if (loc.getName().equals(md.getName())) {
                        overwrite = loc;
                        break;
                    }
                }

                if (constructorDef != null && overwrite == constructorDef) continue;

                if (overwrite != null) {
                    allMethods.add(overwrite);
                } else {
                    allMethods.add(md);
                }
            }
            for (MethodDef md : methodDefs) {
                if (superClassDef.getMethodDef(md.getName()) == null && !md.getName().equals(name)) {
                    allMethods.add(md);
                }
            }
        }
        return allMethods;
    }

    public MethodDef getConstructorDef() {
        return constructorDef;
    }

    public ClassDef(String name, String classExtends, List<VariableDef> variableDefs, List<MethodDef> methodDefs) {
        this.name = name;
        this.superClass = classExtends;
        this.variableDefs = variableDefs;
        this.methodDefs = methodDefs;
        for (MethodDef md : methodDefs) {
            md.setClassDef(this);

        }
    }
    List<VariableDef> allFields = null;

    public List<VariableDef> getAllFields() {
        if (allFields == null) {
            allFields = new ArrayList<>();
            if(superClassDef != null) {
                allFields.addAll(superClassDef.getAllFields());
            }
            allFields.addAll(variableDefs);
        }
        return allFields;
    }
    public int getFieldIndex(String name) {
        getAllFields();
        for (int i = 0; i < getAllFields().size(); i++) {
            if (getAllFields().get(i).getIdentifier().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void checkType(SymbolTable st) {
        st.startClassDef(this);
        for (MethodDef methodDef : methodDefs) {
            methodDef.checkType(st);
            if (methodDef.getName().equals(name)) {
                if (constructorDef != null) {
                    throw new RuntimeException("Multiple constructors defined");
                } else {
                    constructorDef = methodDef;
                    ClassDef supClasDef = superClassDef;
                    while (supClasDef != null) {
                        if (supClasDef.getName().equals(name)) {
                            throw new RuntimeException("Class " + name + " has the same name as its superclass");
                        }
                        supClasDef = supClasDef.getSuperClassDef();
                    }
                }
            }
        }

        if (superClassDef != null && superClassDef.getConstructorDef() != null) {
            if (!superClassDef.getConstructorDef().getParams().getParameters().isEmpty()) {
                if (constructorDef == null) {
                    throw new RuntimeException("Missing constructor for superclass in " + name);
                } else {
                    List<AST> bodyStatements = constructorDef.getBody().getStatements();
                    if (bodyStatements == null || bodyStatements.isEmpty() || !(bodyStatements.get(0) instanceof SuperFunction)) {
                        throw new RuntimeException("Missing constructor for superclass in " + name);
                    }
                }
            }
        }
        if (constructorDef == null) { // create implicit super constructor
            SuperFunction superFunction = new SuperFunction(new ExpressionList(Collections.emptyList()));
            superFunction.setSuperClass(superClassDef);
            constructorDef = new MethodDef(AST.VOID_TYPE, name, new ParamDefList(Collections.emptyList()), new CodeBlock(Collections.singletonList(superFunction)));
            constructorDef.setClassDef(this);
        } else {
            Statements body = constructorDef.getBody();
            if (body.getStatements().isEmpty() || !(body.getStatements().get(0) instanceof SuperFunction)) {
                List<AST> statements = new ArrayList<>();
                SuperFunction superFunction = new SuperFunction(new ExpressionList(Collections.emptyList()));
                superFunction.setSuperClass(superClassDef);
                statements.add(superFunction);
                statements.addAll(body.getStatements());
                Statements constructorDefBody = new Statements(statements);
                constructorDef.setBody(constructorDefBody);
            }
        }
        for (VariableDef variableDef : variableDefs) {
            variableDef.checkType(st);
            if (superClassDef !=null && superClassDef.getFieldIndex(variableDef.getIdentifier()) != -1) {
                throw new RuntimeException("Field " + variableDef.getIdentifier() + " is already defined in superclass!");
            }
        }
        st.endClassDef();
    }

    public void defineConstants(SymbolTable st, CodeGenerator codeGen) {
        
    }
}
