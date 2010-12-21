/** \file FunctionNode.h
*	\class FunctionNode
*	this class inherits from the Node class and it's used to store the members
*	of the functions and procedures. 
*/
#ifndef FUNCTIONNODE_H
#define FUNCTIONNODE_H

#include <string>
#include <vector>
#include <map>
#include <Node.h>

using namespace std;

#ifdef __cplusplus
class FunctionNode: public Node {
    private:
		string returnType;
		map<string, string> parameters;	
	
    public:
		FunctionNode();
		
		FunctionNode(string v);

		FunctionNode(Node* node);

		//FunctionNode(string v, vector<Node*> children, Node * parent):Node(v, children, parent){}

		string getReturnType() const;

		void setReturnType(string type);

		map<string, string> getParameters() const;
		
		void setParameters( map<string, string>  param);

		string printParameters();
		
		string toString();
};

#endif

#endif
