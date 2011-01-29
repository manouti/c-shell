/** \file Translator.h
* Translator Class
*
*/

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



/**
* \class Tranlsator
* \brief A middle man class used by TranslatorMain.cpp in order to translate graphs
*   Contains two singlton node factories
*/

class Translator
{
	private:
                StandardNodeFactory* standardNodeFactory;       //!< static instance of Standard Node Factory
                GuoliceNodeFactory*  guoliceNodeFactory;        //!< static instance of Guolice Node Factory
		
	public:
                Translator();


                /**
                * \brief Will translate the to the Standard Graph, recursive function, rootNode is passed
                *\param Node* node: rootNode
                *\return void
                */
                void guoliceTranslate(Node* node);


                /**
                * \brief Will translate the to the Standard Graph, placed in the static Graph::ParseTree which is filled by the grammar and Driver
                * \param none
                * \return void
                */
		void translate();


                /**
                * \brief Will translate a graph in graph.h to Guolice, passed as parameter
                * \param progGraph  graph
                * \return void
                */
		void translate(progGraph  graph);
};



#endif // TRANSLATOR_H
