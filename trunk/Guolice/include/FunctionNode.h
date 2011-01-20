#ifndef FUNCTIONNODE_H
#define FUNCTIONNODE_H

#include <string>
#include <vector>
#include <map>
#include "ParseTree.h"

using namespace std;

#ifdef __cplusplus
class FunctionNode: public ParseTree {
    private:
		string returnType;
		map<string, string> parameters;	
	
    public:
		FunctionNode(Node* node);

		//FunctionNode(string v, vector<Node*> children, Node * parent):Node(v, children, parent){}

		string getReturnType() const;

		void setReturnType(string type);

		map<string, string> getParameters() const;
		
		void setParameters( map<string, string>  param);

		string printParameters();
		
		string printFunctionName();
		
		string printBody();
		
		string toString();
		
		void visitFunctionNode();
		
		void visitFunctionChild(int childNumber);
		
		/**
		* This may be somehow redundant since we already have a getter for root from the base class,
		* but we added it for readability purposes.
		*/
		Node* getFunctionRoot() const;
};

#endif

#endif
