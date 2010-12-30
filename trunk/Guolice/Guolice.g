grammar Guolice;

options {
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

	using namespace std;
}

@parser::members{
	Node* root;
	vector<Node*> variableDeclNodes;
	vector<Node*> guiDeclNodes;
	vector<FunctionNode*> functionList;
	map<string, string> functionParameters;
	vector<Node*> statements;
	
	map<Node*, string> variableIDs;
	
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
		for (int i=0; i < functionList.size(); i++) 
		{
			cout << functionList[i]->toString() << "The function " << functionList[i]->getValue() << " members : ";
			for (int j=0; j < functionList[i]->getChildren().size(); j++)
			{ 
				printTree(functionList[i]->getChildren().at(j));
			}
			cout << endl;
		}
		cout << "]\n";
	}
	
	/**
	  Prints the node information in the dot format.
	*/
	/*string visitNode(Node* node) {
		string nodeDot ("node");
		
		stringstream oss;
		oss << dotNodeCount++;
		nodeDot += oss.str();
		
		nodeNames[node] = nodeDot; // Store the label of the node in the dot file, e.g. node13 in the map "nodeNames"
		
		nodeDot += "[label=\"";
		nodeDot += node->getValue();
		nodeDot += "\",";
		switch(node->getType()) {
			case Node::VAR:
				{
				string variableColor;
				
				if (varColors.find(node->getValue()) != varColors.end()) {
					variableColor = varColors[node->getValue()];
				}
				else {
					double red = static_cast<double> (rand()) / static_cast<double> (RAND_MAX);
					double green = static_cast<double> (rand()) / static_cast<double> (RAND_MAX);
					double blue = static_cast<double> (rand()) / static_cast<double> (RAND_MAX);
					
					oss.flush();
					oss << red << " " << green << " " << blue;
					variableColor = oss.str();
					
					varColors[node->getValue()] = variableColor;
				}
				
				nodeDot += "rank=sink,style=filled,color=\"" + variableColor +  "\"];\n";
				}
				break;
			case Node::CONST:
				nodeDot += "shape=box];\n";
				break;
			case Node::OP:
				 nodeDot += "shape=diamond];\n";
		}
		
		return nodeDot;
	}*/
	
	/**
	  Prints the edge information in the dot format.
	*/
	/*string visitEdge(Node* node1, Node* node2) {
		string edgeDot ("\n");
		edgeDot += nodeNames[node1] + " -> " + nodeNames[node2] + ";";
		return edgeDot;
	}
	
  	void getNodesDot(Node* node, ofstream& dotFile) {
		dotFile << visitNode(node);
  		
  		for(int i = 0; i < node->getChildren().size(); i++) 
		{
			getNodesDot(node->getChildren().at(i), dotFile);
		}
	}

	void getEdgesDot(Node* parent, ofstream& dotFile) {
		for(int i = 0; i < parent->getChildren().size(); i++) {
			dotFile << visitEdge(parent, parent->getChildren().at(i));
			getEdgesDot(parent->getChildren().at(i), dotFile);
		}
	}
	
	void getDot(char* fileName) {
		ofstream dotFile;
  		dotFile.open(fileName);
  		
  		dotFile << "digraph GuoliceParseGraph  {\n";
  		dotFile << "graph[ordering=out];\n";

		dotFile << "//------------------- Node declarations -------------------\n";  		
  		getNodesDot(root, dotFile);

		dotFile << "//------------------- Edge declarations -------------------\n";  		
		getEdgesDot(root, dotFile);
				
		dotFile << "}";
		
  		dotFile.close();
  	}*/
}



/*------------------------------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------------------------------
*/

