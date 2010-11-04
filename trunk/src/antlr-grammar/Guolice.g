grammar Guolice;

options {
  language = C;
}

program
	: ( procedureDec |functionDec | statement )*
 	;
 	
functionDec
	: 'function' type ':' ID  '(' parameters? ')'  // here (type) is the return value type of the function
		( statement | returnStatement)*
	  'end' 'function'
	;

procedureDec
	: 'procedure' ':'ID  '(' parameters? ')'
		( statement | exitStatement)*
	  'end' 'procedure'
	;
	
parameters
	: type  ':' term ( ',' type  ':' term)*
	;

	
statement
	: ';'
	| assignmentStatement
	| constantDecStatement 
	| variableDecStatement
	| ifStatement
	| whileStatement
	| procedureCallStatement
	| guiStatement
	| evntHabdleStatement
	;




//begin regular programing grammar

assignmentStatement
	: ID ':=' expression ';'
	;
		
constantDecStatement
	: 'constant' type ':' ID  ':=' expression ';'
	;

variableDecStatement
	: 'var' type ':' ID (':=' expression)?(','ID (':=' expression)?)*   ';'
	;
	
ifStatement
	: 'if' (expression | guiComparsionExpression) 'then' 			// that's mean that I can't put ( C1 SmallerThan C2 AND C2 BiggerThan C3 )
	     statement*
	  ( 'elseif' (expression | guiComparsionExpression) 'then' 
	  	statement*)*
	  ( 'else'   
	  	statement*)?
	  'end' 'if'
	;
	
whileStatement
	: 'while' expression 'loop'
	  ( statement | exitStatement)*
	  'end' 'loop'
	;

procedureCallStatement
	: ID '(' actualParameters? ')' ';'
	;

actualParameters
	: expression (',' expression)*
	;	
	
exitStatement
	: 'exit''when' expression ';'
	| 'exit''now'';'
	;
	
returnStatement
	: 'return' expression ';'
	;
	
term
	: INTEGER
	| '(' expression ')'
	| ID
	| ID '(' actualParameters? ')'  // this works as function call since it has to return somthing
	| STRING_LITERAL		        
	;

negation
	: 'NOT'* term
	;

unary
	: ( '+' | '-' )* negation
	;
	
multdiv
	: unary (('*' | '/' | 'mod' ) unary )*
	;

addsub
	: multdiv ( ('+' | '-') multdiv)*
	;
	
compare
	: addsub (('=' | '!=' | '<' | '<=' | '>' | '>=') addsub)*
	;
	
expression
	: compare (('AND' | 'OR') compare)*
	;
	
type
	: 'int'
	| 'bool'
	| 'string'
	;	

	 
guiDecStatement
	: guiType ':' ID  ( ','ID )* ';'
	;

guiTerm
	: ID
	| '(' guiPositionExpression ')'
	;
	
guiPositionExpression
	:  guiTerm  (positionKeyword guiTerm )+
	;
	
guiComparsionExpression
	:  ID 	guiComparsionTerm 	ID
	;
	

guiStatement
	: guiDecStatement
	| guiPositionExpression ';'
	| guiComparsionExpression ';'
	;

evntHabdleStatement
	: ID '.' eventType '('
	( statement )*
	')' ';'
	;	

guiType
	: 'Box' 
	| 'Circle' 
	| 'Triangle'
	| 'Label'
	;	
		
eventType 
	: 'OnClick'
	| 'KeyPress'
	;			

positionKeyword
	: 'LeftOf'  
	| 'RightOf'  
	| 'Above'  
	| 'Below'  
	| 'Contains' 
	| 'Intersect' 
	;
	
guiComparsionTerm 
	: 'SmallerThan' 
	| 'BiggerThan' 
	| 'EqualTo' 
	;

fragment LETTER : ('a'..'z' | 'A'..'Z');
fragment DIGIT : '0'..'9' ;	

STRING_LITERAL    // we can write any thing here including (\") which will be understood it as  (")
	: '"' 
		 ( '\\' '\"'      				
	 	 	|~('"' |  '\n'| '\r')
	 	 )*
	 	'"' 
	;	
ID	: LETTER ( LETTER | DIGIT | '_')*;	
INTEGER : DIGIT+ ;
COMMENT : '//' .* ('\n'|'\r') {$channel=HIDDEN;};	 
WS      : ( ' ' | '\t' | '\n' | '\r' | '\f' )+ {$channel=HIDDEN;};