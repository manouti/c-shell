/** \file StandardNodeFactory.h
* Standard Node Type Factory
*
*/

#ifndef NODEFACTORY_H
#define NODEFACTORY_H
#include "AbstractNodeFactory.h"

/**
* \class StandardNodeFactory
* \brief Singlton Class used to generate Standard Graph in graph.h from a Guolice Node defined in Node.h
*
*/


class StandardNodeFactory: public AbstractNodeFactory
{
private:
    map<Node*, progGraph::ProgNode*> node_ProgNode_Map;     //! a map used to only iterate through the graph once
    static StandardNodeFactory* staticInstance;             //! static Instance of the class

    /**
    * \brief private constructor
    *
    */

    StandardNodeFactory();
public:
    /**
    * \brief Used in place of constructor to ensure single instance created
    *
    */

    static StandardNodeFactory* getInstance();


    /**
    * \brief Checks type of Node, then calls one of createVariableNode(..), createLiteralNode(..), createStatmentNode(..), createExpressionNode(..)
    *  Places created Node in map
    *
    */
    void createNode(Node* node);


    /**
    * \brief creates a VariableNode from class Node defined in  Node.h
    *
    */
    progGraph::ProgVar* createVariableNode(Node* node);

    /**
    * \brief creates a LiteralNode from class Node defined in  Node.h
    *
    */
    progGraph::ProgLit* createLiteralNode(Node* node);


    /**
    * \brief creates a StatmentNode from class Node defined in  Node.h
    *
    */
    progGraph::ProgStmt* createStatmentNode(Node* node);

    /**
    * \brief creates a ExpressionNode from class Node defined in  Node.h
    *
    */
    progGraph::ProgExpr* createExpressionNode(Node* node);

    /**
    * \brief Access to map
    *
    */
    progGraph::ProgNode* getProgNode(Node * node);



};




#endif // NODEFACTORY_H
