#ifndef GUOLICENODEFACTORY_H
#define GUOLICENODEFACTORY_H

#include "AbstractNodeFactory.h"
#include "ParseTree.h"

class GuoliceNodeFactory : public AbstractNodeFactory
{
private:
    map<progGraph::ProgNode*, Node*> progNode_Node_Map;
    static GuoliceNodeFactory*  staticInstance;
    GuoliceNodeFactory();

public:

    static GuoliceNodeFactory* getInstance();

    void createNode(progGraph::ProgNode* node);

    Node* getProgNodeMap(progGraph::ProgNode* progNode);

};


#endif // GuoliceNodeFactory_H


