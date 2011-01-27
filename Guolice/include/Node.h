#ifndef NODE_H
#define NODE_H

#include <string>
#include <vector>
#include <AbstractGui.h>
#include <map>
#include <guiCompare.h>
#include <Solution.h>

using namespace std;


enum DataType{ TYPE_INTEGER, TYPE_STRING_LITERAL, TYPE_BOOL, TYPE_BOX, TYPE_CIRCLE, TYPE_TRIANGLE};

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

		void setType(NodeType type);
		NodeType getType() const;
        
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
		
		vector<vector<Solution> > getNodeSolution() const;
        void SetNodeSolution(vector<vector<Solution> > m);
		
		vector<vector<Solution> > evaluate(map<string, vector<AbstractGui*> > guiObject);
	
    private:
		string value;					// The text value of the node.
        vector<Node*> children;         // Vector of children of the node.
        vector<string> childrenWeight;  // Weight coresponding to edge between node and child
		Node* parent;					// Parent of the node.
		NodeType type;					// Type of the node (VAR, CONST, OP).
        DataType dataType;              // Data type of node(INT, STRING, BOOL, BOX, CIRCLE, TRIANGLE, LABEL).
        bool visited;
		string mode;					//!< Mode of the node (Box, Circle, Triangle, Label).
        vector<vector<Solution> > nodeSolution;			//!< contain the solution of the node 

};


#endif
