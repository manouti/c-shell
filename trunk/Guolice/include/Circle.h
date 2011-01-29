/**\file Circle.h
*/
#ifndef CIRCLE_H
#define CIRCLE_H

#include "AbstractGui.h"

/** 
*\class Circle
*\brief This class implements a GUI element of type "Circle"
*
*/ 
class Circle: public AbstractGui{
private:
    int radius;

/**
* \brief the constructer of the Circle class
*@param center
* The center of the circle as point
*
*@param r
* An integer indicating the radius of the circle
*
*@param index
* An integer used to create the identifier of the circle element created
*/
public:

    Circle(Point center, int r, int index) : AbstractGui(1) 
	{
        radius = r;
        point[0]= center;
		mode = "Circle";
		char str[25];
		GuoliceUtil::int2str(str, index);
		name = "C" + string(str);
    }

/**
* Returns the radius of the Circle element
*
*@return
* An integer holding the radius of the Circle element
*/

	int getRadius() const
	{
		return radius;
	}

/**
* Returns the center of the Circle element
*
*@return
* An integer holding the value of the center of the Circle element
*/
	
	Point getCenter() const
	{ 
		return point[0];
	}

/**
* Returns the X coordinate of the most left point of the Circle element
*
*@return
* An integer holding the value of the X coordinate of the most left point of the Circle element
*/
	
	virtual int getLeftX() const
	{
		return point[0].getX() - radius;
	}
	
/**
* Returns the Y coordinate of the upper point of the Circle element
*
*@return
* An integer holding the value of the Y coordinate of the upper point of the Circle element
*/
	virtual int getUpperY() const
	{
		return point[0].getY() + radius;
	}

/**
* Returns the X coordinate of the most right point of the Circle element
*
*@return
* An integer holding the value of the X coordinate of the most right point of the Circle element
*/
	virtual int getRightX() const
	{
		return point[0].getX() + radius;
	}
	

/**
* Returns the Y coordinate of the lower point of the Circle element
*
*@return
* An integer holding the value of the Y coordinate of the lower point of the Circle element
*/
	virtual int getBottomY() const
	{
		return point[0].getY() - radius;
	}


/**
* Returns a string containing the information of a Circle element in a specific format
*
*@return
* A string containing the information of a Circle element as follows: "Circle : [center(X,Y), Radius(R)]"
*/
	virtual string toString() const
	{
		string ret_str;
		char str[25];
		GuoliceUtil::dbl2str(str, radius);
		ret_str = "Circle : [Center" + point[0].toString() + ", Radius(" + string(str) + ")]";
		return ret_str;
	}

/**
* Calculates the area of the Circle element
*
*@return
* The area of the Circle element as double
*/
	virtual double getArea() const
	{
		return (22.0/7) * radius * radius; 
	}
};


#endif // CIRCLE_H
