

#include    <Guolice.h>
#include    "ParseTree.h"
#include    "Node.h"
#include    "Driver.h"
#include <iostream>
using namespace std;

// Initializing here will overwrite in grammar
ParseTree*  Graph::pTree = new ParseTree();
GuiChecker* Graph::guiChecker = new GuiChecker();

int ANTLR3_CDECL
main	(int argc, char *argv[])
{

    Driver driver;
    driver.drive(argc, argv);

    Graph::guiChecker->check();



    return 0;
}
