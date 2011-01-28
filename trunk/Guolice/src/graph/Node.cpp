#include "Node.h"

Node::Node() {}

Node::Node(string v)
{
	value = v;
    visited = false;
}
Node::Node(string v, string dType){
    value = v;
    visited = false;

}
void Node::setDataType(string dType){
    dataType = dType;
    visited = false;
}

string Node::getDataType(){
    return dataType;
}

void Node::addChild(Node* child, string weight){
        children.push_back(child);
        child->setParent(this);
        childrenWeight.push_back(weight);
}

string Node::getChildrenWeight(int i){
    return childrenWeight[i];
}

Node::Node(Node* node)
{
	this->value = node->value;
	this->children = node->children;
	this->parent = node->parent;
}

string Node::getValue() const
{
	return value;
}

void Node::setVisited(){
   visited = true;
}

bool Node::isVisited(){
    return visited;
}

void Node::setValue(string v)
{
	value = v;
}

Node::NodeType Node::getType() const
{
	return type;
}

void Node::setType(Node::NodeType type)
{
	this->type = type;
}

vector<Node*> Node::getChildren() const
{
	return children;
}

void Node::setChildren(vector<Node*> c)
{
	children = c;
}

Node* Node::getParent() const
{ 
    return parent;
}

void Node::setParent(Node* p)
{
	parent = p;
}

void Node::addChild(Node* child)
{
	children.push_back(child);
	child->setParent(this);
}

string Node::printChildren() const
{
	string childrenString = "";
	for(int i = 0; i < children.size(); i++) {
		if(i == 0) {
			childrenString += children[0]->getValue();
		}
				
		else {
			childrenString += ", ";
			childrenString += children[i]->getValue();
		}
	}
	
	if (childrenString == ""|| childrenString == " ")
		childrenString = "NULL";    			
	return childrenString;
}

string Node::toString() const
{
	string nodeString ("Node \t ");
	nodeString += value + "\n\t\t parent \t-> ";
	nodeString += ((parent == NULL)?"NULL":parent->getValue());
	nodeString += "\n\t\t top-level children \t-> ";
	nodeString += printChildren() + "";
	
	return nodeString;
}


string Node::getMode() const
{
    return mode;
}

void Node::setMode(string m)
{
        mode = m;
}

vector<vector<Solution> > Node::getNodeSolution() const
{
    return nodeSolution;
}

void Node::SetNodeSolution (vector<vector<Solution> > m)
{
    nodeSolution = m;
}

vector<vector<Solution> > Node::evaluate(map<string, vector<AbstractGui*> > guiObject)
{
	vector<vector<Solution> > solution;
	vector<Node*> children = Node::getChildren();

	if (children.size() == 0 )
	{	
		vector<Solution> temp;
		for(int i=0 ; i< guiObject[Node::getMode()].size(); i++ )
		{
			temp.clear();
			Solution sol;
			sol.shape = guiObject[Node::getMode()].at(i);
			sol.varName = Node::getValue();
			temp.push_back(sol);
			solution.push_back(temp);
		}
		return solution;
	}
	
	vector<vector<Solution> > v1 = children.at(0)->evaluate(guiObject);
	if (v1.size() == 0)
	{
		return solution;
	}

	vector<vector<Solution> > v2 = children.at(1)->evaluate(guiObject);
	if (v2.size() == 0)
	{
		return solution;
	}

	if (Node::getValue() == "LeftOf")
	{	
		solution = guiIsLeftOf(v1, v2);
	}
	else if (Node::getValue() == "RightOf")
	{	
		solution = guiIsRightOf(v1, v2);
	}
	else if (Node::getValue() == "Below")
	{	
		solution = guiIsBelow(v1, v2);
	}
	else if (Node::getValue() == "Above")
	{
		solution = guiIsAbove(v1, v2);
	}
	else if (Node::getValue() == "Contains")
	{	
		solution = guiIsContains(v1, v2);
	}
	else if (Node::getValue() == "SmallerThan")
	{
		solution = guiSmallerThan(v1, v2);
	}
	else if (Node::getValue() == "BiggerThan")
	{
		solution = guiBiggerThan(v1, v2);
	}
	else if (Node::getValue() == "EqualTo")
	{
		solution = guiEqualTo(v1, v2);
	}
	else if (Node::getValue() == "AND")
	{
		solution = guiAND(v1, v2);
	}
	else if (Node::getValue() == "OR")
	{
		solution = guiOR(v1, v2);
	}
	return solution;
}

