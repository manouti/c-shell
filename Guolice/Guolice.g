grammar Guolice;

options {
	k = 2;
	language = C;
}


/* ------------------------ Define grammar tokens ------------------------ */
/*tokens
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
}*/

@parser::includes
{
#include	<Node.h>
#include	<iostream>
#include	<string>
#include	<vector>
#include	<map>
#include	<FunctionNode.h>
	
using namespace std;
}

@parser::members{
Node* root;
vector<Node*> variableDeclNodes;
vector<Node*> guiDeclNodes;
vector<FunctionNode*> functionList;
map<string, string> functionParameters;
vector<Node*> statements;

void printTree(Node* node) {
  cout << "Node: " << node->toString() << endl;
  
  for(int i = 0; i < node->getChildren().size(); i++) {
    printTree(node->getChildren().at(i));
  }
}
}



/*------------------------------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------------------------------
*/

program
@init { root = new Node("Program");}
@after { 
vector<Node*>::iterator i;
		for (i = statements.begin(); i != statements.end(); ++i){
			cout << " " << *i;
			//root->addChild(*i);
			
		}
	printTree(root); 
	FunctionNode* first = functionList.at(0);
       cout << "The first procedure is: " << first->toString() << endl;
	FunctionNode* second = functionList.at(1);
       cout << "The second procedure is: " << second->toString() << endl;
	        }
	: ( procedureDec | functionDec | statement {
	   
	   if($statement.node != 0) {
	   	statements.push_back($statement.node);
	    }
	   
	   
	     for(int i = 0; i < variableDeclNodes.size(); i++) {
           	 statements.push_back(variableDeclNodes[i]);
            	 //cout << "A variable declaration node is: " << variableDeclNodes[i]->toString() << endl;
            }
            for(int i = 0; i < guiDeclNodes.size(); i++) {
           	 statements.push_back(guiDeclNodes[i]);
            	 //cout << "A variable declaration node is: " << variableDeclNodes[i]->toString() << endl;
            }
            guiDeclNodes.clear();
            variableDeclNodes.clear();
         
     
     })*
 	;
 	
procedureDec
@init { FunctionNode* procedureNode; }
//@after { /*System.out.println("The procedure list is: " + functionList + "\n"); */}
	: 'procedure' ':' ID  { procedureNode = new FunctionNode((string)(char*)($ID.text->chars)); }
	'(' (parameters { procedureNode->setParameters(functionParameters); } )? ')'
		( statement { procedureNode->addChild($statement.node); } | exitStatement)*
		{
			procedureNode->setReturnType("void");
		  functionList.push_back(procedureNode); }
	  'end' 'procedure'
	;
	
	
functionDec
@init { FunctionNode* functionNode; }
//@after { /*System.out.println("The procedure list is: " + functionList + "\n"); */}
	: 'function' type ':' ID  { functionNode = new FunctionNode((string)(char*)($ID.text->chars)); }
	'(' (parameters { functionNode->setParameters(functionParameters); } )? ')'  // here (type) is the return value type of the function
		( statement { functionNode->addChild($statement.node); } )* returnStatement 
	  'end' 'function' { functionNode->setReturnType((string)(char*)($type.text->chars));
                       functionList.push_back(functionNode); }
	;


statement returns [Node* node]
	: ';'
	| assignmentStatement { $node = new Node($assignmentStatement.node);
	}
	| constantDecStatement { $node = new Node($constantDecStatement.node);
  	}
	| variableDecStatement 
	
	| ifStatement  { $node = new Node($ifStatement.node); }
	| whileStatement { $node = new Node($whileStatement.node); }
	| procedureCallStatement { $node = new Node($procedureCallStatement.node); }
	| guiStatement { $node = new Node($guiStatement.node);
	                  }
	| evntHandleStatement
	;
	
parameters
	: t1=type  ':' i1=ID {
	functionParameters[(string)(char*)($i1.text->chars)]=(string)(char*)($t1.text->chars);
  
	                   }
	  ( ',' t2=type  ':' i2=ID { 
	 functionParameters[(string)(char*)($i2.text->chars)]=(string)(char*)($t2.text->chars);
	 } )*
	;


//begin regular programing grammar

assignmentStatement returns [Node* node]
	: ID ':=' expression ';' {
		Node* idNode = new Node((string)(char*)($ID.text->chars));   // Create a node for the identifier
		Node* equalsNode = new Node(":=");   // Create a node for the assignment symbol
		
		// Now add the identifier node and the node returned by the expression rule to the assignment symbol node
		equalsNode->addChild(idNode);
		
		equalsNode->addChild($expression.node);
		
		$node = equalsNode;   // Return the assignment symbol node
	}
	;
		
constantDecStatement returns [Node* node]
//	: 'constant'ID ':' type ':=' expression ';'
	: 'constant' type ':' ID  ':=' expression ';' {
	     $node = new Node(":=");
	     
		 string constantText ("constant ");
		 constantText += (string)(char*)($type.text->chars);
		 constantText += " ";
		 constantText += (string)(char*)($ID.text->chars);
		 
	     Node * idNode = new Node(constantText);
	     
	     $node->addChild(idNode);
	     $node->addChild($expression.node);
	}
	;

