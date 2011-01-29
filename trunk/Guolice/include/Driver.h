/**\file Driver.h
* Driver Class
*
*/
#ifndef __Driver_h__
#define __Driver_h__

#include    <Guolice.h>
#include    "ParseTree.h"
#include    "Node.h"
#include <iostream>
using namespace std;



/**
* \class Driver
* \brief Used to drive antler to use the lexer and parcer to print the graph
*
*/


class Driver{

   public:
    Driver(){}


    /**
    * /brief Adapted from example by Jim Idle (April 2007), by LMJ Company, inc.
    *Author: Jim Idle - April 2007
    * Permission is granted to use this example code in any way you want, so long as
    * all the original authors are cited.
    * /param int argc
    * /param char *argv[]
    */
    void drive(int argc, char *argv[]);




};



#endif
