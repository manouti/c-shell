#ifndef VISITORS_H
#define VISITORS_H

#include "GuoliceNodeFactory.h"


class Visitor {
public:
    bool operator() (progGraph::ProgNode * node) ;
    bool operator() (progGraph::ProgEdge * edge) ;
};

class StandardGraphVistor {
private:
    bool setRootNode;
    GuoliceNodeFactory* nodeFactory;
    Node * rootNode;

public:
    StandardGraphVistor(GuoliceNodeFactory* guoliceNodeFactory);

    bool operator() (progGraph::ProgNode * node);

    bool operator() (progGraph::ProgEdge * edge);

    Node * getRootNode();

};



typedef progGraph::BFTraverse<Visitor> TranslatedBFTraverse;
typedef progGraph::BFTraverse<StandardGraphVistor> BFGuoliceTranslate; // translating to Guolice









#endif // VISITORS_H
