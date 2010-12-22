#ifndef PARSETREE_H
#define PARSETREE_H

#include <cstdlib>
#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <algorithm>
#include <iostream>
#include "Node.h"

using namespace std;

#ifdef __cplusplus
class ParseTree {

	public:
                ParseTree(){}
		ParseTree(Node *root);
		  // Constructor using a start node.
		  
		~ParseTree();
		  // Destructor
		
		bool isEmpty() const;
		  // Determines whether the tree is empty.
		  // Postcondition: Returns true if the tree is empty, false otherwise.
		  
                void traversing(Node* node);
                  // Traversal function for the tree structure. It has calls to visitNode and visitEdge.
                  // Postcondition: The specified node and all its children are visited in a recursive way.

		int getNodeCount() const;
		  // Gets the number of nodes in the tree.
		  // Postcondition: Returns the number of nodes in the parse tree.
		  
		// ******************** Dot-specific variables (to be moved when using AspectC++) ********************
		int dotNodeCount;  // Used to name the nodes in the dot file (each new node increments dotNodeCount).
		vector<string> nodeDeclarations;
		vector<string> edgeDeclarations;
                void randomStupidFunction();
		map<Node*, string> nodeNames;
		map<string, string> varColors;
		map<Node*, string> varIDs;
                void visitNode(Node* node);
                void visitEdge(Node* parent, int childNumber);
                void destroy(Node* &node); // Used by the destructor to free memory.
                Node* getRootNode();
        private:
                Node *root;   // Root node

};

//class Graph{
//    public:
//        static ParseTree* pTree;
//
//
//};

#endif

#endif
