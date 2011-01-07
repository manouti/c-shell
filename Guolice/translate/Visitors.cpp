#include "Visitors.h"



bool Visitor::operator() (progGraph::ProgNode * node) {
        cout << "node " << node->data <<endl;
        return true;
    }
bool Visitor::operator() (progGraph::ProgEdge * edge) {
    cout << "edge " << edge <<
        " weight " << edge->weight <<
        " from " << edge->from.idx <<
        " to " << edge->to.idx << endl;
    return true;
}


StandardGraphVistor::StandardGraphVistor(GuoliceNodeFactory* guoliceNodeFactory){
    setRootNode= false;
    this->nodeFactory = guoliceNodeFactory;
}

bool StandardGraphVistor::operator() (progGraph::ProgNode * node) {
    //create the node
    if(nodeFactory->getProgNodeMap(node)==NULL){ //assuming were visiting with color 1
       nodeFactory->createNode(node);
       cout<<"Created Guolice node: "<< nodeFactory->getProgNodeMap(node)->getValue()<<endl;
       if(!setRootNode){
            setRootNode=true;
            rootNode = nodeFactory->getProgNodeMap(node);
       }
    }
    return true;
}

 bool StandardGraphVistor::operator() (progGraph::ProgEdge * edge) {
    Node* parentNode;
    Node* childNode;
    if(edge->from.isVisited(1) )
       parentNode = nodeFactory->getProgNodeMap(&edge->from);
    if(edge->to.isVisited(1))
          childNode = nodeFactory->getProgNodeMap(&edge->to);
    else{
        nodeFactory->createNode(&edge->to);
        cout<<"Created Guolice node: "<< nodeFactory->getProgNodeMap(&edge->to)->getValue()<<endl;
        childNode = nodeFactory->getProgNodeMap(&edge->to);
    }
    parentNode->addChild(childNode);
    cout<<"Adding edge between: "<<parentNode->getValue()<<" and "<<childNode->getValue()<<endl;
    return true;
}


Node * StandardGraphVistor::getRootNode(){
    return rootNode;
}
