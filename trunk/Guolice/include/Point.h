/**\file Point.h
*/
#ifndef POINT_H
#define POINT_H

#include <string>
#include <sstream>
#include <iostream>
#include <GuoliceUtil.h>
#include <cmath>
#include <Geometry.h>

using namespace std;

/** 
*\class Point
*\brief This class implements the construction of different Gui elements
*
*/
class Point{
private:
	double x;
	double y;

public:
/**
* \brief A constructer of the Point class
*/
	Point(){}


/**
* \brief The constructer of the Point class
*@param X
* the X coordinate of the point as double
*
*@param Y
* The Y coordinate of the point as double
*/	
	Point(double x, double y)
	{
		this->x = x;
		this->y = y;
	}


/**
* Returns the X coordinate of the point 
*
*@return
* A double holding the value of the X coordinate of the point
*/
	double getX() const
	{
		return x;
	}


/**
* Returns the Y coordinate of the point 
*
*@return
* A double holding the value of the Y coordinate of the point
*/
	
	double getY() const
	{
		return y;
	}


/**
* Returns a string containing the information of a Point in a specific format
*
*@return
* A string containing the information of a Point as follows: "(X, Y)"
*/
	string toString()
	{
		string ret_str;
		char str[25];
		GuoliceUtil::dbl2str(str, x);
		ret_str = "(" + string(str) +", ";
		GuoliceUtil::dbl2str(str, y);
		ret_str += string(str) + ")";
		return ret_str;
	}


/**
* Returns a the distance between this point and another point p2
*
*@param p2
* The point to which the distance is calculated
*
*@return
* the distance between this point and another point p2 as double 
*/
	double getDistanceTo(Point p2)
	{
		double dx = this->x - p2.getX();
		double dy = this->y - p2.getY();
		double dx2 = pow(dx,2);
		double dy2 = pow(dy,2);
		return sqrt( dx2 + dy2);
	}

/**
* Returns a the mid point between this point and another point p2
*
*@param p2
* The point to which the mid point is calculated
*
*@return
* the point in the mid between this point and another point p2 
*/
	Point getMidPoint (Point p2) 
	{
		double x = (this->x + p2.getX())/2.0;
		double y = (this->y + p2.getY())/2.0;
		Point* newPoint = new Point(x, y);
		return *newPoint;
	}	
/**
* check if this point and another point are the same 
*

*@param p2
* The point to which the checking is done
*
*@return
* true if they are the same 
*/
	bool isSamePoint(Point p2) 
	{
		return getDistanceTo(p2) < Geometry::TOLERANCE;
	}
};



#endif // POINT_H
