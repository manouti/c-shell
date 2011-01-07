#ifndef TRANSLATOR_H
#define TRANSLATOR_H


#include "Node.h"
#include "ParseTree.h"
#include "graph.h"
#include "Visitors.h"
#include "GuoliceNodeFactory.h"
#include "StandardNodeFactory.h"
#include <map>

ParseTree* Graph::pTree = new ParseTree();
ProgGraph<string, string>* Graph::translatedGraph = new ProgGraph<string, string>();



//middle man class
class Translator
{
private:
    StandardNodeFactory standardNodeFactory;
    GuoliceNodeFactory  guoliceNodeFactory;
public:
    Translator(){}

    void guoliceTranslate(Node* node );

    void translate();

    void translate( progGraph  graph);


};

//test main
int main(){
    Node* northPole;
    northPole = new Node("NorthPole", STRING_LITERAL);
    Node* elf = new Node("Elf", STRING_LITERAL);
    Node* snowman = new Node("Snowman", STRING_LITERAL);
    northPole->addChild(elf, "HeadElf");
    northPole->addChild(snowman, "HeadofNPC");
    Graph::pTree->setRootNode(northPole);
    Translator translator;
    translator.translate();
    //
    //adding dr.Zaraket's Graph to test --from graph.cpp
    progGraph tg;
    string type("int");
    string name("a");

    progGraph::ProgVar * v = new progGraph::ProgVar(type, name);
    progGraph::NodeType t = v->type();
    tg.addNode(v);

    string lit("one");
    string value("1");

    progGraph::ProgLit * l = new progGraph::ProgLit(lit, value);
    t = l->type();
    tg.addNode(l);


    string sub("-");
    progGraph::ProgExpr * e = new progGraph::ProgExpr(sub);
    t = e->type();
    tg.addNode(e);

    string w1("operand");

    //progGraph::ProgEdge * e1 = new progGraph::ProgEdge(e, v, w1);
    progGraph::ProgEdge & e1 = tg.addEdge(e, v, w1);
    progGraph::ProgEdge & e2 = tg.addEdge(e, l, w1);

    string assign("=");
    progGraph::ProgStmt * s = new progGraph::ProgStmt(assign);
    tg.addNode(s);

    string left("left");
    string right("right");
    string def("definition");

    tg.addEdge(s, v, left);
    tg.addEdge(s, e, right);
    tg.addEdge(v, s, def);


    //Translating to GuoliceGraph
    translator.translate(tg);
}






#endif // TRANSLATOR_H
