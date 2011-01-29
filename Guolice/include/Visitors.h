/** \file Visitor.h
* Contains multiple visitor types
*
*/
#ifndef VISITORS_H
#define VISITORS_H

#include "GuoliceNodeFactory.h"



/**
* \class Visitor
* \brief A visitor class used to traverse and print the Nodes of graph.h after it has been translated from a Guolice graph
*   It is used to verify the conversion
*
*
*/


class Visitor {

public:

    /**
    * \brief Will print the characteristic infromation of node
    *\param progGraph::ProgNode * node
    *\return boolean
    */
    bool operator() (progGraph::ProgNode * node) ;

    /**
    * \brief Will print the characteristic infromation of edge
     *\param progGraph::progGraph::ProgEdge * edge
    *\return boolean
    */
    bool operator() (progGraph::ProgEdge * edge) ;
};


/**
* \class StandardGraphVistor
* \brief A visitor class used to covert a standard graph to a guolice graph, upon traversing nodes are created
* Used by translator
*
*
*/



class StandardGraphVistor {
private:
    bool setRootNode;                       //!< used to declare rootNode of Guolice graph -- the first node traversed
    GuoliceNodeFactory* nodeFactory;        //!< instance of node factory calling the traversal
    Node * rootNode;                        //!< rootNode of Graph::ParseTree

public:
    /**
    * \brief constructor Intiated by GuoliceNodeFactory, passes an instance of self
    * \param GuoliceNodeFactory* guoliceNodeFactory
    */
    StandardGraphVistor(GuoliceNodeFactory* guoliceNodeFactory);

    /**
    * \brief When Visitor meets a node, will create a Guolice Node by Factory
    * \param progGraph::ProgNode * node
    */
    bool operator() (progGraph::ProgNode * node);

    /**
    * \brief When Visitor meets a edge, will check if node at end of edge is created,
    * if created -> will create an edge between nodes
    * if not -> will create node, and then create edge
    *\param progGraph::ProgEdge * edge
    */
    bool operator() (progGraph::ProgEdge * edge);


    /**
    * \brief Access of root Node
    */
    Node * getRootNode();

};


/**
* typdef for readibilty
*/
typedef progGraph::BFTraverse<Visitor> TranslatedBFTraverse;
typedef progGraph::BFTraverse<StandardGraphVistor> BFGuoliceTranslate; // translating to Guolice









#endif // VISITORS_H
