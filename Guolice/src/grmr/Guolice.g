grammar Guolice;

options {
	backtrack = true;
	k = 3 ;
	language = C;
}

@parser::includes
{
	#include	<iostream>
	#include	<cstdlib>
	#include	<fstream>
	#include	<string>
	#include	<vector>
	#include	<map>
	#include	<ParseTree.h>
	#include	<Node.h>	
	#include	<FunctionNode.h>
	#include	<guiCompare.h>
	#include	<guiConstruct.h>
	#include	<AbstractGui.h>	
	#include 	<Circle.h>
	#include 	<Box.h>
	#include 	<Triangle.h>
	#include	<stdio.h>
	#include	<GuoliceUtil.h>
	#include 	<Solution.h>

	using namespace std;
}

@parser::members{
    ParseTree* tree;
	Node* root;
	vector<Node*> variableDeclNodes;
	vector<Node*> guiDeclNodes;
	vector<FunctionNode*> functionList;
	map<string, string> functionParameters;
	vector<Node*> statements;
	
	map<Node*, string> variableIDs;

	map<string, string> guiNodeModes;
	map<string, vector<AbstractGui*> > guiObject ;

	char* metadata_file = "../tests/gui_metadata";

	string comparison_output = "";

/** \function
*	\param Node* pointer from the Type Node
*	
*	\brief Print the nodes in the tree
*
*/

	void printTree(Node* node) {
		cout << "\nNode: " << node->toString() << endl;
		for(int i = 0; i < node->getChildren().size(); i++) 
		{
			printTree(node->getChildren().at(i));
		}
	}

/** \function
*	\brief Print the list of the Function or the procedure members
*
*/ 

	void printFunctionList() {
        cout << "[ ";
        for (int i = 0; i < functionList.size(); i++)
        {
            if(functionList[i] != NULL) 
			{
                cout << functionList[i]->toString();
                cout << endl;
            }
        }
        cout << "]\n";
    }
}



/*------------------------------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------------------------------
*/

program
@init 	{ 
			root = new Node("PROGRAM");
			guiObject["Circle"] = guiConstruct::guiCircleConstruct(metadata_file, "Circle");
			guiObject["Box"] = guiConstruct::guiBoxConstruct(metadata_file, "Box");
			guiObject["Triangle"] = guiConstruct::guiTriangleConstruct(metadata_file, "Triangle");
	 	}
@after {

			vector<Node*>::iterator i;
			for (i = statements.begin(); i != statements.end(); ++i)
			{
				root->addChild(*i);
			}

			printTree(root);

			cout <<  "The list of functions is: \n" << endl;
			printFunctionList();

		    tree = new ParseTree(root);
		    tree->varIDs = variableIDs;
		    Graph::pTree = tree;

		    cout << "\nNUMBER OF NODES: " << tree->getNodeCount() << endl;

			/************************************* Print Compasition Output *************************************/
			ifstream check_metadata (metadata_file);
			if (check_metadata != NULL)
			{
				check_metadata.close();

				cout << endl << endl;
				cout << "****************************************************************************************************" << endl;
				cout << endl << endl << "GUI Comparision Output:" << endl << endl;
				cout << comparison_output << endl;
			}
			/****************************************************************************************************/
	   }
	
	: ( procedureDec | functionDec | statement 
		{
			/**
			*	in the main program you can declare functions, procedures, or statements
			*/

			if($statement.node ->getValue() != "emptyMark") 
			{
				statements.push_back($statement.node);
			}

			for(int i = 0; i < variableDeclNodes.size(); i++) 
			{
		       		statements.push_back(variableDeclNodes[i]);
			}

			for(int i = 0; i < guiDeclNodes.size(); i++) 
			{
				statements.push_back(guiDeclNodes[i]);
			}

			guiDeclNodes.clear();
			variableDeclNodes.clear();
     	}
	)*
 	;



