#include "StandardNodeFactory.h"

StandardNodeFactory::StandardNodeFactory(){
     setFactoryType(standard);
}

StandardNodeFactory* StandardNodeFactory::getInstance(){
    if(staticInstance==0)
        staticInstance = new StandardNodeFactory();

    return staticInstance;



}




void StandardNodeFactory::createNode(Node* node){
    switch(node->getType()){
        case 0:
            node_ProgNode_Map[node]= createVariableNode(node);
        case 1:
            node_ProgNode_Map[node]= createLiteralNode(node);
        case 2:
            node_ProgNode_Map[node]= createStatmentNode(node);
        default:
            node_ProgNode_Map[node]= createExpressionNode(node);
    }
    Graph::translatedGraph->addNode(node_ProgNode_Map[node]);

}

progGraph::ProgVar* StandardNodeFactory::createVariableNode(Node* node){
    string nodeDataType = node->getDataType();
    string nodeValue =  node->getValue();
    return new progGraph::ProgVar(nodeDataType, nodeValue);
}

progGraph::ProgLit* StandardNodeFactory::createLiteralNode(Node* node){
   string nodeDataType = node->getDataType();
   string nodeValue =  node->getValue();
   return  new progGraph::ProgLit(nodeDataType, nodeValue);

}

progGraph::ProgStmt* StandardNodeFactory::createStatmentNode(Node* node){
     string nodeValue =  node->getValue();
     return  new progGraph::ProgStmt(nodeValue);

}

progGraph::ProgExpr* StandardNodeFactory::createExpressionNode(Node* node){
    string nodeValue =  node->getValue();
    return new progGraph::ProgExpr (nodeValue);
}

progGraph::ProgNode* StandardNodeFactory::getProgNode(Node * node){
    return node_ProgNode_Map[node];
}
