#include "AbstractNodeFactory.h"
#include "GuoliceNodeFactory.h"




AbstractNodeFactory::AbstractNodeFactory(){
  factoryType = guolice;
}
void AbstractNodeFactory::print(){
    string type;
    if(factoryType==guolice)
        type="Guolice";
    else
        type = "Standard";
    cout<<"The is a "<<type<<" Node Type Factory."<<endl;
}
void AbstractNodeFactory::setFactoryType(FactoryType type){
    factoryType = type;

}

GuoliceNodeFactory* GuoliceNodeFactory::getInstance(){
    if(staticInstance == 0)
        staticInstance  = new GuoliceNodeFactory();

    return staticInstance;



}



 GuoliceNodeFactory::GuoliceNodeFactory(){
           setFactoryType(guolice);
}
void GuoliceNodeFactory::createNode(progGraph::ProgNode* node){
    string  nodeData =  node->data;
    progNode_Node_Map[node] = new Node(nodeData);
}

Node* GuoliceNodeFactory::getProgNodeMap(progGraph::ProgNode* progNode){
    return progNode_Node_Map[progNode];

}