procedureDec
@init 	{ 
			Node* procedureRootNode;
			FunctionNode* procedureTree;
/** to declare a procedure, use the syntax
*******************************************
*	procedure : ID ( <parameters> )
*	<statemets> or <exit statement>
*	end procedure
*******************************************
*	The parameters are optional and when using more than one parameter
*	you should separate them with ','
*	when using parameters you should specify the type of the parameter
*
*	Ex: procedure : pro1 (int : param1 , int : param2)
*		<statements>
*		end procedure		
*/
}

	: 'procedure' ':' ID  { procedureRootNode = new Node((string)(char*)($ID.text->chars)); 
							procedureTree = new FunctionNode(procedureRootNode); }
	'(' (parameters { procedureTree->setParameters(functionParameters); } )? ')'
	( statement 
		{
			if($statement.node ->getValue() != "emptyMark") 
			{
				 procedureRootNode->addChild($statement.node);
			}
	   	} 
	| exitStatement)*
		{
			procedureTree->setReturnType("void");
			functionList.push_back(procedureTree); 
		}
	'end' 'procedure'
	;



functionDec
@init { Node* functionRootNode;
		FunctionNode* functionTree;

/** To declare the function, use the syntax
*******************************************
*	function <type> : ID ( <parameters> )
*	<statemets>
*	<return statement>
*	end function
*******************************************
*	The parameters are optional and when using more than one parameter
*	you should separate them with ','
*	when using parameters you should specify the type of the parameter
*
*	Ex: function int : FUNC1 (int : param1 , int : param2)
*		<statements>
*		return val1;
*		end function		
*/
}
	: 'function' type ':' ID  { functionRootNode = new Node((string)(char*)($ID.text->chars)); }
	'(' (parameters { functionTree->setParameters(functionParameters); } )? ')'  // here (type) is the return value type of the function
	( statement 
		{
			if($statement.node ->getValue() != "emptyMark") 
			{
				functionRootNode->addChild($statement.node);
			}
			for(int i = 0; i < variableDeclNodes.size(); i++) 
			{
				functionRootNode->addChild(variableDeclNodes[i]);
			}
			for(int i = 0; i < guiDeclNodes.size(); i++) 
			{
				functionRootNode->addChild(guiDeclNodes[i]);
			}
			
			guiDeclNodes.clear();
			variableDeclNodes.clear();
	   	} 
	)* 
	returnStatement
	'end' 'function' 
		{ 
			functionTree->setReturnType((string)(char*)($type.text->chars));
			functionList.push_back(functionTree); 
		}
	;



parameters
	: t1=type  ':' i1=ID 
		{ functionParameters[(string)(char*)($i1.text->chars)]=(string)(char*)($t1.text->chars);}
	( ',' t2=type  ':' i2=ID 
		{ functionParameters[(string)(char*)($i2.text->chars)]=(string)(char*)($t2.text->chars);}
	)*
	;



statement returns [Node* node]
@init {
/** 
*	The statement could be an assignment Statement, a constant declaration Statement,
*	a variable declaration statement, an if statement, a while statement, a procedure call statement,
*	a GUI statement or an event handle statement.
*
*/
}
	: ';'
	| assignmentStatement 
		{ $node = $assignmentStatement.node;}
	| constantDecStatement 
		{ $node = $constantDecStatement.node;}
	| variableDecStatement 
		{ $node = $variableDecStatement.node;}
	| ifStatement  
		{ $node =$ifStatement.node; }
	| whileStatement 
		{ $node = $whileStatement.node; }
	| procedureCallStatement 
		{ $node = $procedureCallStatement.node; }
	| guiStatement 
		{ $node = $guiStatement.node; }
	| evntHandleStatement 
		{ $node = $evntHandleStatement.node; }
	;



//begin regular programming grammar

assignmentStatement returns [Node* node]
@init{
/** 
*	The  assignment statement syntax is:
******************************************
*	ID := <expression> ;
******************************************
*	The assignment statement ends with ;
*	and the expression could be an integer or string
*	or a mathematical expression like 4+(5*2)
*
*/
}
	: ID ':=' expression ';' 
		{
			Node* idNode = new Node((string)(char*)($ID.text->chars));   // Create a node for the identifier
			idNode->setType(Node::VAR); // Set this node as a variable node
			
			Node* equalsNode = new Node(":=");   // Create a node for the assignment symbol
			// Now add the identifier node and the node returned by the expression rule to the assignment symbol node
			equalsNode->addChild(idNode);
			equalsNode->addChild($expression.node);
			equalsNode->setType(Node::OP);  // Set this node as an operation node (assignment)
			$node = equalsNode;   // Return the assignment symbol node
		}
	;



