lexer grammar VYPALexer;

// Keywords

CLASS : 'class';
ELSE : 'else';
IF : 'if';
INT : 'int';
RETURN: 'return';
STRING: 'string';
SUPER: 'super';
THIS: 'this';
VOID: 'void';
WHILE: 'while';
NEW : 'new';

// Separators

LPAR : '(';
RPAR: ')';
LBRACE : '{';
RBRACE : '}';
SEMICOLON : ';';
COMMA : ',';
DOT : '.';

// Operators

ASSIGN : '=';
GT : '>';
LT : '<';
NOT : '!';
COLON : ':';
EQ : '==';
LE : '<=';
GE : '>=';
NEQ : '!=';
AND : '&&';
OR : '||';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';

// Comments

WHITESPACES: [ \t\r\n]+     -> channel(HIDDEN);
COMMENT:     '/*' .*? '*/'  -> channel(HIDDEN);
LINECOMMENT: '//' ~[\r\n]*  -> channel(HIDDEN);

//Literals

INTEGER_LIT: '0' | [1-9] [0-9]*;
STRING_LIT:  '"' STRINGCHAR* '"' ;

//Identifier
IDENTIFIER : (LOWERCASE | UPERCASE|'_')(LOWERCASE | UPERCASE|'_'|DIGITS)*;


fragment LOWERCASE : [a-z];
fragment UPERCASE : [A-Z];
fragment DIGITS : [0-9];

fragment STRINGCHAR:
            ESCAPE_SEQ
            | ~([\u0000-\u001f] | '"' | '\\');

fragment ESCAPE_SEQ:
            '\\x' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT
            | '\\n'
            | '\\t'
            | '\\\\'
            | '\\"';

fragment HEXDIGIT:[0-9a-fA-F];

ERROR_TOKEN: . ;
