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
	LESSTHAN   = '<';
	GRTRTHAN   = '>';
	ISEQUAL    = '==';
	NOTEQUAL   = '!=';
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
}

@parser::header {
package mypackage;

import java.util.Map;
import java.util.HashMap;
import mypackage.Node;
import mypackage.FunctionNode;
}

@members {
public Node root = null;

public List<FunctionNode> functionList = new ArrayList<FunctionNode>();


public void printStructure() {
  
}
}



/*------------------------------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------------------------------
*/

program
@init { root = new Node("Program");}
@after { System.out.println("The root node is: " + root.toString() + "\n");
  }
	: ( procedureDec | functionDec | statement {
	   if($statement.node != null) {
	       root.addChild($statement.node);
	       System.out.println("The statement node is: " + $statement.node.toString() + "\n");
	   }
	   
	   if($statement.nodes != null) {
	       for(int i = 0; i < $statement.nodes.size(); i++) {
            root.addChild($statement.nodes.get(i));
            System.out.println("The variable declaration nodes are: " + $statement.nodes.toString() + "\n");
         }
     }
     })*
 	;
 	
procedureDec
@init { FunctionNode procedureNode; }
@after { System.out.println("The procedure list is: " + functionList + "\n"); }
	: 'procedure' ':' ID  { procedureNode = new FunctionNode($ID.text); }
	'(' (parameters { procedureNode.setParameters($parameters.param); } )? ')'
		( statement { procedureNode.addChild($statement.node); } | exitStatement)*
		{ procedureNode.setReturnType("void");
		  functionList.add(procedureNode); }
	  'end' 'procedure'
	;
	
	
functionDec
@init { FunctionNode functionNode; }
@after { System.out.println("The procedure list is: " + functionList + "\n"); }
	: 'function' type ':' ID  { functionNode = new FunctionNode($ID.text); }
	'(' (parameters { functionNode.setParameters($parameters.param); } )? ')'  // here (type) is the return value type of the function
		( statement { functionNode.addChild($statement.node); } )* returnStatement 
	  'end' 'function' { functionNode.setReturnType($type.text);
                       functionList.add(functionNode); }
	;


statement returns [Node node, List<Node> nodes]
	: ';'
	| assignmentStatement { $node = $assignmentStatement.node;
	}
	| constantDecStatement { $node = $constantDecStatement.node;
  	}
	| variableDecStatement {
	     $nodes = $variableDecStatement.nodes;
	}
	| ifStatement  { $node = $ifStatement.node; }
	| whileStatement { $node = $whileStatement.node; }
	| procedureCallStatement { $node = $procedureCallStatement.node; }
	| guiStatement { $node = $guiStatement.node; }
	| evntHandleStatement
	;
	
parameters returns [Map<String, String> param]
	: t1=type  ':' i1=ID { param = new HashMap<String, String>();
	                   param.put($i1.text, $t1.text); }
	  ( ',' t2=type  ':' i2=ID { param.put($i2.text, $t2.text); } )*
	;


//begin regular programing grammar

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
		
constantDecStatement returns [Node node]
//	: 'constant'ID ':' type ':=' expression ';'
	: 'constant' type ':' ID  ':=' expression ';' {
	     $node = new Node(":=");
	     
	     Node idNode = new Node("constant " + $type.text + " " + $ID.text);
	     
	     $node.addChild(idNode);
	     $node.addChild($expression.node);
	}
	;

variableDecStatement returns [List<Node> nodes]
@init{ Node temp; }
//  : 'var' ID (','ID)* ':' type (':=' expression)?';'
	: 'var' type ':' i1=ID {
	         $nodes = new ArrayList<Node>();
	         temp = new Node("var " + $type.text + " " + $i1.text);
	       }
	       (':=' e1=expression { 
	         Node equalsNode = new Node(":=");
	         equalsNode.addChild(temp);
	         equalsNode.addChild($e1.node);
	         temp = equalsNode;
	       })? { $nodes.add(temp); }
	       
	       (',' i2=ID {
           temp = new Node("var " + $type.text + " " + $i2.text);
         }
         (':=' e2=expression
          { 
           Node equalsNode = new Node(":=");
           equalsNode.addChild(temp);
           equalsNode.addChild($e2.node);
           temp = equalsNode;
         })? { $nodes.add(temp); } )*   ';'
	;
	
ifStatement returns [Node node]
@init { Node thenNode = new Node("then"); }
	: 'if' (e1=expression { 
       $node = new Node("if");                      //i.e     "if"
                                                    //       /    \
       $node.addChild($e1.node);                    //   "expr"   "then"        
       $node.addChild(thenNode);
  }
  | g1=guiComparisonExpression { 
       $node = new Node("if");                      //i.e     "if"
                                                    //       /    \
       $node.addChild($g1.node);                    //   "expr"   "then"  
       $node.addChild(thenNode);
  } ) 'then' 			// that's mean that I can't put ( C1 SmallerThan C2 AND C2 BiggerThan C3 )
	    
	     ( s1=statement{ thenNode.addChild($s1.node); } )*
	     
	  ( 'else'   { Node elseNode = new Node("else");
                 $node.addChild(elseNode); 
                 }
      (s2=statement { elseNode.addChild($s2.node); } )* )?
	  'end' 'if'
	;
	
