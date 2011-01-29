Required resources to build the project:

- antlr jars should be placed /third/antlr

- aspect jars should be placed  /third/aspect.

- All include files from the Antlr3 C runtime (e.g. antlr.h) (to be put in /third/antlr/libantlr3c-3.2/include

- The library of the Antlr3 C runtime according to your platform (in /third/antlr/libantlr3c-3.2/.libs)

The makefile includes some phony targets in case the user would like to build step-by-step
without knowing the object file(s) to compile or link (e.g. compile target).

Note: The project has been built and tested with the library provided for Windows and for Ubuntu 32bit. Sample graph output is in the Downloads section.




*************************************************** Helpful Commands: ****************************************************

make:
	Will print the graph on the console.
	Will archive libraries.

make aspect:
	will bill the graph using dot format.

make translate:
	Will translate the graph backwards and forward.
	A graph in form of graph.h should be placed in ./src/translate/translateMain.cpp in order to be translated.

make test:
	Will run the program. 

make help:
	Will print the help on the makefile and list of the commands available.

*************************************************************************************************************************


Test Case:
The test case should be written like this example:
*******************************
Circle : -2, 0, 1
Box : 1, 2, 2, 1
Triangle : 0,0 , 1 ,1 , 0 , 2

*******************************

where you put the shape of the GUI and ':'
followed by the parameters separated by comma.

for the Circle:   	Circle : <center_point_X> , <center_point_Y> , <radius>
for the Box:		Box : <left_Bottom_corner_X> , <left_Bottom_corner_Y> , <width_on_the_X_axis> , <height_on_the_Y_axis>
for the Triangle:	Triangle : <point_1_X> , <point_1_Y> , <point_2_X> , <point_2_Y> , <point_3_X> , <point_3_Y>

and then you put it the "../Guolice/tests/gui_metadata" file



