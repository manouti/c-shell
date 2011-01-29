/** \file Node.h
* Node Class
*
*/
#ifndef NODE_H
#define NODE_H

#include <string>
#include <vector>
#include <AbstractGui.h>
#include <map>
#include <GuiCompare.h>
#include <Solution.h>

using namespace std;


/**
* \class Node
* \brief Node Strunture of Graph
* information: nodeType, dataType and value
*
*/


class Node {

	public:
		enum NodeType { VAR, CONST, OP };	// Define the possible node types.

                 /**
                * \brief  Node() construnctor
                * \param  none
                */
                Node();
                /**
                * \brief  Node() constuctor intiates a node with string value
                * \param  string v: value of node to be created
                 */
		Node(string v);
                /**
                * \brief  Node() constructor: intiates a node with value and data type
                * \param  string v: value of node to be created
                * \param  string dType: data type
                 */
                Node(string v, string dType);
                /**
                * \brief  Node() constructor: intiates a node with parent node
                * \param  Node* node: parent Node
                 */
		Node(Node* node);
		//~Node(void);

                /**
                * \brief  getValue() returns value set
                * \param  none
                *\return  string: value
                 */
                string getValue() const;
                /**
                * \brief  setValue() setsValue
                * \param  string v: value of Node
                *\return  void
                 */
		void setValue(string v);


                /**
                * \brief  setValue() setsValue
                * \param  NodeType type: enum NodeType
                *\return  void
                 */
		void setType(NodeType type);
                /**
                * \brief  getType() returns type
                * \param  none
                *\return  NodeType: returns enum NodeType
                 */
		NodeType getType() const;
        

                 /**
                * \brief  setDataType() sets the Data Tyoe
                * \param  string dType
                *\return  void
                 */
                void setDataType(string dType);
                /**
                * \brief  getDataType() returns data type
                * \param  none
                *\return  string: return data type
                 */
                string getDataType();

		
                 /**
                * \brief  getChildren() returns vector of children
                * \param  none
                *\return  vector<Node*> returns a vector of Node pointers
                 */
		vector<Node*> getChildren() const;
                 /**
                * \brief  setChildren() sets Children
                * \param  vector<Node*> vector of nodes
                *\return  void
                 */
                void setChildren(vector<Node*> c);


                /**
                * \brief  getParent() returns parent Node
                * \param  none
                *\return  Node* : a pointer to the parent Node
                 */
		Node* getParent() const;
                /**
                * \brief  setParent() sets Parent
                * \param  Node *: parent node
                *\return  void
                 */
                void setParent(Node* p);


                /**
                * \brief  addChild() add child to node
                * \param  Node* child: pointer of child node
                *\return  void
                 */
		void addChild(Node* child);
                /**
                * \brief  addChild() add child to node with weight used for translation
                * \param  Node* child: pointer of child node
                * \param  string : weight of edge
                *\return  void
                 */
                void addChild(Node* child, string weight);


                  /**
                * \brief  getChildrenWeight() gets the childrenWeight at i
                * \param  int : child number
                *\return  string: weight of child
                 */
                string getChildrenWeight(int i);
	

                 /**
                * \brief  printChildren() returns the children in string format
                * \param  none
                *\return  string
                 */
		string printChildren() const;
		
                /**
                * \brief  toString() prints the node in string format: value, all children
                * \param  none
                *\return  string
                 */
                string toString() const;



                /**
                * \brief  sets Node as visited
                * \param  none
                *\return  void
                 */
                void setVisited();
                /**
                * \brief  isVisited returns true if node has been visisted in traversal
                * \param  none
                *\return  boolean - true if visited
                 */
                bool isVisited();

                string getMode() const;
                void setMode(string m);

                vector<vector<Solution> > getNodeSolution() const;
                void SetNodeSolution(vector<vector<Solution> > m);

                vector<vector<Solution> > evaluate(map<string, vector<AbstractGui*> > guiObject);
	
    private:
                string value;				//!< The text value of the node.
                vector<Node*> children;                 //!< Vector of children of the node.
                vector<string> childrenWeight;          //!< Weight coresponding to edge between node and child
                Node* parent;                           //!< Parent of the node.
                NodeType type;                          //!< Type of the node (VAR, CONST, OP).
                string dataType;                        //!< Data type of node(INT, STRING, BOOL, BOX, CIRCLE, TRIANGLE, LABEL).
                bool visited;                           //!< boolean true if visited
                string mode;                             //!< Mode of the node (Box, Circle, Triangle, Label).
                vector<vector<Solution> > nodeSolution;  //!< contain the solution of the node

};


#endif