program
@init { root = new Node("PROGRAM"); }
@after {

		vector<Node*>::iterator i;
		for (i = statements.begin(); i != statements.end(); ++i)
		{
			//cout << " " << *i;
			root->addChild(*i);
		}

		printTree(root);

		cout <<  "The list of functions is: \n" << endl;
		printFunctionList();
		
		//getDot("Graph.dot"); // Dump the dot output to a file

		ParseTree *pTree = new ParseTree(root);
		
		pTree->varIDs = variableIDs;
		
		ofstream dotFile; // Output file stream for the dot file.
		dotFile.open("Graph.dot");
  		
  		dotFile << "digraph GuoliceParseGraph  {\n";
  		dotFile << "graph[ordering=out];\n";

		pTree->traverse(root); // Get the dot output.
		
		dotFile << "\n//-------------------- Node Declarations --------------------\n";	
		
		for(int i = 0; i < pTree->nodeDeclarations.size(); i++) {
			dotFile << pTree->nodeDeclarations[i];
		}
		
		dotFile << "\n//-------------------- Edge Declarations --------------------\n";
		
		for(int j = 0; j < pTree->edgeDeclarations.size(); j++) {
			dotFile << pTree->edgeDeclarations[j];
		}
		
		dotFile << "\n\n";
		/*
		for (int i=0; i < functionList.size(); i++) 
		{
			// TODO: Separate variableIDs from each other to separate the parsegraphs.
			
			ParseTree *functionParseTree = new ParseTree(functionList[i]);
			
			functionParseTree->varIDs = variableIDs;
		
			functionParseTree->traverse(functionList[i]);
			
			dotFile << "\n//-------------------- Node Declarations for Function " << functionList[i]->getValue() << "--------------------\n";	
		
			for(int i = 0; i < functionParseTree->nodeDeclarations.size(); i++) {
				dotFile << functionParseTree->nodeDeclarations[i];
			}
		
			dotFile << "\n//-------------------- Edge Declarations for Function " << functionList[i]->getValue() << "--------------------\n";
		
			for(int j = 0; j < functionParseTree->edgeDeclarations.size(); j++) {
				dotFile << functionParseTree->edgeDeclarations[j];
			}
			
			dotFile << "\n";
		}
		*/
		dotFile << "}";
		
  		dotFile.close();
		
		cout << "\nNUMBER OF NODES: " << pTree->getNodeCount() << endl;
		
		system("dot -Tsvg Graph.dot -o G.svg");  // Create the svg file
		
		/*FunctionNode* first = functionList.at(0);
		cout << "The first procedure is: " << first->toString() << endl;
		FunctionNode* second = functionList.at(1);
		cout << "The second procedure is: " << second->toString() << endl;*/
	   }
	
	: ( procedureDec | functionDec | statement {
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
            		//cout << "A variable declaration node is: " << variableDeclNodes[i]->toString() << endl;
		}
		for(int i = 0; i < guiDeclNodes.size(); i++) 
		{
			statements.push_back(guiDeclNodes[i]);
			//cout << "A variable declaration node is: " << variableDeclNodes[i]->toString() << endl;
		}
		guiDeclNodes.clear();
		variableDeclNodes.clear();
     })*
 	;

procedureDec
@init { FunctionNode* procedureNode;
/** to declare the procedure use the syntax
*******************************************
*	procedure : ID ( <parameters> )
*	<statemets> or <exit statement>
*	end procedure
*******************************************
*	the parameters are optional and when using more than one parameter
*	you should seperet them with ','
*	when using parameters you should specify the type of the parameter
*
*	Ex: procedure : pro1 (int : param1 , int : param2)
*		<statements>
*		end procedure		
*/
 }

	: 'procedure' ':' ID  { procedureNode = new FunctionNode((string)(char*)($ID.text->chars)); }
	'(' (parameters { procedureNode->setParameters(functionParameters); } )? ')'
		( statement 
		{
			if($statement.node ->getValue() != "emptyMark") 
			{
				 procedureNode->addChild($statement.node);
			}
/*			for(int i = 0; i < variableDeclNodes.size(); i++) 
			{
				procedureNode->addChild(variableDeclNodes[i]);
           		}
            		for(int i = 0; i < guiDeclNodes.size(); i++) 
			{
				procedureNode->addChild(guiDeclNodes[i]);
            		}
			
            		guiDeclNodes.clear();
            		variableDeclNodes.clear();*/
	   	} 
		| exitStatement)*
		{
			procedureNode->setReturnType("void");
			functionList.push_back(procedureNode); 
		}
	  'end' 'procedure'
	;