constantDecStatement returns [Node* node]
@init{
/** 
*	the  constant declaration Statement syntax is:
******************************************
*	constant <type> : ID  := <expression> ; 
******************************************
*	The constant declaration statement ends with ';'
*	and the expression could be an int or string
*	or a mathematical expression like 4+(5*2)
*	the <type> could be int, bool or string.
*/
}
	: 'constant' type ':' ID  ':=' expression ';' 
		{
			$node = new Node(":=");

			string constantText ("");
			constantText += (string)(char*)($ID.text->chars);
			constantText += " ( ";
			constantText += (string)(char*)($type.text->chars);
			constantText += " constant ) ";
			
			Node * idNode = new Node(constantText);
			idNode->setType(Node::VAR);
			variableIDs[idNode] = (string)(char*)($ID.text->chars);
			
			$node->addChild(idNode);
			$node->addChild($expression.node);
			$node->setType(Node::OP);
		}
	;



variableDecStatement returns [Node* node]
@init{
/** 
*	the  variable Decleration Statement syntax is:
******************************************
*	var <type> : ID  := <expression> ; 
******************************************
*	the variable Decleration Statement ends with ;
*	the expression is optional.
*	the expression could be an int or string
*	or a mathematical expression like 4+(5*2)
*	the <type> could be int, bool or string.
*/
}
	: 'var' type ':' i1=ID 
		{
			string varText ("") ;
			varText += (string)(char*)($i1.text->chars);
			varText += " ( ";
			varText += (string)(char*)($type.text->chars);
			varText += " variable ) ";
			
			$node = new Node (varText);
			$node->setType(Node::VAR);
			variableIDs[$node] = (string)(char*)($ID.text->chars);
	    }
	(':=' e1=expression 
		{
			Node * equalsNode = new Node(":=");
			equalsNode->setType(Node::OP);
			equalsNode->addChild($node);
			equalsNode->addChild($e1.node);
			$node = equalsNode;
	    }
	)? 
	';'
	;



ifStatement returns [Node* node]
@init { Node* thenNode; Node* elseNode;
/** 
*	The  if statement syntax is:
***********************************
*	if <expression> then
*	<statements>
*	else
*	<statements>
*	end if
***********************************
* 
*	the expression is either a regular expression or gui Compare Expression.
*/
}
	: 'if' 	
		{
			$node = new Node("if");
			$node->setType(Node::OP);
		}
	( expression
		{$node->addChild($expression.node);}
	| guiCompareExpression
		{$node->addChild($guiCompareExpression.node);}
	)  
	'then'
		{
			thenNode = new Node("then");
			thenNode->setType(Node::OP);
			$node->addChild(thenNode);
		}
	
	( s1=statement 
		{ thenNode->addChild($s1.node); } 
	)*

	( 'else'   
		{ 
			elseNode = new Node("else");
			elseNode->setType(Node::OP);
	      	$node->addChild(elseNode);
	   	}
	( s2=statement 
		{ elseNode->addChild($s2.node); } 
	)* 
	)?
	'end' 'if'
	;



whileStatement returns [Node * node]
@init{
/** 
*	The  while statement syntax is:
***********************************
*	while <expression> loop
*	<statements>
*	end loop
***********************************
* 
*	The expression is  a regular expression (i.e. int)
*	or a mathematical expression like ( iterator < 5 ) which can be valued as a boolean
*/
}
	: 'while' 
		{ 
			$node = new Node("while"); 
			$node->setType(Node::OP); 
		} 
	expression 
		{ $node->addChild($expression.node); }
	'loop'
	( statement 
		{ $node->addChild($statement.node); } 
	| exitStatement
	)*
	'end' 'loop'
	;



