#ifndef PARSETREE_H
#define PARSETREE_H

#include "Node.h"
#include "graph.h"
#include <cstdlib>
#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <algorithm>
#include <iostream>

typedef ProgGraph<string, string> progGraph;

using namespace std;

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
		  
		Node* getRootNode() const;
		// Gets a pointer to the root node.
		// Postcondition: Returns a pointer to the root of the parse tree.
		
		void setRootNode(Node* root);
		// Sets the root node.
		// Postcondition: Sets the root of the parse tree with the specified node.
		
		void traverse(Node* node);
	    // Traversal function for the tree structure. It has calls to visitNode and visitEdge.
		// Postcondition: The specified node and all its children are visited in a recursive way.

		int getNodeCount() const;
		// Gets the number of nodes in the tree.
		// Postcondition: Returns the number of nodes in the parse tree.

		int dotNodeCount;  // Used to name the nodes in the dot file (each new node increments dotNodeCount).
		vector<string> nodeDeclarations;
		vector<string> edgeDeclarations;
		map<Node*, string> nodeNames;
		map<string, string> varColors;
		map<Node*, string> varIDs;

		void visitNode(Node* node);
		void visitEdge(Node* parent, int childNumber);
		void destroy(Node* &node); // Used by the destructor to free memory.
		
		void setFunctionList(vector<FunctionNode*> funcList);
		void printTree(Node * node);
		
	private:
		Node *root;   // Root node
		//vector<FunctionNode*> functionList;	// This will cause a compiler error
};

class Graph{
    public:
        static ParseTree* pTree;
        static progGraph* translatedGraph;
};

#endif
