/**\file Triangle.h
*/
#ifndef TRIANGLE_H
#define TRIANGLE_H

#include "AbstractGui.h"


/** 
*\class Triangle
*\brief This class implements a GUI element of type "Triangle"
*
*/ 

class Triangle : public AbstractGui{
public:
/**
* \brief The constructer of the Triangle class
*@param A
* The first corner of the triangle as point
*
*@param B
* The second corner of the triangle as point
*
*@param C
* The third corner of the triangle as point
*
*@param index
* A integer used to create the identifier of the triangle element created
*/

    Triangle(Point A, Point B, Point C, int index) : AbstractGui(3)
	{
        point[0] = A;
        point[1] = B;
        point[2] = C;
		mode = "Triangle";
		char str[25];
		GuoliceUtil::int2str(str, index);
		name = "T" + string(str);
    }


/**
* Returns the X coordinate of the most left point of the Triangle element
*
*@return
*
* An integer holding the value of the X coordinate of the most left point of the Triangle element
*/
	virtual double getLeftX() const
	{
		double leftX = point[0].getX();
		if (point[1].getX() < leftX)
		{
			leftX = point[1].getX();
		}
		if (point[2].getX() < leftX)
		{
			leftX = point[2].getX();
		}
		return leftX;
	}
	
/**
* Returns the Y coordinate of the upper point of the Triangle element
*
*@return
*
* An integer holding the value of the Y coordinate of the upper point of the Triangle element
*/
	virtual double getUpperY() const
	{
		double upperY = point[0].getY();
		if (point[1].getY() > upperY)
		{
			upperY = point[1].getY();
		}
		if (point[2].getY() > upperY)
		{
			upperY = point[2].getY();
		}
		return upperY; 
	}

/**
* Returns the X coordinate of the most right point of the Triangle element
*
*@return
*
* An integer holding the value of the X coordinate of the most right point of the Triangle element
*/
	virtual double getRightX() const
	{
		double rightX = point[0].getX();
		if (point[1].getX() > rightX)
		{
			rightX = point[1].getX();
		}
		if (point[2].getX() > rightX)
		{
			rightX = point[2].getX();
		}
		return rightX; 
	}

	/**
* Returns the Y coordinate of the lower point of the Triangle element
*
*@return
*
* An integer holding the value of the Y coordinate of the lower point of the Triangle element
*/
	
	virtual double getBottomY() const
	{
		double bottomY = point[0].getY();
		if (point[1].getY() < bottomY)
		{
			bottomY = point[1].getY();
		}
		if (point[2].getY() < bottomY)
		{
			bottomY = point[2].getY();
		}
		return bottomY; 
	}


/**
* Returns a string containing the information of a Triangle element in a specific format
*
*@return
*
* A string containing the information of a Triangle element as follows: "Triangle : [Point_1(Xa,Ya), Point_2(Xb,Yb), Point_3(Xc,Yc)]"
*/
	virtual string toString() const
	{
		string ret_str;
		ret_str = "Triangle : [Point_1" + point[0].toString() + ", Point_2" + point[1].toString() +", Point_3" + point[2].toString() + ")]";
		return ret_str;
	}

/**
* Calculates the area of the Triangle element
*
*@return
*
* The area of the Triangle element as double
*/
	virtual double getArea() const
	{
		double d1 = point[0].getDistanceTo(point[1]);
		double d2 = point[1].getDistanceTo(point[2]);
		double d3 = point[0].getDistanceTo(point[2]);
		
		double cosineThetta = (pow(d1, 2) - pow(d2, 2) - pow(d3, 2))/ (-2 * d2 * d3);
		double sineThetta = sqrt(1 - pow(cosineThetta, 2));
		double height = sineThetta * d2;
		return 0.5 * d3 * height;
	}
};



#endif // TRIANGLE_H
