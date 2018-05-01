// name must match file name
grammar Datalog;

dlog : factList ruleList queryList;

fact : ATOM LPAREN terms RPAREN;
factList : fact | fact factList;
rule : relation IF body PERIOD;
ruleList : rule | rule ruleList;
query : Q_START relation;
queryList : query | query queryList;
terms : term | term COMMA terms;
term : NUMBER | VAR | ATOM;
body : relation | relation COMMA body;

// Lexer rules
// fragments are not tokens
fragment VALID_ATOM_START : ('a'..'z');
fragment VALID_ATOM_CHAR : VALID_ATOM_START | ('A'..'Z') | ('0'..'9');
fragment VALID_VAR_START : ('A'..'Z') | '_';
fragment VALID_VAR_CHAR : VALID_ATOM_CHAR;

//tokens
NUMBER : ('0'..'9')+;
LPAREN : '(';
RPAREN : ')';
PERIOD : '.';
IF : ':-';
COMMA : ',';
Q_START : '?-'
ATOM : VALID_ATOM_START VALID_ATOM_CHAR*;
VAR : VALID_VAR_START VALID_VAR_CHAR*;
//White Space
WS : [ \r\n\t]+ -> skip;