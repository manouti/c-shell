grammar Guolice;

options {
	k = 2;
	language = Java;
}


/* ------------------------ Define grammar tokens ------------------------ */
tokens
{
	PLUS       = '+';
	MINUS      = '-';
	MULT       = '*';
	DIV        = '/';
	EQUALS     = '=';
	INCR       = '++';
	DECR       = '--';
	PLUSEQUAL  = '+=';
	MINUSEQUAL = '-=';
	MULTEQUAL  = '*=';
	//DIVEQUAL   = '/=';
	LESSTHAN   = '<';
	GRTRTHAN   = '>';
	ISEQUAL    = '==';
	NOTEQUAL   = '/=';
	AND_OP     = 'AND';
	OR_OP      = 'OR';
	MODULO     = 'MOD';
	NOT_OP     = 'NOT';
	CIRCLE     = 'CIRCLE';//('C'|'c') ('I'|'i') ('R'|'r') ('C'|'c') ('L'|'l') ('E'|'e');
	TEXTBOX    = 'TEXTBOX';//('T'|'t')('E'|'e')('X'|'x')('T'|'t')('B'|'b')('O'|'o')('X'|'x') ;
	BUTTON     = 'BUTTON';//('B'|'b')('U'|'u')('T'|'t')('T'|'t') ('O'|'o')('N'|'n');
	BOX        = 'BOX';//('B'|'b')('O'|'o')('X'|'x') ;
}

@lexer::header {
package mypackage;

import mypackage.Node;
}

@parser::header {
package mypackage;

import mypackage.Node;
}

@members{
public Node root = null;
}



/*------------------------------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------------------------------
*/

program
@init { root = new Node("Program"); }
@after { System.out.println("The root node is: " + root.toString() + "\n");  }
	: ( procedureDec | functionDec | statement)*
 	;
 	
procedureDec
	: 'procedure' ':'ID  '(' parameters? ')'
		( statement | exitStatement)*
	  'end' 'procedure'
	;

functionDec
//	: 'function' ID '(' parameters? ')' ':' type    // here type is the return type
	: 'function' type ':' ID  '(' parameters? ')'  

		( statement | returnStatement)*
	  'end' 'function'
	;

statement returns [Node node]
@after {System.out.println("The assignment node is: " + $node.toString() + "\n");}
	: assignmentStatement { $node = $assignmentStatement.node;
							root.addChild($assignmentStatement.node);
	}
	| constantDecStatement 
	| variableDecStatement
	| ifStatement
	| whileStatement
	| procedureCallStatement
// new line for even handler
	| evntHandleStatement
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
	: BOX ':' ID '('
	   (boxProperty (','boxProperty)*)?
	')'
	;

boxProperty
	: guiCommonProperty
	| width
	| height
	;	
	

circle
	: CIRCLE ':'ID  '(' 
	   (circleProperty (','circleProperty)*)?	   
	 ')'
	;
	
circleProperty
	: guiCommonProperty
	| radius
	;

textBox
	: (TEXTBOX| BUTTON)  ':' ID '('   				//the textBox here can be textBox or Button
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
	
height
	: 'Height' ':' number
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
	
evntHandleStatement
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



parameters
	: type  ':' term ( ',' type  ':' term)*
	;
	

assignmentStatement returns [Node node]
	: ID ':=' expression ';' {
		Node idNode = new Node($ID.text);   // Create a node for the identifier
		Node equalsNode = new Node(":=");   // Create a node for the assignment symbol
		
		// Now add the identifier node and the node returned by the expression rule to the assignment symbol node
		equalsNode.addChild(idNode);
		
		equalsNode.addChild($expression.node);
		
		$node = equalsNode;   // Return the assignment symbol node
	}
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
	
term returns [Node node]
@init { String nodeText = ""; }
	: number { $node = $number.node; }
	| '(' expression ')' { $node = $expression.node; }
	| ID { $node = new Node($ID.text); }
	| ID '(' (actualParameters{ nodeText = $actualParameters.text;} )? ')'  // this works as function call since it has to return somthing
	{
		$node = new Node($ID.text + "(" + nodeText + ")");
	}
	| string	// I just added it for now because of the function call
	 { $node = new Node($string.text); }
	;
	
// I still need to add the comparison for  the guiTypes that's why I didn't add them to terms :) 


negation returns [Node node]
@init { int numberOfNots = 0; }
	: ( NOT_OP { numberOfNots++; } )* term
	{
		Node returnNode = $term.node;
		
		for(int i = 0; i < numberOfNots; i++) {
			Node notNode = new Node("NOT");
			notNode.addChild(returnNode);
			
			returnNode = notNode;
		}
		
		$node = returnNode;
	}
	;

sign returns [Node node]
@init { int minuses = 0; }
	: ( PLUS | MINUS { minuses++; })* negation {
		String sign = (minuses \% 2 == 0)? "+" : "-";  // if number of minuses is even, the sign is +, otherwise the sign is -
		$node = new Node("" + sign + "" + $negation.node.getValue());
	}
	;
	
power returns [Node node]
@init {boolean powerOpExists = false;
       Node temp = null;
}
	: s1=sign { temp = $s1.node; }('^' s2=sign {
		if(!powerOpExists) {
			powerOpExists = true;
		}
		
	 	Node powerOpNode = new Node("^"); 
	 	
	 	powerOpNode.addChild(temp);
	 	
		powerOpNode.addChild($s2.node);
		
		temp = powerOpNode;
	})*
	{ 
		$node = temp; 
	}
	;

