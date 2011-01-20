// Adapted from example by Jim Idle (April 2007), by LMJ Company, inc.
// Author: Jim Idle - April 2007
// Permission is granted to use this example code in any way you want, so long as
// all the original authors are cited.

#include    <Guolice.h>
#include    "ParseTree.h"
#include    "Node.h"
#include <iostream>
using namespace std;

// Initializing here will overwrite in grammar
ParseTree* Graph::pTree = new ParseTree();

int ANTLR3_CDECL
main	(int argc, char *argv[])
{
    pANTLR3_UINT8	    fName;
    pANTLR3_INPUT_STREAM    input;
    pGuoliceLexer		    lxr;
    pANTLR3_COMMON_TOKEN_STREAM	    tstream;
    pGuoliceParser				psr;
	
    if (argc < 2 || argv[1] == NULL)
    {
		fName	=(pANTLR3_UINT8)"../test_examples/input_2"; // Note in VS2005 debug, working directory must be configured
    }
    else
    {
		fName	= (pANTLR3_UINT8)argv[1];
    }
	
    input	= antlr3AsciiFileStreamNew(fName);
    if ( input == NULL)
    {
	    fprintf(stderr, "Failed to open file %s\n", (char *)fName);
		exit(1);
	}
	
    lxr	    = GuoliceLexerNew(input);	    
    if ( lxr == NULL )
    {

	    fprintf(stderr, "Unable to create the lexer due to malloc() failure1\n");
	    exit(1);

    }
	
	tstream = antlr3CommonTokenStreamSourceNew(ANTLR3_SIZE_HINT, TOKENSOURCE(lxr));

    if (tstream == NULL)
    {
		fprintf(stderr, "Out of memory trying to allocate token stream\n");
		exit(1);
    }
    psr	    = GuoliceParserNew(tstream);  

    if (psr == NULL)
    {
		fprintf(stderr, "Out of memory trying to allocate parser\n");
		exit(ANTLR3_ERR_NOMEM);
    }

    psr->program(psr);

    psr	    ->free  (psr);	    psr = NULL;
    tstream ->free  (tstream);	    tstream = NULL;
    lxr	    ->free  (lxr);	    lxr = NULL;
    input   ->close (input);	    input = NULL;

    //traversing the graph
	Graph::pTree->traverse( Graph::pTree->getRootNode() ); // Get the dot output.

    return 0;
}
