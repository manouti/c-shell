/** \file FunctionNode.h
* FunctionNode Class
*
*/
#ifndef FUNCTIONNODE_H
#define FUNCTIONNODE_H

#include <string>
#include <vector>
#include <map>
#include "ParseTree.h"

using namespace std;

/**
* \class Funtion
* \brief Used to represent a function as a parced tree
*
*/




#ifdef __cplusplus
class FunctionNode: public ParseTree {
    private:
                string returnType;                  //!< return type of defined function
                map<string, string> parameters;     //!< a map of parameters
	
    public:
                /**
                * \brief constructor takes a parrent node
                * \param Node* node: parent Node
                *
                */
                FunctionNode(Node* node);

                /**
                * \brief  getReturnType() returns the return type of funtion
                * \param  none
                *\return  string: return type
                 */
		string getReturnType() const;


                 /**
                * \brief  setReturnType() set return type
                * \param  string type
                *\return  void
                 */
                void setReturnType(string type);

                 /**
                * \brief  getParameters() return map of parameters
                * \param  none
                *\return  map<string, string>
                 */
                map<string, string> getParameters() const;
		
                 /**
                * \brief  setParameters() sets Parameters
                * \param  map<string, string>  param
                *\return  void
                 */
                void setParameters( map<string, string>  param);

                 /**
                * \brief  printParameters() returns printed parameters in a string
                * \param  none
                *\return  string
                 */
                string printParameters();
		
                 /**
                * \brief  printFunctionName() returns function name is string format
                * \param  none
                *\return  string
                 */
                string printFunctionName();
		
                 /**
                * \brief  printBody() returns body in a string
                * \param  none
                *\return  string
                 */
                string printBody();
		
                 /**
                * \brief  toString() returns all functions parameters: name, body and return type in string formate
                * \param  none
                *\return  string
                 */
                string toString();
		

//                void visitFunctionNode();
		
                 /**
                * \brief  visitFunctionChild() visits the child in parameter
                * \param  int childNumber: child Number to visit
                *\return  void
                 */
                void visitFunctionChild(int childNumber);
		
		/**
		* This may be somehow redundant since we already have a getter for root from the base class,
		* but we added it for readability purposes.
		*/
		Node* getFunctionRoot() const;
};

#endif

#endif
