#ifndef NODEFACTORY_H
#define NODEFACTORY_H


#include "AbstractNodeFactory.h"


class StandardNodeFactory: public AbstractNodeFactory
{
private:
    map<Node*, progGraph::ProgNode*> node_ProgNode_Map;

public:
    StandardNodeFactory();

    void createNode(Node* node);

    progGraph::ProgVar* createVariableNode(Node* node);

    progGraph::ProgLit* createLiteralNode(Node* node);

    progGraph::ProgStmt* createStatmentNode(Node* node);

    progGraph::ProgExpr* createExpressionNode(Node* node);

    progGraph::ProgNode* getProgNode(Node * node);



};




#endif // NODEFACTORY_H
