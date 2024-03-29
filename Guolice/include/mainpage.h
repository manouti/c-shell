/** @file mainpage.h
*
* 
*/ 
/** @mainpage Guolice
*
*
* \image html guolice.jpg 
* 
* @authors 	
*	- Mahmoud Anouti
*	- Lama Ghusn
*	- Jalal Awed
*

* <hr>
* @section  Company
*	The LMJ Company, inc. (not exactly..)
*

*<hr>
* @section intro Introduction
*Guolice is a language that allows specification of GUI behaviors.

*The language allows simple
*entities such as strings, simple geometric shapes (boxes, triangles, circles), events (click, key press).

*It allows positional operators such as left of, right of, above, and below. It allows shape operations
*such as equal, smaller than, bigger than, and contains. It also allows causal operations such as an
*event precedes another event or precedes the appearance or the hiding of an entity.
*Later on, the language can introduce a conditional structure where a behavior depends on the
*current shapes and events. It also can introduce a recursive structure where shapes are defined in
*terms of smaller shapes or behaviors are defined in terms of earlier or later behaviors.

*Guolice specifies the behavior of a GUI application and facilitates testing it later on. Testing
*GUI currently is a painful behavior and involves manual record and replay testing where even a
*small change in the resolution of a screen can render a test suite obsolete. With Guolice and a
*proper checker that checks whether a trace of a GUI execution violates a Guolice specification, GUI
*testing should become much easier.
*

* <hr>
* @section requirements requirements
* Required resources to build the project:
*
*- antlr jars should be placed  /third/antlr
*
*- aspect jars should be placed  /third/aspect.
*
*- All include files from the Antlr3 C runtime (e.g. antlr.h)
*
*- The library of the Antlr3 C runtime according to your platform..
*

* <hr>
* @section notes Makefile
* The makefile includes some phony targets in case the user would like to build step-by-step
* without knowing the object file(s) to compile or link (e.g. compile target).
*
*make:
*	Will print the graph on the console
*	Will archive libraries
*
*
*make aspect:
*	will bill the graph using dot format
*
*
*make translate:
*	Will translate the graph backwards and foward
*	A graph in form of graph.h should be placed in ./src/translate/translateMain.cpp in order to be translated
*
* Type make help to see the help on the phony targets.
*

* <hr>
* @section  Release Notes
* The project has been built and tested with the library provided for Windows. and for Ububtu 32bit.
*

*/
