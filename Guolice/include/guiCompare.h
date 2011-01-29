/**\file guiCompare.h
*\brief This file implements the different comparison methods between the Gui elements
*/
#ifndef COMPARE
#define COMPARE

#include <iostream>
#include <Node.h>
#include <AbstractGui.h>
#include <Circle.h>
#include <Box.h>
#include <Triangle.h>
#include <GuoliceUtil.h>
#include <Solution.h>
#include <Line.h>
#include <Segment.h>

/** 
*
*\brief This file implements the different comparison methods between the Gui elements
*
*This file allows the user to determine solutions for the following:
* 1- A Gui element is on the left of another Gui element
* 2- A Gui element is on the right of another Gui element
* 3- A Gui element is above of another Gui element
* 4- A Gui element is below of another Gui element
* 5- A Gui element contains another Gui element
* 6- A Gui element is smaller than another Gui element, area wise
* 7- A Gui element is bigger than of another Gui element, area wise
* 8- A Gui element is equal to another Gui element, area wise
* 9- An intersection of the solutions of the above
* 10- A union of the solutions of the above
*/ 

using std::cout;
using std::endl;

/**
* Returns the set of solutions of the Gui elements, ones being on the left of the others
* The condition is verified if the most left point of the first Gui element is on the left of the most left point of the second Gui element 
* and the most right point of the first Gui element is on the left of the most right point of the second Gui element
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the groups of Gui elements located ones on the left of the others
*/

vector<vector<Solution> > guiIsLeftOf(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the set of solutions of all the Gui elements that are located on the right of other elements
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui elements that are located on the right of other elements
*/
vector<vector<Solution> > guiIsRightOf(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the set of solutions of all the Gui elements that are located above other elements
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui elements that are located above other elements
*/
vector<vector<Solution> > guiIsAbove(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the set of solutions of all the Gui elements that are located below of other elements
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui elements that are located below other elements
*/
vector<vector<Solution> > guiIsBelow(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the set of solutions of all the Gui elements that contain other elements
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui elements that contain other elements
*/
vector<vector<Solution> > guiIsContains(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the set of solutions of all the Gui elements having a smaller area compared to other elements
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui elements having a smaller area compared to other elements
*/
vector<vector<Solution> > guiSmallerThan(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the set of solutions of all the Gui  elements having a larger area compared to other elements
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui  elements having a larger area compared to other elements
*/
vector<vector<Solution> > guiBiggerThan(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the set of solutions of all the Gui  elements having equal areas
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui  elements having a equal areas
*/
vector<vector<Solution> > guiEqualTo(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the intersection of the set of solutions 
*
*@param v1
* the set of solutions to be tested, placed on the left of the AND operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the AND operation
*
*@return
* A vector of solutions verifying the intersection operation
*/
vector<vector<Solution> > guiAND(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the union of the set of solutions 
*
*@param v1
* the set of solutions to be tested, placed on the left of the OR operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the OR operation
*
*@return
* A vector of solutions verifying the union operation
*/
vector<vector<Solution> > guiOR(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



#endif //COMPARE
