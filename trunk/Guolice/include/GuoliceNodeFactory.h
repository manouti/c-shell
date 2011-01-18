#ifndef GUOLICENODEFACTORY_H
#define GUOLICENODEFACTORY_H

#include "AbstractNodeFactory.h"
#include "ParseTree.h"

class GuoliceNodeFactory : public AbstractNodeFactory
{
private:
    map<progGraph::ProgNode*, Node*> progNode_Node_Map;

public:
    GuoliceNodeFactory();

    void createNode(progGraph::ProgNode* node);

    Node* getProgNodeMap(progGraph::ProgNode* progNode);

};
#endif // GuoliceNodeFactory_H