procedureCallStatement returns [Node * node]
@init{
/** 
*	The  procedure call Statement syntax is:
***********************************
*	ID ( <parameters> );
***********************************
* 	
*	The parameters are optional and when using more than one parameter
*	you should separate them with ','
*	and when calling the procedure we don't specify the type of the parameters.
*
*/
}
	: ID  
	('(' actualParameters ')' 
		{
			string procedureCallText ((string)(char*)($ID.text->chars));
			procedureCallText += " (";
			procedureCallText += (string)(char*)($actualParameters.text->chars); 
			procedureCallText += ")";

			$node = new Node(procedureCallText);
			$node->setType(Node::OP);
			for(int i = 0; i < $actualParameters.node->getChildren().size(); i++) 
			{
				$node->addChild($actualParameters.node->getChildren().at(i));
			}
		}

	| '(' ')' 
		{
			string procedureCallText ((string)(char*)($ID.text->chars));
			procedureCallText += " ( )";
			$node = new Node(procedureCallText);
			$node->setType(Node::OP);
		}
	) 
	';'
	;



actualParameters returns [Node * node]
	: e1=expression 
		{ 
			$node = new Node();
			$node->addChild($e1.node);
		}
	(',' e2=expression 
		{$node->addChild($e2.node);}
	)*
	;



exitStatement
@init{
/** 
*	The  exit statement syntax is:
***********************************
*	exit when <expression> ;
***********************************
* 	OR
***********************************
*	exit now ;
***********************************
*	we use this statement inside while statement
*
*/
}
	: 'exit''when' expression ';'
	| 'exit''now'';'
	;



returnStatement
@init{
/** 
*	the  return Statement syntax is:
***********************************
*	return <expression> ;
***********************************
*	we use this statement inside the function declaration
*
*/
}
	: 'return' expression ';'
	;



term returns [Node * node]
@init 	{ string tempText (""); }
	: INTEGER 
		{ 
			$node = new Node((string)(char*)($INTEGER.text->chars));
			$node->setType(Node::CONST); 
		}

	| '(' expression ')' 
		{ $node = $expression.node; }

	| ID 
		{	
			$node = new Node((string)(char*)($ID.text->chars)); 
			$node->setType(Node::VAR); 
		}

	| ID '(' actualParameters ')'
		{ 	
			tempText = (string)(char*)($actualParameters.text->chars);    
			string nodeText ((string)(char*)($ID.text->chars));
			nodeText += "(";
			nodeText += tempText;
			nodeText += ")";
			$node = new Node(nodeText);
			$node->setType(Node::OP);
			
			for(int i = 0; i < $actualParameters.node->getChildren().size(); i++) 
			{
				$node->addChild($actualParameters.node->getChildren().at(i));
			}
		} 

	| ID '(' ')' 
		{ 	
			string nodeText ((string)(char*)($ID.text->chars));
			nodeText += "( )";
			$node = new Node(nodeText);
			$node->setType(Node::OP);
		}

	| STRING_LITERAL
		{
			string nodeText ((string)(char*)($STRING_LITERAL.text->chars));
			nodeText = nodeText.substr(1, nodeText.length() - 2);
			$node = new Node(nodeText); $node->setType(Node::CONST); 
		}
	;



negation returns [Node * node]
@init 	{ int numberOfNots = 0; }
	: ( 'NOT' { numberOfNots++; } )* term
		{
			Node * returnNode = $term.node;
			for(int i = 0; i < numberOfNots; i++) 
			{
				Node * notNode = new Node("NOT");
				notNode->setType(Node::OP);
				notNode->addChild(returnNode);
				returnNode = notNode;
			}
			$node = returnNode;
		}
	;



unary returns [Node * node]
@init 	{ int minuses = 0; }
	: ( '+' | '-' { minuses++; })* negation 
		{
			string sign = (minuses \% 2 == 0)? "" : "-";  // if number of minuses is even, the sign is "", otherwise the sign is -
			if (minuses \% 2 == 0)
			{	
				$node = $negation.node;
			}
			else
			{			
				$node = new Node("-");
				$node->setType(Node::OP);
				$node->addChild($negation.node);			
			}	
		}
	;



