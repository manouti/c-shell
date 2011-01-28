Required resources to build the project:

- antlr jars should be placed  /third/antlr

- aspect jars should be placed  /third/aspect.

- All include files from the Antlr3 C runtime (e.g. antlr.h)

- The library of the Antlr3 C runtime according to your platform.

The makefile includes some phony targets in case the user would like to build step-by-step
without knowing the object file(s) to compile or link (e.g. compile target).

Note: The project has been built and tested with the library provided for Windows and for Ubuntu 32bit. Sample graph output is in the Downloads section.


*******************************************************************************************************************8
Commands:

make:
	Will print the graph on the console
	Will archive libraries


make aspect:
	will bill the graph using dot format


make translate:
	Will translate the graph backwards and foward
	A graph in form of graph.h should be placed in ./src/translate/translateMain.cpp in order to be translated

