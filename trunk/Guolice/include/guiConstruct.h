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

class guiConstruct
{
	public:
	static vector<AbstractGui*> guiCircleConstruct(char* metadata_file, string NodeValue);
	static vector<AbstractGui*> guiBoxConstruct(char* metadata_file, string NodeValue);
	static vector<AbstractGui*> guiTriangleConstruct(char* metadata_file, string NodeValue);

	private:
//	static string readMetadata(char* metadata_file, string NodeValue);
	static string getNodeValue(char* text);
	static string getMetadata(char* text);
};

#endif //__cplusplus

#endif //GUI_CONSTRUCT
