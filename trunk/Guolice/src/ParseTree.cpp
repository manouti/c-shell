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
		  
void ParseTree::traverse(Node *node)
{
	if(node != NULL) {
		visitNode(node);
  		
		for(int i = 0; i < node->getChildren().size(); i++) {
			traverse(node->getChildren().at(i));
			visitEdge(node, i);
		}
	}
}

void doCount(Node *node, int &count) {
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
	string nodeDot ("node");
		
	ostringstream oss;
	oss << dotNodeCount++;
	nodeDot += oss.str();
		
	nodeNames[node] = nodeDot; // Store the label of the node in the dot file, e.g. node13 in the map "nodeNames".
	
	nodeDot += "[label=\"";
	
	string nodeText(node->getValue());
    replace(nodeText.begin(), nodeText.end(), '\"', '\'' );   // Replace the double-quote by a single-quote in case of a string for it to 
															  // to be added correctly in the dot layout text.
	nodeDot += nodeText + "\",";
	
	switch(node->getType()) {
		case Node::VAR:
			{
			string variableColor;
			
			string varID = varIDs[node];
			
			if (varColors.find(varID) != varColors.end()) {
				variableColor = varColors[node->getValue()];
			}
			else {
				double red = (static_cast<double> (rand()) / static_cast<double> (RAND_MAX) + 1.0) / 2.0;
				double green = (static_cast<double> (rand()) / static_cast<double> (RAND_MAX) + 1.0) / 2.0;
				double blue = (static_cast<double> (rand()) / static_cast<double> (RAND_MAX) + 1.0) / 2.0;
				
				oss.flush();
				oss << red << " " << green << " " << blue;
				variableColor = oss.str();
				
				varColors[varID] = variableColor;
			}
			
			nodeDot += "rank=sink,style=filled,color=\"" + variableColor +  "\"];\n";
			}
			break;
		case Node::CONST:
			nodeDot += "shape=box];\n";
			break;
		case Node::OP:
			 nodeDot += "shape=diamond];\n";
	}
	
	nodeDeclarations.push_back(nodeDot);
	//dotFile << nodeDot;
}

void ParseTree::visitEdge(Node* parent, int childNumber)
{
	string edgeDot (nodeNames[parent]);
	edgeDot += " -> " + nodeNames[parent->getChildren().at(childNumber)] + "[label=";
	
	ostringstream oss;
	oss << childNumber + 1;
	edgeDot += oss.str() + "];\n";
	
	edgeDeclarations.push_back(edgeDot);
	//dotFile << edgeDot;
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