variableDecStatement
@init{ Node * temp; }
//  : 'var' ID (','ID)* ':' type (':=' expression)?';'
	: 'var' type ':' i1=ID {
			 string varText ("var ");
			 varText += (string)(char*)($type.text->chars);
		     varText += " ";
		     varText += (string)(char*)($i1.text->chars);
	         
			 temp = new Node(varText);
	       }
	       (':=' e1=expression { 
	         Node * equalsNode = new Node(":=");
	         equalsNode->addChild(temp);
	         equalsNode->addChild($e1.node);
	         temp = equalsNode;
	       })? { variableDeclNodes.push_back(temp); }
	       
	       (',' i2=ID {
		     string varText ("var ");
			 varText += (string)(char*)($type.text->chars);
		     varText += " ";
		     varText += (string)(char*)($i2.text->chars);
           temp = new Node(varText);
         }
         (':=' e2=expression
          { 
           Node * equalsNode = new Node(":=");
           equalsNode->addChild(temp);
           equalsNode->addChild($e2.node);
           temp = equalsNode;
         })? { variableDeclNodes.push_back(temp); } )*   ';'
	;
	
ifStatement returns [Node* node]
@init { Node* thenNode; Node* elseNode; }
	: 'if' e1=expression 'then' { 
	     $node = new Node("if");                      //i.e     "if"
	                                                  //       /    \
	     $node->addChild($e1.node);                    //   "expr"   "then"  
	     thenNode = new Node("then");
	     $node->addChild(thenNode);
	} 
	     ( s1=statement{ thenNode->addChild($s1.node); } )*
/*-----( 'elseif' expression 'then' 
	  	statement*)*           ------*/    // We don't need this!!
	  ( 'else'   { elseNode = new Node("else");
	               $node->addChild(elseNode); 
	               }
	  	(s2=statement { elseNode->addChild($s2.node); } )* )?
	  'end' 'if'
	;
	
whileStatement returns [Node * node]
	: 'while' { $node = new Node("while"); } expression { $node->addChild($expression.node); }'loop'
	  ( statement { $node->addChild($statement.node); } | exitStatement)*
	  'end' 'loop'
	;
	
procedureCallStatement returns [Node * node]
	: ID '(' actualParameters? ')' { 
		string procedureCallText ((string)(char*)($ID.text->chars));
		procedureCallText += " (";
		procedureCallText += (string)(char*)($actualParameters.text->chars);
		procedureCallText += ")";
		
		$node = new Node(procedureCallText); } ';'
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

term returns [Node * node]
@init { string nodeText (""); }
	: INTEGER { $node = new Node((string)(char*)($INTEGER.text->chars)); }
	| '(' expression ')' { $node = $expression.node; }
	| ID { $node = new Node((string)(char*)($ID.text->chars)); }
	| ID '(' (actualParameters { nodeText = (string)(char*)($actualParameters.text->chars); } )? ')'  // this works as function call since it has to return somthing
	{
		string tempText ((string)(char*)($ID.text->chars));
		tempText += "(";
		tempText += nodeText;
		tempText += ")";
		
		$node = new Node(tempText);
	}
	| STRING_LITERAL	// I just added it for now because of the function call
	 { $node = new Node((string)(char*)($STRING_LITERAL.text->chars)); }
	;
	
			

negation returns [Node * node]
@init { int numberOfNots = 0; }
	: ( 'NOT' { numberOfNots++; } )* term
	{
		Node * returnNode = $term.node;
		
		for(int i = 0; i < numberOfNots; i++) {
			Node * notNode = new Node("NOT");
			notNode->addChild(returnNode);
			
			returnNode = notNode;
		}
		
		$node = returnNode;
	}
	;

unary returns [Node * node]
@init { int minuses = 0; }
	: ( '+' | '-' { minuses++; })* negation {
		string sign = (minuses \% 2 == 0)? "+" : "-";  // if number of minuses is even, the sign is +, otherwise the sign is -
		
		sign += $negation.node->getValue();
		$node = new Node(sign);
	}
	;
	
multdiv returns [Node* node]
@init {bool multExists = false;
       bool divExists = false;
       bool moduloExists = false;
       Node* temp;
}
	: u1=unary { temp = $u1.node; }( ( '*' u2=unary{
		if(!multExists && !divExists && !moduloExists) {
			multExists = true;
		}
		
	 	Node* multNode = new Node("*"); 
	 	
	 	multNode->addChild(temp);
	 	
		multNode->addChild($u2.node);
		
		temp = multNode;
	})
	| ( '/' u2=unary{
		if(!multExists && !divExists && !moduloExists) {
			divExists = true;
		}
		
	 	Node* divNode = new Node("/"); 
	 	
	 	divNode->addChild(temp);
	 	
		divNode->addChild($u2.node);
		
		temp = divNode;
	} )
	| ( 'MOD' u2=unary{
		if(!multExists && !divExists && !moduloExists) {
			moduloExists = true;
		}
		
	 	Node* moduloNode = new Node("mod"); 
	 	
	 	moduloNode->addChild(temp);
	 	
		moduloNode->addChild($u2.node);
		
		temp = moduloNode;
	} ) )*
	{ 
		$node = temp; 
	}
	;
	