multdiv returns [Node node]
@init {boolean multExists = false;
       boolean divExists = false;
       boolean moduloExists = false;
       Node temp = null;
}
	: p1=power { temp = $p1.node; }( ( MULT p2=power{
		if(!multExists && !divExists && !moduloExists) {
			multExists = true;
		}
		
	 	Node multNode = new Node("*"); 
	 	
	 	multNode.addChild(temp);
	 	
		multNode.addChild($p2.node);
		
		temp = multNode;
	})
	| ( DIV p2=power{
		if(!multExists && !divExists && !moduloExists) {
			divExists = true;
		}
		
	 	Node divNode = new Node("/"); 
	 	
	 	divNode.addChild(temp);
	 	
		divNode.addChild($p2.node);
		
		temp = divNode;
	} )
	| ( MODULO p2=power{
		if(!multExists && !divExists && !moduloExists) {
			moduloExists = true;
		}
		
	 	Node moduloNode = new Node("mod"); 
	 	
	 	moduloNode.addChild(temp);
	 	
		moduloNode.addChild($p2.node);
		
		temp = moduloNode;
	} ) )*
	{ 
		$node = temp; 
	}
	;
	
compare returns [Node node]
@init {boolean comparatorExists = false;
	Node comparatorNode = null;
}
	: a1=addsub ( ( EQUALS a2=addsub {
		comparatorNode = new Node("=");
		comparatorNode.addChild($a1.node);
		
		comparatorNode.addChild($a2.node);
		
		comparatorExists = true;
	})
	
	| ( NOTEQUAL a2=addsub {
		comparatorNode = new Node("/=");
		comparatorNode.addChild($a1.node);
		
		comparatorNode.addChild($a2.node);
		
		comparatorExists = true;
	}) 
	| ( LESSTHAN a2=addsub {
		comparatorNode = new Node("<");
		comparatorNode.addChild($a1.node);
		
		comparatorNode.addChild($a2.node);
		
		comparatorExists = true;
	})
	| ( LESSTHAN EQUALS a2=addsub {
		comparatorNode = new Node("<=");
		comparatorNode.addChild($a1.node);
		
		comparatorNode.addChild($a2.node);
		
		comparatorExists = true;
	})
	| ( GRTRTHAN a2=addsub {
		comparatorNode = new Node(">");
		comparatorNode.addChild($a1.node);
		
		comparatorNode.addChild($a2.node);
		
		comparatorExists = true;
	})
	| ( GRTRTHAN EQUALS a2=addsub {
		comparatorNode = new Node(">=");
		comparatorNode.addChild($a1.node);
		
		comparatorNode.addChild($a2.node);
		
		comparatorExists = true;
	}) )?
	
	// Now return the node
	{
		if(comparatorExists) {
			$node = comparatorNode;
		}
		else $node = $a1.node;
	}
	;

	
expression returns [Node node]
@init {boolean andExists = false;
       boolean orExists = false;
       Node temp = null;
}
	: c1=compare { temp = $c1.node; }( ( AND_OP c2=compare {
		if(!andExists && !orExists) {
			andExists = true;
		}
		
	 	Node andNode = new Node("&&"); 
	 	
	 	andNode.addChild(temp);
	 	
		andNode.addChild($c2.node);
		
		temp = andNode;
	 })
	 
	| ( OR_OP c2=compare {
		if(!andExists && !orExists) {
			orExists = true;
		}
		
	 	Node orNode = new Node("||"); 
	 	
	 	orNode.addChild(temp);
	 	
		orNode.addChild($c2.node);
		
		temp = orNode;
	}) )* 
	{ 
		$node = temp; 
	}
	;

	
addsub returns [Node node]
@init {boolean plusExists = false;
       boolean minusExists = false;
       Node temp = null;
}
	: m1=multdiv { temp = $m1.node; }( ( PLUS m2=multdiv {
		if(!plusExists && !minusExists) {
			plusExists = true;
		}
		
	 	Node plusNode = new Node("+"); 
	 	
	 	plusNode.addChild(temp);
	 	
		plusNode.addChild($m2.node);
		
		temp = plusNode;
	})
	| ( MINUS m2=multdiv {
		if(!plusExists && !minusExists) {
			minusExists = true;
		}
		
	 	Node minusNode = new Node("-"); 
	 	
	 	minusNode.addChild(temp);
	 	
		minusNode.addChild($m2.node);
		
		temp = minusNode;
	} ) )*
	{ 
		$node = temp; 
	}
	;
	
type
	: 'int'
	| 'float'
	| 'color'
	| 'string'
	;	
	
number returns [Node node]
@init { String text = ""; }
	: i1=INTEGER { text += $i1.text; }('.' i2=INTEGER { text += "." + $i2.text; })?
	{
		$node = new Node(text);
	}
	;		

string : '"' 
	  ~('"' | '\n'| '\r')
	 '"'
	 ;	
	
/*------------------------------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------------------------------
*/

EVENTTYPE : 'OnClick'| 'KeyPress';	

POSITION_KEYWORD
	:	 'leftOf'  | 'rightOf'  | 'above'  | 'below'  | 'inside' ;

COLOR_AREA : 'backColor'| 'textColor';

fragment
LETTER : ('a'..'z' | 'A'..'Z' | '_');

fragment
DIGIT : '0'..'9' ;

ID	: LETTER (LETTER| DIGIT)*;	

fragment
INTEGER : DIGIT+ ;

COMMENT : '//' .* ('\n'|'\r') { $channel=HIDDEN; }; 

WS      : ( ' ' | '\t' | '\n' | '\r' | '\f' )+ { $channel=HIDDEN; };