multdiv returns [Node* node]
@init 	{
			Node* temp;
			string nodeName;
		}
	: u1=unary 	{temp = $u1.node;}
	( 
	( '*' 		{nodeName = "*";}

	|  '/' 		{nodeName = "/";} 

	| 'MOD'		{nodeName = "mod";} 
	  
	) u2=unary	
		{	
			Node* multdivNode = new Node(nodeName);
			multdivNode->setType(Node::OP);
			multdivNode->addChild(temp);
			multdivNode->addChild($u2.node);
			temp = multdivNode;
		}
	)*
		{$node = temp;}
	;



addsub returns [Node* node]
@init 	{
			Node* temp;
			string nodeName;
		}
	: m1=multdiv	{temp = $m1.node;}
	( 

	( '+'  			{nodeName = "+";}
		  
	| '-'  			{nodeName = "-";} 

	) m2=multdiv
		{
			Node* addsubNode = new Node(nodeName);
			addsubNode->setType(Node::OP);
			addsubNode->addChild(temp);
			addsubNode->addChild($m2.node);
			temp = addsubNode;
		}
	)*
		{$node = temp;}
	;



compare returns [Node* node]
@init 	{
			Node* temp;
			string nodeName;
		}
	: a1=addsub {temp = $a1.node;}
	( 

	( '='  		{nodeName = "=";}

	| '!=' 		{nodeName = "!=";}
	
	| '<'  		{nodeName = "<";}
	
	| '<' '=' 	{nodeName = "<=";} 

	| '>'  		{nodeName = ">";}
		
	| '>' '=' 	{nodeName = ">=";}
		
	) a2=addsub
		{
			Node* comparatorNode = new Node(nodeName);
			comparatorNode->setType(Node::OP);
			comparatorNode->addChild(temp);
			comparatorNode->addChild($a2.node);
			temp = comparatorNode;
		}
	)?
		{$node = temp;}
	;



expression returns [Node* node]
@init 	{
			Node* temp;
			string nodeName;
		}
	: c1=compare 	{temp = $c1.node;}
	( 
	( 'AND' 		{nodeName = "AND";}
		
	| 'OR' 			{nodeName = "OR";}

	) c2=compare 
		{
			Node* comparatorNode = new Node(nodeName);
			comparatorNode->setType(Node::OP);
			comparatorNode->addChild(temp);
			comparatorNode->addChild($c2.node);
			temp = comparatorNode;
		}
	)*
		{$node = temp;}
	;



type
	: 'int'
	| 'bool'
	| 'string'
	;



guiDecStatement returns [Node* node]
@init {
/** 
*	The  GUI Declaration statement syntax is:
******************************************
*	<guiType> : ID ;
******************************************
*	The GUI declaration Statement ends with ';'
*	The <guiType> can be either: Circle, Box, Triangle or Label.
*
*/
}
	: guiType ':' i1=ID  
		{
			string guiTypeText = (string)(char*)($i1.text->chars);
			guiTypeText += " ( ";
			guiTypeText += (string)(char*)($guiType.text->chars);
			guiTypeText += " ) ";

			$node = new Node(guiTypeText);
			$node->setType(Node::VAR);
			
			variableIDs[$node] = (string)(char*)($ID.text->chars);
			
			guiNodeModes[variableIDs[$node]] = (string)(char*)($guiType.text->chars);

		}
	';'
	;



guiTerm returns [Node* node]
@init {
/** 
*	The GUI Term is either a GUI which we expressed it with its ID
*	or it's a guiPositionExpression which represents a position relation between GUI terms. 
*
*/
}
	: ID 
		{
			$node = new Node((string)(char*)($ID.text->chars));
			$node->setType(Node::VAR);

			if (guiNodeModes[(string)(char*)($ID.text->chars)] == "")
			{
				$node->setMode("ERROR");
			}
			else
			{
				$node->setMode(guiNodeModes[(string)(char*)($ID.text->chars)]);
			}

		}

	| '(' guiCompareExpression ')' 
		{ $node = $guiCompareExpression.node; $node->setType(Node::OP); }
	;



