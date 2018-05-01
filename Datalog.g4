// name must match file name
grammar Datalog;

dlog : relation IF body PERIOD;
relation : ID LPAREN args RPAREN;
args : arg | arg COMMA args;
arg : NUMBER | ID;
body : relation | relation COMMA body;

// Lexer rules
// fragments are not tokens
fragment VALID_ATOM_START : ('a'..'z');
fragment VALID_ATOM_CHAR : VALID_ATOM_START | ('A'..'Z') | ('0'..'9');



//tokens
NUMBER : ('0'..'9')+;
LPAREN : '(';
RPAREN : ')';
PERIOD : '.';
IF : ':-';
COMMA : ',';
ATOM : VALID_ATOM_START VALID_ATOM_CHAR*;
//White Space
WS : [ \r\n\t]+ -> skip;