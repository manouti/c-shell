#include "ParseTree.h"

ParseTree::ParseTree(Node *root)
{
	this->root = root;
	dotNodeCount = 0;
}
		  
ParseTree::~ParseTree()
{
	destroy(root);
}

bool ParseTree::isEmpty() const
{
	return (root == NULL);
}

Node* ParseTree::getRootNode() const
{
    return root;
}

void ParseTree::setRootNode(Node* root)
{
	this->root = root;
	dotNodeCount = 0;
}
		  
void ParseTree::traverse(Node* node)
{
	if(node != NULL) {
		visitNode(node);

		for(int i = 0; i < node->getChildren().size(); i++) {
				traverse(node->getChildren().at(i));
				visitEdge(node, i);
		}
	}
}

void doCount(Node *node, int &count)
{
	if(node != NULL) {
		count++;
		for(int i = 0; i < node->getChildren().size(); i++) {
			doCount(node->getChildren().at(i), count);
		}
	}
}  

int ParseTree::getNodeCount() const
{
	if(isEmpty()) return 0;
	
	else {
		int count = 0; 
		doCount(root, count);
		return count;
	}
}

void ParseTree::visitNode(Node* node)
{

}

void ParseTree::visitEdge(Node* parent, int childNumber)
{

}

void ParseTree::destroy(Node* &node)
{
	if(node != NULL) {
		for(int i = 0; i < node->getChildren().size(); i++) {
			destroy(node->getChildren().at(i));
		}
		delete node;  // Free it
		node = NULL;
	}
}

void ParseTree::setFunctionList(vector<FunctionNode*> funcList)
{
    functionList = funcList;
}

void ParseTree::printTree(Node * node)
{
    node->setVisited();
    cout << node->toString() << endl;
	for(int i = 0; i < node->getChildren().size(); i++)
	{
		if(!node->getChildren().at(i)->isVisited())
			printTree(node->getChildren().at(i));
	}
}