guiCompareExpression returns [Node* node]
@init { Node* temp;
/** 
*	The  GUI compare expression syntax is:
******************************************
*	<guiTerm> <guiCompareKeyword> <guiTerm>
******************************************
*	The <guiCompareKeyword>s are: LeftOf, RightOf, Above, Below, Contains, AND, Or, SmallerThan, BiggerThan and EqualTo.
*
*/
}
	: g1=guiTerm { temp = $g1.node; }
	 (guiCompareKeyword g2=guiTerm 
		{
			Node* compareNode = new Node((string)(char*)($guiCompareKeyword.text->chars));
			compareNode->setType(Node::OP);
			
			compareNode->addChild(temp);
			compareNode->addChild($g2.node);

			$node= compareNode;

			if ($g1.node->getMode() == "ERROR")
			{
				comparison_output += "*** error: '" + $g1.node->getValue() + "' was not declared.\n";
			}
			if ($g2.node->getMode() == "ERROR")
			{
				comparison_output += "*** error: '" + $g2.node->getValue() + "' was not declared.\n";
			}
		} )
	;



guiStatement returns [Node* node]
@init {
/** 
*	The  GUI statements are either GUI declaration statemet or GUI compare expression.
*	and the GUI staements are like the regular statements should end with ';'
*
*/
 }
	: guiDecStatement
		{ $node = $guiDecStatement.node ;}

	| guiCompareExpression 
		{ 	
			$node = $guiCompareExpression.node;
			comparison_output += "\nEvaluating '" + (string)(char*)($guiCompareExpression.text->chars) + "'\n";
			vector<vector<Solution> > solutions;
			solutions = node->evaluate(guiObject);
			char cstr[25];
			GuoliceUtil::int2str(cstr, solutions.size());
			comparison_output += "Number Of solutions: " + string(cstr) + "\n";
			comparison_output += "=======================\n";
			for (int solutionIt = 0 ; solutionIt < solutions.size() ; solutionIt++)
			{
				GuoliceUtil::int2str(cstr, solutionIt + 1);
				comparison_output += "\n    Solution: " + string(cstr) + "\n";
				comparison_output += "    ------------\n";
				for (int solutionIt_sub = 0; solutionIt_sub < solutions.at(solutionIt).size() ; solutionIt_sub++)
				{
					comparison_output += "    " + solutions.at(solutionIt).at(solutionIt_sub).varName + ": " + 
										solutions.at(solutionIt).at(solutionIt_sub).shape->toString() + "\n";
				}
			}
		}  
	';'
	;



evntHandleStatement returns [Node* node]
@init {
/** 
*	The event handle statement syntax is:
******************************************
*	ID.<eventType>
*	(
*	<statements>
*	) ;
******************************************
*	The <eventType>s are: OnClick and KeyPress.
*
*/
 }
	: ID '.' eventType 
			{
				$node = new Node((string)(char*)($eventType.text->chars));
				Node* idNode = new Node((string)(char*)($ID.text->chars));
				idNode->setType(Node::VAR);
				$node->addChild(idNode);
				$node->setType(Node::OP);
				
			}'('
	( statement 
			{
				$node->addChild($statement.node);
			})*
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

guiCompareKeyword
	: 'LeftOf'
	| 'RightOf'
	| 'Above'
	| 'Below'
	| 'Contains'
	| 'SmallerThan'
	| 'BiggerThan'
	| 'EqualTo'
	| 'AND'
	| 'OR'
	;



/*------------------------------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------------------------------
*/
fragment LETTER : ('a'..'z' | 'A'..'Z');
fragment DIGIT : '0'..'9' ;

STRING_LITERAL    // we can write any thing here including (\") which will be understood it as  (")
	: '"'
		 ( '\\' '\"'  |   ~('"' |  '\n'| '\r')	 )*
	  '"'
	;
	
ID	: LETTER ( LETTER | DIGIT | '_')*;

INTEGER : DIGIT+ ;

COMMENT : '//' .* ('\n'|'\r') { $channel=HIDDEN; };

WS      : ( ' ' | '\t' | '\n' | '\r' | '\f' )+ { $channel=HIDDEN; };