addsub returns [Node* node]
@init {bool plusExists = false;
       bool minusExists = false;
       Node* temp;
}
	: m1=multdiv { temp = $m1.node; }( ( '+' m2=multdiv {
		if(!plusExists && !minusExists) {
			plusExists = true;
		}
		
	 	Node* plusNode = new Node("+"); 
	 	
	 	plusNode->addChild(temp);
	 	
		plusNode->addChild($m2.node);
		
		temp = plusNode;
	})
	| ( '-' m2=multdiv {
		if(!plusExists && !minusExists) {
			minusExists = true;
		}
		
	 	Node* minusNode = new Node("-"); 
	 	
	 	minusNode->addChild(temp);
	 	
		minusNode->addChild($m2.node);
		
		temp = minusNode;
	} ) )*
	{ 
		$node = temp; 
	}
	;
	
	
compare returns [Node* node]
@init {bool comparatorExists = false;
	Node* comparatorNode;
}
	: a1=addsub ( ( '=' a2=addsub {
		comparatorNode = new Node("=");
		comparatorNode->addChild($a1.node);
		
		comparatorNode->addChild($a2.node);
		
		comparatorExists = true;
	})
	
	| ( '/=' a2=addsub {
		comparatorNode = new Node("/=");
		comparatorNode->addChild($a1.node);
		
		comparatorNode->addChild($a2.node);
		
		comparatorExists = true;
	}) 
	| ( '<' a2=addsub {
		comparatorNode = new Node("<");
		comparatorNode->addChild($a1.node);
		
		comparatorNode->addChild($a2.node);
		
		comparatorExists = true;
	})
	| ( '<' '=' a2=addsub {
		comparatorNode = new Node("<=");
		comparatorNode->addChild($a1.node);
		
		comparatorNode->addChild($a2.node);
		
		comparatorExists = true;
	})
	| ( '>' a2=addsub {
		comparatorNode = new Node(">");
		comparatorNode->addChild($a1.node);
		
		comparatorNode->addChild($a2.node);
		
		comparatorExists = true;
	})
	| ( '>' '=' a2=addsub {
		comparatorNode = new Node(">=");
		comparatorNode->addChild($a1.node);
		
		comparatorNode->addChild($a2.node);
		
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

	
expression returns [Node* node]
@init {bool andExists = false;
       bool orExists = false;
       Node* temp;
}
	: c1=compare { temp = $c1.node; }( ( 'AND' c2=compare {
		if(!andExists && !orExists) {
			andExists = true;
		}
		
	 	Node* andNode = new Node("&&"); 
	 	
	 	andNode->addChild(temp);
	 	
		andNode->addChild($c2.node);
		
		temp = andNode;
	 })
	 
	| ( 'OR' c2=compare {
		if(!andExists && !orExists) {
			orExists = true;
		}
		
	 	Node* orNode = new Node("||"); 
	 	
	 	orNode->addChild(temp);
	 	
		orNode->addChild($c2.node);
		
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

	 
guiDecStatement
@init { Node* temp; }
//@after { /*System.out.println(nodes); */}
	: guiType ':' i1=ID  {
	string guiTypeText = (string)(char*)($guiType.text->chars);
	guiTypeText += " ";
	guiTypeText += (string)(char*)($i1.text->chars); 
           temp = new Node(guiTypeText);
           guiDeclNodes.push_back(temp);
         }
     ( ',' i2=ID  { 
     string guiTypeText = (string)(char*)($guiType.text->chars);
	guiTypeText += " ";
	guiTypeText += (string)(char*)($i2.text->chars); 
           temp = new Node(guiTypeText);
           guiDeclNodes.push_back(temp);
      } )* ';'
	;

guiTerm returns [Node* node]
	: ID { $node = new Node((string)(char*)($ID.text->chars)); }
	| '(' guiPositionExpression ')' { $node = $guiPositionExpression.node; }
	;
	
guiPositionExpression returns [Node* node]
@init { Node* temp; }
	: g1=guiTerm { temp = $g1.node; }
	 (positionKeyword g2=guiTerm {
	     Node* positionNode = new Node((string)(char*)($positionKeyword.text->chars));
	     
	     positionNode->addChild(temp);
	     positionNode->addChild($g2.node);
	     
	     temp = positionNode;
	     
	     $node = temp;
	 } )+
	;
	
guiComparisonExpression returns [Node* node]
	:  i1=ID 	guiComparsionTerm 	i2=ID
	{
	   Node* idNode1 = new Node((string)(char*)($i1.text->chars));
	   Node* idNode2 = new Node((string)(char*)($i2.text->chars));
	   
	   $node = new Node((string)(char*)($guiComparsionTerm.text->chars));
	   $node->addChild(idNode1);
	   $node->addChild(idNode2);
	}
	;
	

guiStatement returns [Node* node]
	: guiDecStatement
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