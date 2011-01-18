#ifndef GUI_CONSTRACT
#define GUI_CONSTRACT

#include <iostream>
#include <fstream>
#include <stdlib.h>
#include <Node.h>
#include <Circle.h>
#include <Box.h>
#include <Triangle.h>

using std::cout;
using std::ifstream;
using std::string;

#ifdef __cplusplus

class guiConstract
{
	public:
	static AbstractGui* guiCircleConstract(char* metadata_file, string NodeValue);
	static AbstractGui* guiBoxConstract(char* metadata_file, string NodeValue);
	static AbstractGui* guiTriangleConstract(char* metadata_file, string NodeValue);

	private:
	static string readMetadata(char* metadata_file, string NodeValue);
	static string getNodeValue(char* text);
	static string getMetadata(char* text);
};

#endif

#endif