functionDec
@init { FunctionNode* functionNode; 
/** to declare the function use the syntax
*******************************************
*	function <type> : ID ( <parameters> )
*	<statemets>
*	<return statement>
*	end function
*******************************************
*	the parameters are optional and when using more than one parameter
*	you should seperet them with ','
*	when using parameters you should specify the type of the parameter
*
*	Ex: function int : FUNC1 (int : param1 , int : param2)
*		<statements>
*		return val1;
*		end function		
*/
}
//@after { /*System.out.println("The procedure list is: " + functionList + "\n"); */}
	: 'function' type ':' ID  { functionNode = new FunctionNode((string)(char*)($ID.text->chars)); }
	'(' (parameters { functionNode->setParameters(functionParameters); } )? ')'  // here (type) is the return value type of the function
		( statement 
		{
			if($statement.node ->getValue() != "emptyMark") 
			{
				functionNode->addChild($statement.node);
			}
			for(int i = 0; i < variableDeclNodes.size(); i++) 
			{
				functionNode->addChild(variableDeclNodes[i]);
			}
			for(int i = 0; i < guiDeclNodes.size(); i++) 
			{
				functionNode->addChild(guiDeclNodes[i]);
			}
			
			guiDeclNodes.clear();
			variableDeclNodes.clear();
	   	} )* returnStatement
	  'end' 'function' { functionNode->setReturnType((string)(char*)($type.text->chars));
                       functionList.push_back(functionNode); }
	;

parameters
	: t1=type  ':' i1=ID 
		{ functionParameters[(string)(char*)($i1.text->chars)]=(string)(char*)($t1.text->chars);}
	  ( ',' t2=type  ':' i2=ID 
		{ functionParameters[(string)(char*)($i2.text->chars)]=(string)(char*)($t2.text->chars);}
	  )*
	;

statement returns [Node* node] 
@init{
/** 
*	the statemets could be assignment Statement, constant Decleration Statement,
*	variable Decleration Statement, if Statement, while Statement, procedure Call Statement,
*	gui Statement or event Handle Statement.
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




//begin regular programing grammar

assignmentStatement returns [Node* node]
@init{
/** 
*	the  assignment Statement syntax is:
******************************************
*	ID := <expression> ;
******************************************
*	the assignment Statement ends with ;
*	and the expression could be an integer or string
*	or a mathmatical expression like 4+(5*2)
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
*	the  constant Decleration Statement syntax is:
******************************************
*	constant <type> : ID  := <expression> ; 
******************************************
*	the constant Decleration Statement ends with ;
*	and the expression could be an int or string
*	or a mathmatical expression like 4+(5*2)
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
@init{ /*Node * temp;*/
/** 
*	the  variable Decleration Statement syntax is:
******************************************
*	var <type> : ID  := <expression> ; 
******************************************
*	the variable Decleration Statement ends with ;
*	the expression is optional.
*	the expression could be an int or string
*	or a mathmatical expression like 4+(5*2)
*	the <type> could be int, bool or string.
*/
 }
	: 'var' type ':' i1=ID 
		{
			//string varText ("var ");
			string varText ("") ;
			varText += (string)(char*)($i1.text->chars);
			varText += " ( ";
			varText += (string)(char*)($type.text->chars);
			varText += " variable ) ";
			

			//temp = new Node(varText);
			$node = new Node (varText);
			$node->setType(Node::VAR);
			
			variableIDs[$node] = (string)(char*)($ID.text->chars);
			
	    }
	(':=' e1=expression 
		{
			Node * equalsNode = new Node(":=");
			equalsNode->setType(Node::OP);
			
			//equalsNode->addChild(temp);
			equalsNode->addChild($node);
			equalsNode->addChild($e1.node);
			$node = equalsNode;
	    })? //{ variableDeclNodes.push_back(temp); }

	 ';'
	;

