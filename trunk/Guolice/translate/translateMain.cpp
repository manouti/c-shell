#include "Driver.h"
#include "translator.h"

#include <iostream>
using namespace std;


ParseTree* Graph::pTree = new ParseTree();
ProgGraph<string, string>* Graph::translatedGraph = new ProgGraph<string, string>();

StandardNodeFactory* StandardNodeFactory::staticInstance = 0;
GuoliceNodeFactory* GuoliceNodeFactory::staticInstance = 0;

int main(int argc, char *argv[])
{
    cout<<"This is the tranlator."<<endl;
    Driver driver;
    int mainReturn =  driver.drive(argc, argv);

    Graph::pTree->setRootNode(Graph::pTree->getRootNode());

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
    return 0;
}
