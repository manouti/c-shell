#include "Node.h"

Node::Node() {}

Node::Node(string v)
{
	value = v;
    visited = false;
}
Node::Node(string v, DataType dType){
    value = v;
    visited = false;

}
void Node::setDataType(DataType dType){
    dataType = dType;
    visited = false;
}

string Node::getDataType(){
    string dataStringArray [] = { "INTEGER", "STRING_LITERAL", "BOOL", "BOX", "CIRCLE", "TRIANGLE", "LABEL"};
    return dataStringArray[dataType];
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

string Node::getGuiShape() const
{
    return guiShape;
}

void Node::setGuiShape(string shape)
{
	guiShape = shape;
}

AbstractGui* Node::getGui() const
{
    return gui;
}

void Node::setGui(AbstractGui* m)
{
    gui = m;
}