ifStatement returns [Node* node]
@init { Node* thenNode; Node* elseNode;
/** 
*	the  if Statement syntax is:
***********************************
*	if <expression> then
*	<statements>
*	else
*	<statements>
*	end if
***********************************
* 
*	the expression is either a regular expression or gui Comparison Expression 
*	or guiPositionExpression.
*	the expression could be put between Parentheses. (i.e. (expression) )
*/
 }
	: 'if' (e1=expression | e1=guiComparisonExpression | '(' e1=guiComparisonExpression ')' | e1=guiPositionExpression ) 'then' 
		{
			$node = new Node("if");                      
			$node->setType(Node::OP);	 		     	 
			$node->addChild($e1.node);                  
			thenNode = new Node("then");
			thenNode->setType(Node::OP);
			$node->addChild(thenNode);
		}
	( s1=statement { thenNode->addChild($s1.node); } )*

	( 'else'   
		{ 
			elseNode = new Node("else");
			elseNode->setType(Node::OP);
	      		$node->addChild(elseNode);
	   	}
	(s2=statement { elseNode->addChild($s2.node); } )* )?
	'end' 'if'
	;

whileStatement returns [Node * node]
@init{
/** 
*	the  while Statement syntax is:
***********************************
*	while <expression> loop
*	<statements>
*	end loop
***********************************
* 
*	the expression is  a regular expression (i.e. int)
*	or a mathmatical expression like ( iterator < 5 ) which can be valued as a boolean
*/
}
	: 'while' { $node = new Node("while"); $node->setType(Node::OP); } 
		expression { $node->addChild($expression.node); }
		'loop'
	  ( statement { $node->addChild($statement.node); } | exitStatement)*
	  'end' 'loop'
	;

procedureCallStatement returns [Node * node]
@init{
/** 
*	the  procedure Call Statement syntax is:
***********************************
*	ID ( <parameters> );
***********************************
* 	
*	the parameters are optional and when using more than one parameter
*	you should seperet them with ','
*	and when calling the procedure we don't specify the type of the parameters.
*
*/
}
	: ID  ('(' actualParameters ')' 
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
	) ';'
	;


actualParameters returns [Node * node]
	: e1=expression 
		{ 
			$node = new Node();
			$node->addChild($e1.node);
		}
	(',' e2=expression 
		{
			$node->addChild($e2.node);
		})*
	;

