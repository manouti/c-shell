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
        #include        <GuiChecker.h>

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
        StringAbstractGuiMap guiObject ;

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
                        root = new Node("PROGRAM", "programNode");
                        guiObject["Circle"] = guiConstruct::guiCircleConstruct(metadata_file, "Circle");
                        guiObject["Box"] = guiConstruct::guiBoxConstruct(metadata_file, "Box");
                        guiObject["Triangle"] = guiConstruct::guiTriangleConstruct(metadata_file, "Triangle");
                }
@after {

                        vector<Node*>::iterator i;
                        for (i = statements.begin(); i != statements.end(); ++i)
                        {
                                root->addChild(*i, "iterator");
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
                                Graph::guiChecker->setIfMetaData(true);
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

        : 'procedure' ':' ID  { procedureRootNode = new Node((string)(char*)($ID.text->chars), "procedureNode");
                                                        procedureTree = new FunctionNode(procedureRootNode); }
        '(' (parameters { procedureTree->setParameters(functionParameters); } )? ')'
        ( statement
                {
                        if($statement.node ->getValue() != "emptyMark")
                        {
                                 procedureRootNode->addChild($statement.node, "procedureStatment");
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
        : 'function' type ':' ID  { functionRootNode = new Node((string)(char*)($ID.text->chars), "functionNode"); }
        '(' (parameters { functionTree->setParameters(functionParameters); } )? ')'  // here (type) is the return value type of the function
        ( statement
                {
                        if($statement.node ->getValue() != "emptyMark")
                        {
                                functionRootNode->addChild($statement.node, "functionStatment");
                        }
                        for(int i = 0; i < variableDeclNodes.size(); i++)
                        {
                                functionRootNode->addChild(variableDeclNodes[i], "variableDecl");
                        }
                        for(int i = 0; i < guiDeclNodes.size(); i++)
                        {
                                functionRootNode->addChild(guiDeclNodes[i], "guiDeclNodes");
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
                        Node* idNode = new Node((string)(char*)($ID.text->chars), "idNode");   // Create a node for the identifier
                        idNode->setType(Node::VAR); // Set this node as a variable node

                        Node* equalsNode = new Node(":=");   // Create a node for the assignment symbol
                        // Now add the identifier node and the node returned by the expression rule to the assignment symbol node
                        equalsNode->addChild(idNode, "id");
                        equalsNode->addChild($expression.node, "expression");
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

                        Node * idNode = new Node(constantText, "idNode");
                        idNode->setType(Node::VAR);
                        variableIDs[idNode] = (string)(char*)($ID.text->chars);

                        $node->addChild(idNode, "id");
                        $node->addChild($expression.node, "expression");
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

                        $node = new Node (varText, "varNode");
                        $node->setType(Node::VAR);
                        variableIDs[$node] = (string)(char*)($ID.text->chars);
            }
        (':=' e1=expression
                {
                        Node * equalsNode = new Node(":=");
                        equalsNode->setType(Node::OP);
                        equalsNode->addChild($node, "equals");
                        equalsNode->addChild($e1.node, "statment");
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
                        $node = new Node("if", "ifNode");
                        $node->setType(Node::OP);
                }
        ( expression
                {$node->addChild($expression.node, "expression");}
        | guiCompareExpression
                {$node->addChild($guiCompareExpression.node, "guiCompareExpression");}
        )
        'then'
                {
                        thenNode = new Node("then", "thenNode");
                        thenNode->setType(Node::OP);
                        $node->addChild(thenNode, "then");
                }

        ( s1=statement
                { thenNode->addChild($s1.node, "statment"); }
        )*

        ( 'else'
                {
                        elseNode = new Node("else", "elseNode");
                        elseNode->setType(Node::OP);
                $node->addChild(elseNode, "else");
                }
        ( s2=statement
                { elseNode->addChild($s2.node, "statment"); }
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
                        $node = new Node("while", "whileNode");
                        $node->setType(Node::OP);
                }
        expression
                { $node->addChild($expression.node, "expression"); }
        'loop'
        ( statement
                { $node->addChild($statement.node, "statment"); }
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

                        $node = new Node(procedureCallText, "procedureNode");
                        $node->setType(Node::OP);
                        for(int i = 0; i < $actualParameters.node->getChildren().size(); i++)
                        {
                                $node->addChild($actualParameters.node->getChildren().at(i), "paramters");
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
                        $node->addChild($e1.node, "expresssion");
                }
        (',' e2=expression
                {$node->addChild($e2.node, "expression");}
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
                        $node = new Node((string)(char*)($INTEGER.text->chars), "INTEGER");
                        $node->setType(Node::CONST);
                }

        | '(' expression ')'
                { $node = $expression.node; }

        | ID
                {
                        $node = new Node((string)(char*)($ID.text->chars), "ID");
                        $node->setType(Node::VAR);
                }

        | ID '(' actualParameters ')'
                {
                        tempText = (string)(char*)($actualParameters.text->chars);
                        string nodeText ((string)(char*)($ID.text->chars));
                        nodeText += "(";
                        nodeText += tempText;
                        nodeText += ")";
                        $node = new Node(nodeText, "IDTEXT");
                        $node->setType(Node::OP);

                        for(int i = 0; i < $actualParameters.node->getChildren().size(); i++)
                        {
                                $node->addChild($actualParameters.node->getChildren().at(i), "parameters");
                        }
                }

        | ID '(' ')'
                {
                        string nodeText ((string)(char*)($ID.text->chars));
                        nodeText += "( )";
                        $node = new Node(nodeText, "IDTEXT");
                        $node->setType(Node::OP);
                }

        | STRING_LITERAL
                {
                        string nodeText ((string)(char*)($STRING_LITERAL.text->chars));
                        nodeText = nodeText.substr(1, nodeText.length() - 2);
                        $node = new Node(nodeText, "STRINGLITERAL"); $node->setType(Node::CONST);
                }
        ;



negation returns [Node * node]
@init 	{ int numberOfNots = 0; }
        : ( 'NOT' { numberOfNots++; } )* term
                {
                        Node * returnNode = $term.node;
                        for(int i = 0; i < numberOfNots; i++)
                        {
                                Node * notNode = new Node("NOT", "NOTNODE");
                                notNode->setType(Node::OP);
                                notNode->addChild(returnNode, "returning");
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
                                $node->addChild($negation.node, "negation");
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
                        Node* multdivNode = new Node(nodeName, "multdivNode");
                        multdivNode->setType(Node::OP);
                        multdivNode->addChild(temp, "multDiv");
                        multdivNode->addChild($u2.node, "multDiv");
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
                        Node* addsubNode = new Node(nodeName, "addSubNode");
                        addsubNode->setType(Node::OP);
                        addsubNode->addChild(temp, "addSub");
                        addsubNode->addChild($m2.node, "addSub");
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
                        Node* comparatorNode = new Node(nodeName, "compareNode");
                        comparatorNode->setType(Node::OP);
                        comparatorNode->addChild(temp, "comparator");
                        comparatorNode->addChild($a2.node, "comparator");
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
                        Node* comparatorNode = new Node(nodeName, "comparatorNode");
                        comparatorNode->setType(Node::OP);
                        comparatorNode->addChild(temp, "comparator");
                        comparatorNode->addChild($c2.node, "comparator");
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

                        $node = new Node(guiTypeText, "guiTypeText");
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
                        $node = new Node((string)(char*)($ID.text->chars), "IDNODE");
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
                        Node* compareNode = new Node((string)(char*)($guiCompareKeyword.text->chars), "compareNode");
                        compareNode->setType(Node::OP);

                        compareNode->addChild(temp, "compare");
                        compareNode->addChild($g2.node, "compare");

                        $node= compareNode;

                        Graph::guiChecker->checkError($g1.node);
                        Graph::guiChecker->checkError($g2.node);


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
                        Graph::guiChecker->compareExpression(node, guiObject, (string)(char*)($guiCompareExpression.text->chars) );

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
                                $node = new Node((string)(char*)($eventType.text->chars), "EventNode");
                                Node* idNode = new Node((string)(char*)($ID.text->chars), "IdNode");
                                idNode->setType(Node::VAR);
                                $node->addChild(idNode, "id");
                                $node->setType(Node::OP);

                        }'('
        ( statement
                        {
                                $node->addChild($statement.node, "statment");
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
