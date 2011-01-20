#include "FunctionNode.h"

FunctionNode::FunctionNode(Node* node)
		: ParseTree(node)
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

string FunctionNode::printFunctionName()
{
	return getRootNode()->getValue();
}

string FunctionNode::printBody()
{
	return getRootNode()->toString();
}

Node* FunctionNode::getFunctionRoot() const
{ 
	return getRootNode();
}

string FunctionNode::toString()
{
	string nodeString ("FunctionNode\t ");
	nodeString += printFunctionName();
	nodeString += "(";
	nodeString += printParameters();
	nodeString += ") \n\t\treturns: ";
	nodeString += returnType;
	nodeString += "\n\t\tFunction body: \n\t\t";
	nodeString += printBody();
	nodeString += "\n--------------------------------------------------";
	nodeString += "\n\n";

	return nodeString;
}
