Required resources to build the project:

- The antlr jar in the folder /third/antlr.

- All include files from the Antlr3 C runtime (e.g. antlr.h)

- The library of the Antlr3 C runtime according to your platform.

The makefile includes some phony targets in case the user would like to build step-by-step
without knowing the object file(s) to compile or link (e.g. compile target).

Note: The project has been built and tested with the library provided for Windows and for Ubuntu 32bit. Sample graph output is in the Downloads section.