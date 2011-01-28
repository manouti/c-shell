#ifndef TRANSLATOR_H
#define TRANSLATOR_H

#include "Node.h"
#include "ParseTree.h"
#include "graph.h"
#include "Visitors.h"
#include "GuoliceNodeFactory.h"
#include "StandardNodeFactory.h"
#include "Driver.h"
#include <map>




//middle man class
class Translator
{
	private:
                StandardNodeFactory* standardNodeFactory;
                GuoliceNodeFactory*  guoliceNodeFactory;
		
	public:
                Translator();

		void guoliceTranslate(Node* node);

		void translate();

		void translate(progGraph  graph);
};



#endif // TRANSLATOR_H
