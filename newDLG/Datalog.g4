// name must match file name
grammar Datalog;

datalog : statement*;

statement : 
  	assertion
| 	retraction
| 	query
;

assertion :
	clause PERIOD
;

retraction :
	clause TILDE
;

query :
	literal Q_MARK
;

clause :
	literal IF body
|	literal
;

body :
	literal COMMA body
|	literal
;

literal :
	predSym LPAREN RPAREN
|	predSym LPAREN terms RPAREN
|	predSym
|	term EQUALS term
|	term NOTEQUALS term
;

predSym :
	ID
|	STR
;

terms :
	term
|	term COMMA terms
;

term :
	VAR
|	constant
;

constant :
	ID
|	STR
;

// Lexer rules
// fragments are not tokens
fragment VALID_ID_START : ('a'..'z');
fragment VALID_ID_CHAR : VALID_ID_START | ('A'..'Z') | ('0'..'9') | '-';
fragment VALID_VAR_START : ('A'..'Z') | '_';
fragment VALID_VAR_CHAR : ;
fragment VALID_STR_CHAR : VALID_ID_CHAR | ' '; //('A'..'Z') | ('a'..'z') | ('0'..'9');
fragment QUOTE : '"';
//tokens
EQUALS : '=';
NOTEQUALS : '!=';
NUMBER : ('0'..'9')+;
LPAREN : '(';
RPAREN : ')';
PERIOD : '.';
IF : ':-';
TILDE : '~';
COMMA : ',';
Q_MARK : '?';
ID : VALID_ID_START VALID_ID_CHAR*;
VAR : VALID_VAR_START VALID_VAR_CHAR*;
STR : QUOTE VALID_STR_CHAR* QUOTE;
//White Space
WS : [ \r\n\t]+ -> skip;