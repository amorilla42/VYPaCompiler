lexer grammar lexerGrammar;

fragment LOWERCASE : [a-z];
fragment UPERCASE : [A-Z];
fragment DIGITS : [0-9];



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





IDENTIFIER : (LOWERCASE | UPERCASE|'_')(LOWERCASE | UPERCASE|'_'|DIGITS)*;
