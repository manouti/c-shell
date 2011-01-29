/**\file guiConstruct.h
*/
#ifndef GUI_CONSTRUCT
#define GUI_CONSTRUCT

#include <iostream>
#include <fstream>
#include <stdlib.h>
#include <Node.h>
#include <Circle.h>
#include <Box.h>
#include <Triangle.h>
#include <string.h>

 

using std::cout;
using std::ifstream;
using std::string;

#ifdef __cplusplus

/** 
*\class guiConstruct
*\brief This class implements the construction of different Gui elements
*
*/
class guiConstruct
{
	public:
/**
* Constructs the Circle element using metadata provided by the user
*
*@param metadata_file
* the path of the file that contains the metadata of the element
*
*@param NodeValue
* the identifier of the element
*
*@return
* A vector containing all the circles listed in the metadata file 
*/
	static vector<AbstractGui*> guiCircleConstruct(char* metadata_file, string NodeValue);



/**
* Constructs the Box element using metadata provided by the user
*
*@param metadata_file
* the path of the file that contains the metadata of the element
*
*@param NodeValue
* the identifier of the element
*
*@return
* A vector containing all the boxes listed in the metadata file 
*/
	static vector<AbstractGui*> guiBoxConstruct(char* metadata_file, string NodeValue);


/**
* Constructs the Triangle element using metadata provided by the user
*
*@param metadata_file
* the path of the file that contains the metadata of the element
*
*@param NodeValue
* the identifier of the element
*
*@return
* A vector containing all the triangles listed in the metadata file 
*/
	static vector<AbstractGui*> guiTriangleConstruct(char* metadata_file, string NodeValue);

	private:
	static string getNodeValue(char* text);
	static string getMetadata(char* text);
};

#endif //__cplusplus

#endif //GUI_CONSTRUCT
