#include "Node.h"

// Need to define nodes VarNode, LiteralNode and OpNode and include them here.

using namespace std;

class NodeFactory {

	private:
		NodeFactory* theFactory;
		NodeFactory() {};
	public:
		/**
		 * Returns a NodeFactory object. Once created, it is treated as a singleton.
		 */
		NodeFactory* getInstance() {
			if(theFactory == NULL)
				theFactory = new NodeFactory();
				
			return theFactory;
		}
		
		VarNode* createVarNode() {
		}
		
		LiteralNode* createLiteralNode() {
		}
		
		OpNode* createOpNode() {
		}		
};
		