/** \file Node.cpp
*	
*/
#include "Node.h"

Node::Node() {}

Node::Node(string v)
{
	value = v;
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
	nodeString += "\n\t\t children \t-> ";
	nodeString += printChildren() + "";
	
	return nodeString;
}
