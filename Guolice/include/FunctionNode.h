#ifndef FUNCTIONNODE_H
#define FUNCTIONNODE_H

#include <string>
#include <vector>
#include <Node.h>
#include <map>

using namespace std;

#ifdef __cplusplus
class FunctionNode : public Node {
    private:
		string returnType;
		map<string, string> parameters;
		
	
    public:
		FunctionNode():Node(){}
		
		FunctionNode(string v):Node(v){}

		FunctionNode(Node* node):Node(node) {}

		//FunctionNode(string v, vector<Node*> children, Node * parent):Node(v, children, parent){}

		string getReturnType(){
			return returnType;
		}

		void setReturnType(string type){
			returnType = type;
		}

		map<string, string> getParameters(){
			return parameters;
		}
		
		void setParameters( map<string, string>  param){
			parameters = param;
		}

		string printParameters(){
			string params = "";
			map<string, string>::iterator i;
			for (i = parameters.begin(); i != parameters.end(); ++i){

				params += i->first;
				params += ": ";
				params += i->second;
				params += ";";
			}
			return params;
		}
		
		string toString() {
			string nodeString ("Node [value = ");
			nodeString += getValue();
			nodeString += "(";
			nodeString += printParameters();
			nodeString += ") returns: ";
			nodeString += returnType;
			nodeString += ", parent = ";
			nodeString += ((getParent() == NULL)?"NULL":getParent()->getValue());
			nodeString += ", children = ";
			nodeString += printChildren();
			nodeString += "]";

			return nodeString;

		}
		
};

#endif

#endif


