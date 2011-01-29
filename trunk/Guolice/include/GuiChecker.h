/** \file GuiChecker.h
* GuiChecker Class
*
*/
#ifndef __GuiChecker_H__
#define __GuiChecker_H__


#include <iostream>
#include <fstream>
#include "Node.h"
#include "Solution.h"

using namespace std;

typedef map<string, vector<AbstractGui*> > StringAbstractGuiMap;


/**
* \class GuiChecker
* \brief Used to check the gui from the main
*
*/


class GuiChecker{
    private:
        bool metaDataExists;                    //!< check for metatdata
        string  errors;                         //!< string of errors
        string  comparison_output;              //!< string of comparission to file
        string comparison_output_on_screen;     //!< string of comparission to screen
        char* comparison_output_file;           //!< file place



    public:

        /**
        * \brief constructor takes a GuiChecker
        */
        GuiChecker();

        /**
        * \brief printCheck() prints the content of Check
        *\param none
        *\return void
        */
        void printCheck();

        /**
        * \brief sets if metadata is checked
        * \param bool metadata --true if metadata is available
        */
        void setIfMetaData(bool metaData);


        /**
        * \brief checks error of Node by checking the mode
        * \param Node* node: pointer of node
        *\return void
        */
        void checkError(Node * node);

         /**
        * \brief compareExpression: produces solutoins for node
        * \param Node* node: pointer of node
        * \param StringAbstractGuiMap guiObject; a map of string, vector<AbstractGui*>
        * \param string guiCompareExpression
        *\return void
        */
        void  compareExpression(Node* node, StringAbstractGuiMap guiObject, string guiCompareExpression);

        /**
        * \brief check: used to check metadata, called from main
        * \param none
        *\return void
        */
        void check();






};




#endif
