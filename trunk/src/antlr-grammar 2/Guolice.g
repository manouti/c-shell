grammar Guolice;

options {
  language = C;
}

program
	: ( procedureDec |functionDec | statement | workSpace)*
 	;
 	

workSpace:
		'WorkSpace' ':' ID  
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
	: 'Box' ':' ID '('
	   (boxProperty (','boxProperty)*)?
	')'
	;

boxProperty
	: guiCommonProperty
	| width
	| hight
	;	
	

circle
	: 'Circle' ':'ID  '(' 
	   (circleProperty (','circleProperty)*)?	   
	 ')'
	;
	
circleProperty
	: guiCommonProperty
	| radius
	;

textBox
	: ('TextBox'| 'Button')  ':' ID '('   				//the textBox here can be textBox or Button
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
	: 'StartPoint'':' '('number ',' number ')'
	;
	
width
	: 'Width' ':' number
	;
	
hight
	: 'Hight' ':' number
	;
	 	
color
	:  COLOR_AREA ':' '(' INTEGER ','INTEGER ',' INTEGER ')'
	;

radius
	: 'R'':' number
	;	
	
textProperty
	: 'Text' ':' string	  
	;

event
	: EVENTTYPE	'(' 
	//( statement | guiType )*   // I'm thinking that I don't want it to be here
	')'
	;	
	
evntHabdleStatement
	: ID '.' EVENTTYPE '('
	( statement | guiType )*
	')' ';'
	;	


/*	
propertyHandlerStatement
	: ID '.' PROPERTY_NAME '.' ( 'set'| 'get' )  '(' expression? ')' ';'
	;
	
PROPERTY_NAME_1
	: 'Width'
	| 'Hight'
	| 'Raduis'
	| 'Position'
	| 'StartPoint'
	| 'Text'
	;
	
PROPERTY_NAME_2
	:COLOR_AREA
	
*/


functionDec
//	: 'function' ID '(' parameters? ')' ':' type    // here type is the return type
	: 'function' type ':' ID  '(' parameters? ')'  

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
	: assignmentStatement
	| constantDecStatement 
	| variableDecStatement
	| ifStatement
	| whileStatement
	| procedureCallStatement
// new line for even handler
	| evntHabdleStatement
	;

assignmentStatement
	: ID ':=' expression ';'
	;
		
constantDecStatement
//	: 'constant'ID ':' type ':=' expression ';'
	: 'constant' type ':' ID  ':=' expression ';'
	;

variableDecStatement
//  : 'var' ID (','ID)* ':' type (':=' expression)?';'
	: 'var' type ':' ID (':=' expression)?(','ID (':=' expression)?)*   ';'
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
	: number
	| '(' expression ')'
	| ID
	| ID '(' actualParameters? ')'  // this works as function call since it has to return somthing
	| string			// I just added it for now because of the function call
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
	
type
	: 'int'
	| 'float'
	| 'color'
	| 'string'
	;	
	
number
	: INTEGER ('.' INTEGER )?
	;		

string : '"' 
	  ~('"' | '\n'| '\r')
	 '"'
	 ;	
	
EVENTTYPE : 'OnClick'| 'KeyPress';	
POSITION_KEYWORD
	: 'LeftOf'  | 'RightOf'  | 'Above'  | 'Below'  | 'Inside' ;
COLOR_AREA
	: 'BackColor'| 'TextColor';
fragment LETTER : ('a'..'z' | 'A'..'Z');
fragment DIGIT : '0'..'9' ;
ID	: LETTER (LETTER| DIGIT)*;	
INTEGER : DIGIT+ ;
COMMENT : '//' .* ('\n'|'\r') {$channel=HIDDEN;};	 
WS      : ( ' ' | '\t' | '\n' | '\r' | '\f' )+ {$channel=HIDDEN;};