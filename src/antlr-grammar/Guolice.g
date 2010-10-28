grammar Guolice;

options {
  language = C;
}

program
	: ( procedureDec |functionDec | statement | workSpace)*
 	;
 	

workSpace:
		'WorkSpace'ID ':' 
		'{'
		 ( procedureDec |functionDec | statement | guiType )*
		'}'
		'Finish' 'WorkSpace'
	 ;

guiType
	: box 
	| circle 
//	| triangle 
	| textBox  // with that I mean that box, circle and triangle wont contain text 
//	| button   // I dind't see any diffirence between button and textBox except the events  
	;

guiCommonProperty
	: position
	| point
	| color
	| event
	;
	 
box
	: 'Box' ID '('
	   (boxProperty (','boxProperty)*)?
	')'
	;

boxProperty
	: guiCommonProperty
	| width
	| hight
	;	
	

circle
	: 'Circle' ID '(' 
	   (circleProperty (','circleProperty)*)?	   
	 ')'
	;
	
circleProperty
	: guiCommonProperty
	| radius
	;

textBox
	: ('TextBox'| 'Button') ID '('   				//the textBox here can be textBox or Button
	   (textBoxProperty (',' textBoxProperty)*)?
	')'
	;		

textBoxProperty
	:  boxProperty
	|  textProperty
	;

position
	: 'Position'':'POSITION_KEYWORD (ID | guiType)
	;
	
point
	: 'StartPoint'':' '('INTEGER ',' INTEGER ')'
	;
	
width
	: 'Width' ':' INTEGER
	;
	
hight
	: 'Hight' ':' INTEGER
	;
	 	
color
	:  COLOR_AREA ':' '(' INTEGER ','INTEGER ',' INTEGER ')'
	;

radius
	: 'R'':' INTEGER
	;	
	
textProperty
	: 'Text' ':' STRING	  
	;

event
	: EVENTTYPE	'(' ( statement | guiType )*')'
	;	
type
	: 'int'
	| 'float'
	| 'color'
	| 'string'
	;	
	
functionDec
	: 'function' ID '(' parameters? ')' ':' type 
		( statement | returnStatement)*
	  'end' 'function'
	;

procedureDec
	: 'procedure' ID '(' parameters? ')'
		( statement | exitStatement)*
	  'end' 'procedure'
	;
	
parameters
	: ID ':' type ( ',' ID ':' type)*
	;
	
statement
	: assignmentStatement
	| constantDecStatement 
	| variableDecStatement
	| ifStatement
	| whileStatement
	| procedureCallStatement
	;

assignmentStatement
	: ID ':=' expression ';'
	;
		
constantDecStatement
	: 'constant'ID ':' type ':=' expression ';'
	;

variableDecStatement
	: 'var' ID (','ID)* ':' type (':=' expression)?';'
	;
	
ifStatement
	: 'if' expression 'do' 
	     statement*
	  ( 'elseif' expression 'do' 
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
	| ID '(' actualParameters? ')' // this works as function call since it has to return somthing
	;
// I still need to add the comparison for  the guiTypes that's why I didn't add them to terms :) 


negation
	: 'not'* term
	;

sign
	: ( '+' | '-' )* negation
	;
	
power
	: sign ('^' sign)*
	;
	
multdiv
	: power (('*' | '/' | 'mod' ) power )*
	;

addsub
	: multdiv ( ('+' | '-') multdiv)*
	;
	
compare
	: addsub (('=' | '/=' | '<' | '<=' | '>' | '>=') addsub)*
	;
	
expression
	: compare (('AND' | 'OR') compare)*
	;
	
	
	
	
EVENTTYPE : 'OnClick'| 'KeyPress';	
POSITION_KEYWORD
	: 'LeftOf'  | 'RightOf'  | 'Above'  | 'Below'  | 'Inside' ;
COLOR_AREA
	: 'BackColor'| 'TextColor';
STRING : '"'	  ~('"' | '\n'| '\r')	  '"' ; 
fragment LETTER : ('a'..'z' | 'A'..'Z');
fragment DIGIT : '0'..'9' ;
ID	: LETTER (LETTER| DIGIT)*;	
INTEGER : DIGIT+ ;
COMMENT : '//' .* ('\n'|'\r') {$channel=HIDDEN;};	 
WS      : ( ' ' | '\t' | '\n' | '\r' | '\f' )+ {$channel=HIDDEN;};