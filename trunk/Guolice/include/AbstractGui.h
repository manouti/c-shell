/**\file AbstractGui.h
*/

#ifndef ABSTRACTGUI_H
#define ABSTRACTGUI_H


#include "Point.h"
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <GuoliceUtil.h>
#include <cmath>

/** 
*\class AbstractGui
*\brief This class is the parent class of all the element classes used to construct the GUI elements of the program
*
*/ 

class AbstractGui{
protected: 
    Point* point; //!< protected pointer to a "point" class used to store an array of points
    int vertices; //!< protected data member containing the number of vertices of the GUI elements, of type integer
	string mode; //!< protected data member indicating the shape of the GUI element, of type string. It can take the following values: "circle, box, triangle"
	string name;//!< protected data member containing the identifier of each GUI element

public:
/**
* \brief the constructer of the Abstract GUI class
*
*@param numberOfVertcies
* An integer containing the dimension of the array of points
*/
    AbstractGui(int numberOfVertcies)
	{
        point = new Point[numberOfVertcies]; 
        vertices = numberOfVertcies; 
    }
	
/**
* Returns the X coordinate of the most left point of the GUI element
*
*@return
* An integer holding the value of the X coordinate of the most left point of the GUI element
*/
	virtual int getLeftX() const = 0;

/**
* Returns the Y coordinate of the upper point of the GUI element
*
*@return
* An integer holding the value of the Y coordinate of the upper point of the GUI element
*/

	virtual int getUpperY() const = 0;

/**
* Returns the X coordinate of the most right point of the GUI element
*
*@return
* An integer holding the value of the X coordinate of the most right point of the GUI element
*/

	virtual int getRightX() const = 0;


/**
* Returns the Y coordinate of the lower point of the GUI element
*
*@return
* An integer holding the value of the Y coordinate of the lower point of the GUI element
*/
	virtual int getBottomY() const = 0;

/**
* Returns a string containing the information of a GUI element in a specific format
*
*@return
* A string containing the information of a GUI element in a specific format depending on the GUI element mode
*/

	virtual	string toString() const = 0;

/**
* Calculates the area of the GUI element
*
*@return
* The area of the GUI element as double
*/
	
	virtual double getArea() const = 0;

/**
*Returns the mode of the GUI element
*
*@return
* The mode of the GUI element as string
*/

	string getMode() const
	{	
		return mode;
	}

/**
*Returns the name of the GUI element
*
*@return
* The name of the GUI element as string
*/

	string getName() const
	{
		return name;
	}

/**
*Returns an array of the points constructing the GUI element
*
*@return
* A pointer to the points array
*/
    Point* getPoints() const
	{
        return point;
    }

};



#endif // ABSTRACTGUI_H