exitStatement
@init{
/** 
*	the  exit Statement syntax is:
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
@init { string tempText (""); }
	: INTEGER 
		{ $node = new Node((string)(char*)($INTEGER.text->chars));
		  $node->setType(Node::CONST); }
	| '(' expression ')' 
		{ $node = $expression.node; }
	| ID 
		{ $node = new Node((string)(char*)($ID.text->chars)); $node->setType(Node::VAR); }
	| ID '(' actualParameters ')'
		{ 	tempText = (string)(char*)($actualParameters.text->chars);    
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
		{ 	string nodeText ((string)(char*)($ID.text->chars));
			nodeText += "( )";
			$node = new Node(nodeText);
			$node->setType(Node::OP);
		}
	| STRING_LITERAL
		{
		string nodeText ((string)(char*)($STRING_LITERAL.text->chars));
		nodeText = nodeText.substr(1, nodeText.length() - 2);
		$node = new Node(nodeText); $node->setType(Node::CONST); }
	;



negation returns [Node * node]
@init { int numberOfNots = 0; }
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
@init { int minuses = 0; }
	: ( '+' | '-' { minuses++; })* negation {
		string sign = (minuses \% 2 == 0)? "" : "-";  // if number of minuses is even, the sign is "", otherwise the sign is -
		if (minuses \% 2 == 0)
			{	
				$node = $negation.node;
			}

		else
			{			
				$node = new Node("-");  // Why the heck would we need a labeled node for a minus sign?
				$node->setType(Node::OP);
				$node->addChild($negation.node);			
			}	
	}
	;

multdiv returns [Node* node]
@init 
	{
		bool multExists = false;
		bool divExists = false;
		bool moduloExists = false;
		Node* temp;
	}
	: u1=unary { temp = $u1.node; }( ( '*' u2=unary
		{
			if(!multExists && !divExists && !moduloExists) 
			{
				multExists = true;
			}

			Node* multNode = new Node("*");
			multNode->setType(Node::OP);
			
			multNode->addChild(temp);

			multNode->addChild($u2.node);

			temp = multNode;
		})
	| ( '/' u2=unary
		{
			if(!multExists && !divExists && !moduloExists) 
			{
				divExists = true;
			}

			Node* divNode = new Node("/");
			divNode->setType(Node::OP);
			
			divNode->addChild(temp);

			divNode->addChild($u2.node);

			temp = divNode;
		} )
	| ( 'MOD' u2=unary
		{
			if(!multExists && !divExists && !moduloExists) 
			{
				moduloExists = true;
			}

			Node* moduloNode = new Node("mod");
			moduloNode->setType(Node::OP);
			
			moduloNode->addChild(temp);

			moduloNode->addChild($u2.node);

			temp = moduloNode;
		} ) )*

		{$node = temp;}
	;



addsub returns [Node* node]
@init 	{
			bool plusExists = false;
			bool minusExists = false;
			Node* temp;
		}
	: m1=multdiv { temp = $m1.node; }( ( '+' m2=multdiv 
		{
			if(!plusExists && !minusExists) 
			{
				plusExists = true;
			}

			Node* plusNode = new Node("+");
			plusNode->setType(Node::OP);
			
			plusNode->addChild(temp);
			plusNode->addChild($m2.node);
			temp = plusNode;
		})
	| ( '-' m2=multdiv 
		{
			if(!plusExists && !minusExists) 
			{
				minusExists = true;
			}

			Node* minusNode = new Node("-");
			minusNode->setType(Node::OP);
			
			minusNode->addChild(temp);
			minusNode->addChild($m2.node);
			temp = minusNode;
		} ) )*
	
		{$node = temp;}
	;


compare returns [Node* node]
@init {bool comparatorExists = false;
	Node* comparatorNode;
}
	: a1=addsub ( ( '=' a2=addsub 
		{
			comparatorNode = new Node("=");
			
			comparatorNode->addChild($a1.node);

			comparatorNode->addChild($a2.node);

			comparatorExists = true;
		})

	| ( '!=' a2=addsub 
		{
			comparatorNode = new Node("!=");
			comparatorNode->addChild($a1.node);

			comparatorNode->addChild($a2.node);

			comparatorExists = true;
		})
	| ( '<' a2=addsub 
		{
			comparatorNode = new Node("<");
			comparatorNode->addChild($a1.node);

			comparatorNode->addChild($a2.node);

			comparatorExists = true;
		})
	| ( '<' '=' a2=addsub 
		{
			comparatorNode = new Node("<=");
			comparatorNode->addChild($a1.node);

			comparatorNode->addChild($a2.node);

			comparatorExists = true;
		})
	| ( '>' a2=addsub 
		{
			comparatorNode = new Node(">");
			comparatorNode->addChild($a1.node);

			comparatorNode->addChild($a2.node);

			comparatorExists = true;
		})
	| ( '>' '=' a2=addsub 
		{
			comparatorNode = new Node(">=");
			comparatorNode->addChild($a1.node);

			comparatorNode->addChild($a2.node);

			comparatorExists = true;
		}) )?

	// Now return the node
	{
		if(comparatorExists) 
		{
			comparatorNode->setType(Node::OP);
			$node = comparatorNode;
		}
		else $node = $a1.node;
	}
	;


expression returns [Node* node]
@init 
	{
		bool andExists = false;
		bool orExists = false;
		Node* temp;
	}
	: c1=compare { temp = $c1.node; }
	( ( 'AND' c2=compare 
		{
			if(!andExists && !orExists) 
			{
				andExists = true;
			}

		 	Node* andNode = new Node("AND");
			andNode->setType(Node::OP);
			
		 	andNode->addChild(temp);
	
			andNode->addChild($c2.node);
	
			temp = andNode;
		 })

	| ( 'OR' c2=compare 
		{
			if(!andExists && !orExists) 
			{
				orExists = true;
			}

		 	Node* orNode = new Node("OR");
			orNode->setType(Node::OP);
			
		 	orNode->addChild(temp);

			orNode->addChild($c2.node);

			temp = orNode;
		}) )*

	{ $node = temp;}
	;

type
	: 'int'
	| 'bool'
	| 'string'
	;


guiDecStatement returns [Node* node]
@init { /*Node* temp;*/
/** 
*	the  GUI Declaration Statement syntax is:
******************************************
*	<guiType> : ID ;
******************************************
*	the GUI Declaration Statement ends with ;
*	the <guiType> can be either: Circle, Box, Triangle or Label.
*
*/
 }
