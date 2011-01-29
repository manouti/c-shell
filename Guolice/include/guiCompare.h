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
* Returns the set of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements, verifying the following: 
* the elements of the first vector are on the left of the elements of the second vector
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
* A vector of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements, verifying the following: 
* the elements of the first vector are on the left of the elements of the second vector. 
*/


vector<vector<Solution> > guiIsLeftOf(vector<vector<Solution> > v1, vector<vector<Solution> > v2);





/**
* Returns the set of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements, verifying the following: 
* the elements of the first vector are on the right of the elements of the second vector
* The condition is verified if the most left point of the first Gui element is on the right of the most left point of the second Gui element 
* and the most right point of the first Gui element is on the right of the most right point of the second Gui element
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements, verifying the following: 
* the elements of the first vector are on the right of the elements of the second vector
*/
vector<vector<Solution> > guiIsRightOf(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the set of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements, verifying the following: 
* the elements of the first vector are above the elements of the second vector
*The condition is verified if the upper point of the first Gui element is above the upper point of the second Gui element 
*and the lower point of the first Gui element is above the lower point of the second Gui element
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements, verifying the following: 
* the elements of the first vector are above the elements of the second vector
*/
vector<vector<Solution> > guiIsAbove(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the set of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements, verifying the following: 
* the elements of the first vector are below the elements of the second vector
*The condition is verified if the upper point of the first Gui element is below the upper point of the second Gui element 
*and the lower point of the first Gui element is below the lower point of the second Gui element
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements, verifying the following: 
* the elements of the first vector are below of the elements of the second vector
*/
vector<vector<Solution> > guiIsBelow(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/*
* Returns the set of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements contained in them
* The condition verification depends on the Gui elements used and is as follows:
* Case 1: The elements are of type "Circle": 
*			The radius of the containing circle is bigger than the sum of the distance between the centers and the radius of the contained circle
* Case 2: The containing element is of type "Circle" and the contained elements are of type "Triangle" or "Box":
*		  	The distance between all the edges of the contained elements to the center of the circle is less than the radius of the containing circle
* Case 3: The containing element is of type "Box":
*			_The highest point of the contained element has a smaller Y coordinate than the the highest point of the containing element 
*			_The lowest point of the contained element has a larger Y coordinate than the the lowest point of the containing element 
*			_The most left point of the contained element has a larger X coordinate than the the most left point of the containing element 
*			_The most right point of the contained element has a smaller X coordinate than the the most right point of the containing element
* Case 4: The containing element is of type "Triangle": 
*			_If the contained element is a "Box" or a "Triangle", the intersection of all the segments of the contained element with the containing 
*             "Triangle" and then we will make sure that at least one point of the contained element is inside the triangle
*			_If the contained element is a circle, it will be approximated to a "Box" and treated as such
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements contained in them
*/
vector<vector<Solution> > guiIsContains(vector<vector<Solution> > v1, vector<vector<Solution> > v2);




/**
* Returns the set of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements, verifying the following: 
* the areas of the elements of the first vector are smaller than the areas of the elements of the second vector
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements, verifying the following: 
* the areas of the elements of the first vector are smaller than the areas of the elements of the second vector
*/
vector<vector<Solution> > guiSmallerThan(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the set of solutionsformed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements, verifying the following: 
* the areas of the elements of the first vector are larger than the areas of the elements of the second vector
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements, verifying the following: 
* the areas of the elements of the first vector are larger than the areas of the elements of the second vector
*/
vector<vector<Solution> > guiBiggerThan(vector<vector<Solution> > v1, vector<vector<Solution> > v2);



/**
* Returns the set of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements having equal areas
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions formed by the combination of members of a first vector of Gui elements, with the members of a second vector of Gui elements having equal areas
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
