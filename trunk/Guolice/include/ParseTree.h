/** \file ParseTree.h
* ParceTree: structure of Nodes
*
*/

#ifndef PARSETREE_H
#define PARSETREE_H

#include "Node.h"
#include "graph.h"
#include "GuiChecker.h"
#include <cstdlib>
#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <algorithm>
#include <iostream>

typedef ProgGraph<string, string> progGraph;

using namespace std;




/**
* \class ParseTree
* \brief Graph stucture containing rootNode with a tree of children
*
*/

class ParseTree {
	public:

                /**
                * \brief  empty constructor
                */
                ParseTree(){}
                /**
                * \brief Constructor using a start node
                *\param Node *root: start Node
                */
		ParseTree(Node *root);

                 /**
                * \brief  destructor
                */
		~ParseTree();


                /**
                * \brief  isEmpty()
                *Determines whether the tree is empty.
                *Postcondition: Returns true if the tree is empty, false otherwise.
                * \param  none
                *\return  boolean
                 */
		bool isEmpty() const;



                 /**
                * \brief  getRootNode()
                * Gets a pointer to the root node.
                * Postcondition: Returns a pointer to the root of the parse tree.
                * \param  none
                *\return  Node *: pointer to root node
                 */
		Node* getRootNode() const;



                /**
                * \brief  setRootNode()
                *Sets the root node.
                *Postcondition: Sets the root of the parse tree with the specified node.
                * \param  Node: rootNode
                *\return  void
                 */
		void setRootNode(Node* root);



                /**
                * \brief  traverse
                *Traversal function for the tree structure. It has calls to visitNode and visitEdge.
                *Postcondition: The specified node and all its children are visited in a recursive way.
                * \param  Node* node: root Node
                *\return  void
                 */
		void traverse(Node* node);

                /**
                * \brief  getNodeCount()
                *Gets the number of nodes in the tree.
                *Postcondition: Returns the number of nodes in the parse tree.
                * \param  none
                *\return  int: node Count
                 */
		int getNodeCount() const;

                /**
                * \brief  visitNode() visit the edge
                * \param  Node* node : parent node
                *\return  void
                 */
		void visitNode(Node* node);

                /**
                * \brief  visitEdge() visits the edge specified by the child number
                * \param  Node*: parent node
                * \param  int : child number
                *\return  void
                 */
                void visitEdge(Node* parent, int childNumber);


                /**
                * \brief  destroy() Used by the destructor to free memory.
                * \param  Node* &node
                *\return  void
                 */
                void destroy(Node* &node);


                /**
                * \brief  printTree() prints the tree on console, loops through all children, marks visited
                * \param  Node * node: parent node
                *\return  void
                 */
		void printTree(Node * node);


                int dotNodeCount;                   //!< Used to name the nodes in the dot file (each new node increments dotNodeCount).
                vector<string> nodeDeclarations;    //!< vector of node declarations
                vector<string> edgeDeclarations;    //!< vector of edge declarations
                map<Node*, string> nodeNames;       //!< Map between node  and the string names(dot file)
                map<string, string> varColors;      //!< Used to color the nodes in the dot file.
                map<Node*, string> varIDs;          //!< Used to keep track of ids in the dot file
	private:
                Node* root;                         //!< Root node
};


/**
* \class Graph
* \brief Graph Class with static ParseTree used by grammer, driver and translator
* static translatedGraph is used to translate
*/


class Graph {
    public:
        static ParseTree* pTree;                //!< static parced tree
        static progGraph* translatedGraph;      //!< static translated graph used by a translator
        static GuiChecker* guiChecker;          //!< static GuiChecker
};

#endif
