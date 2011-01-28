// Adapted from example by Jim Idle (April 2007), by LMJ Company, inc.
// Author: Jim Idle - April 2007
// Permission is granted to use this example code in any way you want, so long as
// all the original authors are cited.

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
