#ifndef NODE_H
#define NODE_H

#include <string>
#include <vector>

using namespace std;

#ifdef __cplusplus
class Node {
    private:
		string value;
		vector<Node*> children;
		Node* parent;
		
		
	
    public:
		Node() {}	
		Node(string v) { value = v; }
		
		Node(Node * node) {
			this->value = node->value;
			this->children = node->children;
			this->parent = node->parent;
		}
		//~Node(void);

		
		string getValue() { return value; }
		
		void setValue(string v) { value = v; }

		
		vector<Node*> getChildren() { return children; }

		void setChildren(vector<Node*> c) { children = c; }

		
		Node* getParent() { return parent; }

		void addChild(Node* child) {
			children.push_back(child);
			child->setParent(this);
		}
	
		void setParent(Node* p) { parent = p; }
	
		string printChildren() {
			string childrenString = "";
			for(int i = 0; i < children.size(); i++) {
				if(i == 0) { childrenString += children[0]->getValue(); }
    		
				else {
					childrenString += ", ";
					childrenString += children[i]->getValue();
				}
			}
			if (childrenString == ""|| childrenString == " ")
				childrenString = "NULL";    			
			return childrenString;
		}
		
		string toString() {
			string nodeString ("Node \t ");
			nodeString += value;
			nodeString += "\n\t\t parent \t-> ";
			nodeString += ((parent == NULL)?"NULL":parent->getValue());
			nodeString += "\n\t\t children \t-> ";
			nodeString += printChildren();
			nodeString += "";
			
			return nodeString;
	}
};

#endif

#endif
