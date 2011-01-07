
#include "translator.h"







void Translator::guoliceTranslate(Node* node ){
    //will traverse the graph & translate
        if(node != NULL) {
            standardNodeFactory.createNode(node);
        for(int i = 0; i < node->getChildren().size(); i++) {
            guoliceTranslate(node->getChildren().at(i));
            string w1 = node->getChildrenWeight(i);
            Graph::translatedGraph->addEdge(standardNodeFactory.getProgNode(node), standardNodeFactory.getProgNode(node->getChildren().at(i)), w1 );
        }
    }
}

void Translator::translate(){
    guoliceTranslate(Graph::pTree->getRootNode());
    Visitor  tv;
    TranslatedBFTraverse bft(tv, 0);
    bft(*Graph::translatedGraph);
}
void Translator::translate( progGraph  graph){
   StandardGraphVistor  standardVisitor(&guoliceNodeFactory);
   BFGuoliceTranslate bft(standardVisitor, 1);
   bft(graph);
   ParseTree* guoliceTree = new ParseTree(standardVisitor.getRootNode());
   guoliceTree->printTree(standardVisitor.getRootNode());
}
