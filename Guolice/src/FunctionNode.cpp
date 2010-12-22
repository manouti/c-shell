#include "FunctionNode.h"

FunctionNode::FunctionNode()
		: Node()
{
}
		
FunctionNode::FunctionNode(string v)
		: Node(v)
{
}

FunctionNode::FunctionNode(Node* node)
		: Node(node)
{
}

string FunctionNode::getReturnType() const
{
	return returnType;
}

void FunctionNode::setReturnType(string type)
{
	returnType = type;
}

map<string, string> FunctionNode::getParameters() const
{
	return parameters;
}
		
void FunctionNode::setParameters( map<string, string>  param)
{
	parameters = param;
}

string FunctionNode::printParameters()
{
	string params = "";
	map<string, string>::iterator i;
	
	for (i = parameters.begin(); i != parameters.end(); ++i) {
		params += i->first;
		params += ": ";
		params += i->second;
		params += ";";
	}
	return params;
}

string FunctionNode::toString()
{
	string nodeString ("Node\t ");
	nodeString += getValue();
	nodeString += "(";
	nodeString += printParameters();
	nodeString += ") \n\t\treturns: ";
	nodeString += returnType;
	nodeString += "\n\t\tparent -> ";
	nodeString += ((getParent() == NULL)?"NULL":getParent()->getValue());
	nodeString += "\n\t\tchildren -> ";
	nodeString += printChildren();
	nodeString += "\n\n";

	return nodeString;
}
