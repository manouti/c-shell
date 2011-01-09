#ifndef NODE_H
#define NODE_H

#include <string>
#include <vector>
#include <Metadata.h>
using namespace std;


enum DataType{ INTEGER, STRING_LITERAL, BOOL, BOX, CIRCLE, TRIANGLE};

class Node {

	public:
		enum NodeType { VAR, CONST, OP };	// Define the possible node types.

		Node();
		
		Node(string v);

                Node(string v, DataType dType);
		
		Node(Node* node);
		//~Node(void);
		
		string getValue() const;
		
		void setValue(string v);

		NodeType getType() const;
            
		void setType(NodeType type);

                void setDataType(DataType dType);

                string getDataType();
		
		vector<Node*> getChildren() const;

		void setChildren(vector<Node*> c);

		Node* getParent() const;

		void setParent(Node* p);
		
		void addChild(Node* child);

                void addChild(Node* child, string weight);

                string getChildrenWeight(int i);
	
		string printChildren() const;
		
		string toString() const;

                void setVisited();

                bool isVisited();

                string getMode() const;
                void setMode(string m);
                Metadata* getMetadata() const;
                void setMetadata(Metadata* m);

	
    private:
		string value;			// The text value of the node.
                vector<Node*> children;         // Vector of children of the node.
                vector<string> childrenWeight;  // Weight coresponding to edge between node and child
		Node* parent;			// Parent of the node.
		NodeType type;			// Type of the node (VAR, CONST, OP).
                DataType dataType;              // Data type of node(INT, STRING, BOOL, BOX, CIRCLE, TRIANGLE, LABEL).
                bool visited;
                string mode;			//!< Mode of the node (Box, Circle, Triangle, Label).
                Metadata* node_metadata;	//!< Properties of the node mode, i.e. properties of the circle, box, triangle, etc...

};


#endif
