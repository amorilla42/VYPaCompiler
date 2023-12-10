parser grammar VYPAParser;

options {tokenVocab = VYPALexer;}
// Global definitions

program: genericDef* EOF;

genericDef: funcDef | classDef | varDefStatement;

funcDef: returnType IDENTIFIER LPAR (VOID | paramDefList)? RPAR codeBlock;

// Parameter list Definition

paramDefList: paramDef (COMMA paramDef)*;

paramDef: dataType IDENTIFIER
;

// Class Definition
classDef:
        CLASS IDENTIFIER classExtends? LPAR classBody RPAR
        ;

classExtends: COLON IDENTIFIER;

classBody: (varDefStatement | methodDef)*;

methodDef:
        returnType IDENTIFIER LPAR (VOID|paramDefList)? RPAR codeBlock;




//statements inside a CODE BLOCK

codeBlock: LBRACE statementList RBRACE;

statementList: statement*;

statement:
        varDefStatement
        |expressionStatement
        |codeBlock
        |ifStatement
        |whileStatement
        |returnStatement
        ;

ifStatement:
        IF LPAR expr RPAR statement elseStatement
        |IF LPAR expr RPAR statement
        ;

elseStatement: ELSE statement
        ;

whileStatement: WHILE LPAR expr RPAR statement;

returnStatement: RETURN expr SEMICOLON   #ReturnWithType
                | RETURN SEMICOLON       #ReturnVoid
                ;

singleDefStatement:
                IDENTIFIER
                |IDENTIFIER ASSIGN expr;

varDefStatement:
               dataType singleDefStatement (COMMA singleDefStatement)* SEMICOLON;

expressionStatement:
                sideEffectExpression SEMICOLON      #ExpressionStatementDeclare
                ;

sideEffectExpression:
                variable ASSIGN expr                                #SideEffectAssing
                |invocation                                         #SideEffectInvokeFunction
                |variable DOT IDENTIFIER LPAR expressionList? RPAR  #SideEffectInvokeMethod
                |superConstructor                                   #SideEffectNone
                |newObject                                          #SideEffectNone
                ;

superConstructor:
                SUPER LPAR expressionList? RPAR;

// Expressions

variable:
        superMethod                     #VarNone
        |variableStart (fieldAccess)*   #VarMultipleAccess
        ;

superMethod:
        SUPER DOT IDENTIFIER LPAR expressionList? RPAR;

variableStart:
            THIS                    #VariableThis
            |LPAR expr RPAR         #VariablePar
            |newObject              #VariableNone
            |invocation             #VariableInvokeFunction
            |IDENTIFIER             #Identifier
            ;

fieldAccess:
            DOT invocation
            |DOT IDENTIFIER
            ;

invocation: IDENTIFIER LPAR expressionList? RPAR;

newObjParams:
            LPAR RPAR
            |LPAR expressionList RPAR
            ;

newObject:
         NEW IDENTIFIER newObjParams
         |NEW IDENTIFIER
         ;

//Expressions operation ordered by priority

expUnary:
    NOT expUnary
    |LPAR dataType RPAR expUnary
    |literal
    |variable
    ;
expMul:
    expUnary
    |expMul op=(MUL | DIV) expUnary
    ;
expAdd:
    expMul
    |expAdd op=(ADD | SUB) expMul
    ;
expRel:
    expAdd
    |expAdd op=(GT|LT|LE|GE) expAdd
    ;
expComparation:
    expRel
    |expComparation op=(EQ|NEQ) expRel
    ;
expAnd:
    expComparation
    |expAnd AND expComparation
    ;
expOr:
    expAnd
    |expOr OR expAnd
    ;
expr:
    expOr
    ;

// Expressions List

literal:
    type=INTEGER_LIT
    |type=STRING_LIT
    ;

expressionList: expr (COMMA expr)*;



// Utils

primitiveType: INT | STRING;
dataType: primitiveType | IDENTIFIER;
returnType: dataType | VOID;
