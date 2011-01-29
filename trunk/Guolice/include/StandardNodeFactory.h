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
    map<Node*, progGraph::ProgNode*> node_ProgNode_Map;     //!< a map used to only iterate through the graph once
    static StandardNodeFactory* staticInstance;             //!< static Instance of the class

    /**
    * \brief private constructor
    *\param none
    */
    StandardNodeFactory();
public:
    /**
    * \brief Used in place of constructor to ensure single instance created
    * \param none
    * \return StandardNodeFactory* static instance of StandardNodeFactory
    */
    static StandardNodeFactory* getInstance();


    /**
    * \brief Checks type of Node, then calls one of createVariableNode(..), createLiteralNode(..), createStatmentNode(..), createExpressionNode(..)
    *  Places created Node in map
    * \param Node* : pointer to node to get information from
    * \return void
    */
    void createNode(Node* node);


    /**
    * \brief creates a VariableNode from class Node defined in  Node.h
    * \param Node* : pointer to node to get information from
    * \return progGraph::ProgVar*
    */
    progGraph::ProgVar* createVariableNode(Node* node);

    /**
    * \brief creates a LiteralNode from class Node defined in  Node.h
    * \param Node* : pointer to node to get information from
    * \return progGraph::ProgLit*
    */
    progGraph::ProgLit* createLiteralNode(Node* node);


    /**
    * \brief creates a StatmentNode from class Node defined in  Node.h
    * \param Node* : pointer to node to get information from
    * \return progGraph::ProgStmt*
    */
    progGraph::ProgStmt* createStatmentNode(Node* node);

    /**
    * \brief creates a ExpressionNode from class Node defined in  Node.h
    * \param Node* : pointer to node to get information from
    * \return progGraph::ProgStmt*
    */
    progGraph::ProgExpr* createExpressionNode(Node* node);

    /**
    * \brief Access to map
     * \param Node* : pointer to node
    * \return progGraph::ProgNode*
    */
    progGraph::ProgNode* getProgNode(Node * node);



};




#endif // NODEFACTORY_H