whileStatement returns [Node node]
  : 'while' { $node = new Node("while"); } expression { $node.addChild($expression.node); }'loop'
    ( statement { $node.addChild($statement.node); } | exitStatement)*
    'end' 'loop'
  ;

procedureCallStatement returns [Node node]
	: ID '(' actualParameters? ')' { $node = new Node($ID.text + " (" + $actualParameters.text + ")"); } ';'
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
	: INTEGER { $node = new Node($INTEGER.text); }
	| '(' expression ')' { $node = $expression.node; }
	| ID { $node = new Node($ID.text); }
	| ID '(' (actualParameters{ nodeText = $actualParameters.text;} )? ')'  // this works as function call since it has to return somthing
	{
		$node = new Node($ID.text + "(" + nodeText + ")");
	}
	| STRING_LITERAL { $node = new Node($STRING_LITERAL.text); }		        
	;

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

unary returns [Node node]
@init { int minuses = 0; }
	: ( PLUS | MINUS { minuses++; })* negation {
		String sign = (minuses \% 2 == 0)? "+" : "-";  // if number of minuses is even, the sign is +, otherwise the sign is -
		$node = new Node("" + sign + "" + $negation.node.getValue());
	}
	;
	
multdiv returns [Node node]
@init {boolean multExists = false;
       boolean divExists = false;
       boolean moduloExists = false;
       Node temp = null;
}
	: u1=unary { temp = $u1.node; }( ( MULT u2=unary{
		if(!multExists && !divExists && !moduloExists) {
			multExists = true;
		}
		
	 	Node multNode = new Node("*"); 
	 	
	 	multNode.addChild(temp);
	 	
		multNode.addChild($u2.node);
		
		temp = multNode;
	})
	| ( DIV u2=unary{
		if(!multExists && !divExists && !moduloExists) {
			divExists = true;
		}
		
	 	Node divNode = new Node("/"); 
	 	
	 	divNode.addChild(temp);
	 	
		divNode.addChild($u2.node);
		
		temp = divNode;
	} )
	| ( MODULO u2=unary{
		if(!multExists && !divExists && !moduloExists) {
			moduloExists = true;
		}
		
	 	Node moduloNode = new Node("mod"); 
	 	
	 	moduloNode.addChild(temp);
	 	
		moduloNode.addChild($u2.node);
		
		temp = moduloNode;
	} ) )*
	{ 
		$node = temp; 
	}
	;
	


addsub returns [Node node]
@init {boolean plusExists = false;
       boolean minusExists = false;
       Node temp = null;
}
	: m1=multdiv { temp = $m1.node; }
	( ( PLUS m2=multdiv {
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

	
type
	: 'int'
	| 'bool'
	| 'string'
	;	

	 
guiDecStatement returns [List<Node> nodes]
@init { Node temp; }
	: guiType ':' i1=ID  {
           $nodes = new ArrayList<Node>();
           temp = new Node($guiType.text + " " + $i1.text);
           $nodes.add(temp);
         }
     ( ',' i2=ID  { temp = new Node($guiType.text + " " + $i2.text);
                    $nodes.add(temp); } )* ';'
	/*
	: 'var' type ':' i1=ID {
           $nodes = new ArrayList<Node>();
           temp = new Node("var " + $type.text + " " + $i1.text);
         }
         (':=' e1=expression { 
           Node equalsNode = new Node(":=");
           equalsNode.addChild(temp);
           equalsNode.addChild($e1.node);
           temp = equalsNode;
         })? { $nodes.add(temp); }
         
         (',' i2=ID {
           temp = new Node("var " + $type.text + " " + $i2.text);
         }
         (':=' e2=expression
          { 
           Node equalsNode = new Node(":=");
           equalsNode.addChild(temp);
           equalsNode.addChild($e2.node);
           temp = equalsNode;
         })? { $nodes.add(temp); } )*   ';'
  ;
	*/
	;

guiTerm returns [Node node]
	: ID { $node = new Node($ID.text); }
	| '(' guiPositionExpression ')' { $node = $guiPositionExpression.node; }
	;
	
guiPositionExpression returns [Node node]
@init { Node temp = null; }
	: g1=guiTerm { temp = $g1.node; }
	 (positionKeyword g2=guiTerm {
	     Node positionNode = new Node($positionKeyword.text);
	     
	     positionNode.addChild(temp);
	     positionNode.addChild($g2.node);
	     
	     temp = positionNode;
	 } )+
	;
	
guiComparisonExpression returns [Node node]
	:  i1=ID 	guiComparsionTerm 	i2=ID
	{
	   Node idNode1 = new Node($i1.text);
	   Node idNode2 = new Node($i2.text);
	   
	   $node = new Node($guiComparsionTerm.text);
	   $node.addChild(idNode1);
	   $node.addChild(idNode2);
	}
	;
	

guiStatement returns [Node node, List<Node> nodes]
	: guiDecStatement {$nodes = $guiDecStatement.nodes; }
	| guiPositionExpression { $node = $guiPositionExpression.node; }';'
	| guiComparisonExpression { $node = $guiComparisonExpression.node; } ';'
	;

evntHandleStatement
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


/*------------------------------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------------------------------
*/
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

COMMENT : '//' .* ('\n'|'\r') { $channel=HIDDEN; };
	 
WS      : ( ' ' | '\t' | '\n' | '\r' | '\f' )+ { $channel=HIDDEN; };