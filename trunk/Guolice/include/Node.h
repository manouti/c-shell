/** \file Node.h
*	\class Node
*	this class is been used to create and store Nodes.
*/
#ifndef NODE_H
#define NODE_H

#include <string>
#include <vector>

using namespace std;

#ifdef __cplusplus

class Node {

	public:
		enum NodeType { VAR, CONST, OP };	//!< Define the possible node types.

		Node();
		
		Node(string v);
		
		Node(Node* node);
		//~Node(void);
		
		string getValue() const;
		
		void setValue(string v);

		NodeType getType() const;
            
		void setType(NodeType type);
		
		vector<Node*> getChildren() const;

		void setChildren(vector<Node*> c);

		Node* getParent() const;

		void setParent(Node* p);
		
		void addChild(Node* child);
	
		string printChildren() const;
		
		string toString() const;
	
    private:
		string value;			//!< The text value of the node.
		vector<Node*> children; //!< Vector of children of the node.
		Node* parent;			//!< Parent of the node.
		NodeType type;			//!< Type of the node (VAR, CONST, OP).
};

#endif

#endif