//@after { /*System.out.println(nodes); */}
	: guiType ':' i1=ID  
		{
			//string guiTypeText = (string)(char*)($guiType.text->chars);
			string guiTypeText = (string)(char*)($i1.text->chars);
			guiTypeText += " ( ";
			guiTypeText += (string)(char*)($guiType.text->chars);
			guiTypeText += " ) ";

			//temp = new Node(guiTypeText);
			$node = new Node(guiTypeText);
			$node->setType(Node::VAR);
			
			variableIDs[$node] = (string)(char*)($ID.text->chars);
			
			//guiDeclNodes.push_back(temp);
		}

	';'
	;

guiTerm returns [Node* node]
@init { Node* temp;
/** 
*	the  GUI Term is either a gui which we expressed it with its ID
*	or it's a guiPositionExpression which represents a position relation between gui terms. 
*
*/
}
	: ID { $node = new Node((string)(char*)($ID.text->chars)); $node->setType(Node::VAR); }
	| '(' guiPositionExpression ')' { $node = $guiPositionExpression.node; }
	;

guiPositionExpression returns [Node* node]
@init { Node* temp;
/** 
*	the  GUI Position Expression syntax is:
******************************************
*	<guiTerm> <positionKeyword> <guiTerm>
******************************************
*	the <positionKeyword>s are: LeftOf, RightOf, Above, Below, Contains and Intersect.
*
*/
 }
	: g1=guiTerm { temp = $g1.node; }
	 (positionKeyword g2=guiTerm 
		{
			Node* positionNode = new Node((string)(char*)($positionKeyword.text->chars));
			positionNode->setType(Node::OP);
			
			positionNode->addChild(temp);
			positionNode->addChild($g2.node);

			temp = positionNode;

			$node = temp;
		} )+
	;

guiComparisonExpression returns [Node* node]
@init {
/** 
*	the  GUI Comparison Expression syntax is:
******************************************
*	ID <guiComparsionTerm> ID
******************************************
*	the <guiComparsionTerm>s are: SmallerThan, BiggerThan and EqualTo.
*
*/
 }
	:  i1=ID 	guiComparsionTerm 	i2=ID
		{
			Node* idNode1 = new Node((string)(char*)($i1.text->chars));
			idNode1->setType(Node::VAR);
			Node* idNode2 = new Node((string)(char*)($i2.text->chars));
			idNode2->setType(Node::VAR);

			$node = new Node((string)(char*)($guiComparsionTerm.text->chars));
			$node->setType(Node::OP);
			$node->addChild(idNode1);
			$node->addChild(idNode2);
		}
	;


guiStatement returns [Node* node]
@init {
/** 
*	the  GUI Statements are either GUI Declaration Statemet, GUI Position Expression
*	or GUI Comparison Expression.
*	and the GUI staements are like the regular statements should end with ';'
*
*/
 }
	: guiDecStatement
		{ $node = $guiDecStatement.node ;}
	| guiPositionExpression 
		{ $node = $guiPositionExpression.node ;}  ';'
	| guiComparisonExpression 
		{ $node = $guiComparisonExpression.node ;} ';'
	;

evntHandleStatement returns [Node* node]
@init {
/** 
*	the  event Handle Statement syntax is:
******************************************
*	ID.<eventType>
*	(
*	<statements>
*	) ;
******************************************
*	the <eventType>s are: OnClick and KeyPress.
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
		 ( '\\' '\"'  |   ~('"' |  '\n'| '\r')	 )*
	  '"'
	;
	
ID	: LETTER ( LETTER | DIGIT | '_')*;

INTEGER : DIGIT+ ;

COMMENT : '//' .* ('\n'|'\r') { $channel=HIDDEN; };

WS      : ( ' ' | '\t' | '\n' | '\r' | '\f' )+ { $channel=HIDDEN; };
