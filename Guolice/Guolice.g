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
        ParseTree* tree;
	Node* root;
	vector<Node*> variableDeclNodes;
	vector<Node*> guiDeclNodes;
	vector<FunctionNode*> functionList;
	map<string, string> functionParameters;
	vector<Node*> statements;
	
	map<Node*, string> variableIDs;

	void printTree(Node* node) {
		cout << "\nNode: " << node->toString() << endl;
		for(int i = 0; i < node->getChildren().size(); i++) 
		{
			printTree(node->getChildren().at(i));
		}
	}

	void printFunctionList() {
        cout << "[ ";
        for (int i=0; i < functionList.size(); i++)
        {
            if(functionList[i] != NULL) {
                cout << functionList[i]->toString() << "The function " << functionList[i]->getValue() << " members : ";
               
                for (int j=0; j < functionList[i]->getChildren().size(); j++)
                {
                    printTree(functionList[i]->getChildren().at(j));
                }
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

         	tree = new ParseTree(root);
         	tree->varIDs = variableIDs;
            	 Graph::pTree = tree;

/*
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
		dotFile << "}";		
  		dotFile.close();

		cout << "\nNUMBER OF NODES: " << pTree->getNodeCount() << endl;
*/		/*FunctionNode* first = functionList.at(0);
		cout << "The first procedure is: " << first->toString() << endl;
		FunctionNode* second = functionList.at(1);
		cout << "The second procedure is: " << second->toString() << endl;*/
	   }
	
	: ( procedureDec | functionDec | statement {


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
@init { FunctionNode* procedureNode; }
//@after { /*System.out.println("The procedure list is: " + functionList + "\n"); */}
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
@init { FunctionNode* functionNode; }
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
	: ';'
	| assignmentStatement 
		{ $node = $assignmentStatement.node;}
	| constantDecStatement 
		{ $node = $constantDecStatement.node;}
	| variableDecStatement 
		//{ $node = new Node("emptyMark"); }
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
@init{ /*Node * temp;*/ }
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

/*	(',' i2=ID 
		{
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
        })? { variableDeclNodes.push_back(temp); } )*  
	*/ ';'
	;

ifStatement returns [Node* node]
@init { Node* thenNode; Node* elseNode; }
	: 'if' (e1=expression | e1=guiComparisonExpression | '(' e1=guiComparisonExpression ')' | e1=guiPositionExpression ) 'then' 
		{
			$node = new Node("if");                      //i.e     "if"
			$node->setType(Node::OP);	 		     //       /    \
			$node->addChild($e1.node);                   //   "expr"   "then"
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
	: 'while' { $node = new Node("while"); $node->setType(Node::OP); } expression { $node->addChild($expression.node); }'loop'
	  ( statement { $node->addChild($statement.node); } | exitStatement)*
	  'end' 'loop'
	;

procedureCallStatement returns [Node * node]
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
	: 'exit''when' expression ';'
	| 'exit''now'';'
	;

returnStatement
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
@init { /*Node* temp;*/ }
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
/*	( ',' i2=ID  
		{
			string guiTypeText = (string)(char*)($guiType.text->chars);
			guiTypeText += " ";
			guiTypeText += (string)(char*)($i2.text->chars);
			temp = new Node(guiTypeText);
			guiDeclNodes.push_back(temp);
		} )*  */
	';'
	;

guiTerm returns [Node* node]
	: ID { $node = new Node((string)(char*)($ID.text->chars)); $node->setType(Node::VAR); }
	| '(' guiPositionExpression ')' { $node = $guiPositionExpression.node; }
	;

guiPositionExpression returns [Node* node]
@init { Node* temp; }
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
	: guiDecStatement
		{ $node = $guiDecStatement.node ;}
	| guiPositionExpression 
		//{  statements.push_back(new Node($guiPositionExpression.node));}
		{ $node = $guiPositionExpression.node ;}  ';'
	| guiComparisonExpression 
		//{ statements.push_back(new Node($guiComparisonExpression.node)); } 
		{ $node = $guiComparisonExpression.node ;} ';'
	;

evntHandleStatement returns [Node* node]
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
