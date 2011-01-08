#ifndef READ_METADATA
#define READ_METADATA

#include <iostream>
#include <fstream>
#include <stdlib.h>
#include <Node.h>
#include <Metadata.h>
#include <CircleMetadata.h>
#include <BoxMetadata.h>
#include <TriangleMetadata.h>

using std::cout;
using std::ifstream;
using std::string;

#ifdef __cplusplus

class ReadMetadata
{
	public:
	static Metadata* guiReadCircle(char* metadata_file, string NodeValue);
	static Metadata* guiReadBox(char* metadata_file, string NodeValue);
	static Metadata* guiReadTriangle(char* metadata_file, string NodeValue);

	private:
	static string readMetadata(char* metadata_file, string NodeValue);
	static string getNodeValue(char* text);
	static string getMetadata(char* text);
};

#endif

#endif
