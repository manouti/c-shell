/** \file GuoliceNodeFactory.h
* Guolice Node Type Factory
*
*/


#ifndef GUOLICENODEFACTORY_H
#define GUOLICENODEFACTORY_H

#include "AbstractNodeFactory.h"
#include "ParseTree.h"


/**
* \class GuoliceNodeFactory
* \brief A singlton class used by the translator in order to translate from the standard graph declared in graph.h to the graph in Guolice.
*
*/




class GuoliceNodeFactory : public AbstractNodeFactory
{
private:
    map<progGraph::ProgNode*, Node*> progNode_Node_Map;    //!< a map used to only iterate through the graph once
    static GuoliceNodeFactory*  staticInstance;            //!< static Instance of the class
    /**
    * \brief private constructor
    *
    */

    GuoliceNodeFactory();

public:
    /**
    * \brief used in place of constructor to ensure single instance created
    * \param none
    * \return a static GuoliceNodeFactory pointer
    */
    static GuoliceNodeFactory* getInstance();

     /**
    * \brief    create a Guolice Node in the form of Node.h from the node defined in graph.h
    *\param     progGraph::ProgNode* node: a graph<string, string> node: Abstract class
    *\return    void
    */
    void createNode(progGraph::ProgNode* node);


    /**
    * \brief Access of private map
    *\param  progGraph::ProgNode* progNode used to accees map
    *\return retieved Node from map
    */
    Node* getProgNodeMap(progGraph::ProgNode* progNode);

};


#endif // GuoliceNodeFactory_H


