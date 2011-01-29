

#include    <Guolice.h>
#include    "ParseTree.h"
#include    "Node.h"
#include    "Driver.h"
#include <iostream>
using namespace std;

// Initializing here will overwrite in grammar
ParseTree* Graph::pTree = new ParseTree();

int ANTLR3_CDECL
main	(int argc, char *argv[])
{

    Driver driver;
    return driver.drive(argc, argv);

}
