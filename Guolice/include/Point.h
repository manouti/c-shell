#ifndef POINT_H
#define POINT_H

#include <string>
#include <sstream>
#include <iostream>
#include <GuoliceUtil.h>
#include <cmath>

using namespace std;

class Point{
private:
	double x;
	double y;

public:
	Point(){}	
	
	Point(double x, double y)
	{
		this->x = x;
		this->y = y;
	}
	
	double getX() const
	{
		return x;
	}
	
	double getY() const
	{
		return y;
	}
	
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

	double getDistanceTo(Point p2)
	{
		double dx = this->x - p2.getX();
		double dy = this->y - p2.getY();
		double dx2 = pow(dx,2);
		double dy2 = pow(dy,2);
		return sqrt( dx2 + dy2);
	}
	
};

/*
Point findLeft(Point A, Point B)
{
	if(A.x < B.x)
	{
		return A;
	}
	return B;
}
//returns which point is right of

Point findRight(Point A, Point B)
{
	if(A.x > B.x)
	{
		return A;
	}
	return B;
}

Point findAbove(Point A, Point B)
{
	if(A.y> B.y)
	{
		return A;
	}
	return B;
}

Point findBelow(Point A, Point B)
{
	if(A.y < B.y)
	{
		return A;
	}
	return B;
}

Point minY(Point* pointArray, int length)
{
	Point* pointer = new Point[length];
	pointer = pointArray;
	Point min = pointer[0];
	for(int i=1; i< length; i++)
	{
		min = findBelow(min, pointer[i] );
	}
	return min;
}

Point minX(Point* pointArray, int length)
{
	Point * pointer = new Point[length];
	pointer = pointArray;
	Point min = pointer[0];
	for(int i=1; i< length; i++)
	{
		min = findLeft(min, pointer[i] );
	}
	return min;
}

Point maxY(Point* pointArray, int length)
{
	Point * pointer = new Point[length];
	pointer = pointArray;
	Point max = pointer[0];
	for(int i=1; i< length; i++)
	{
		max = findAbove(max, pointer[i] );
	}
	return max;
}

Point maxX(Point* pointArray, int length)
{
	Point * pointer = new Point[length];
	pointer = pointArray;
	Point max = pointer[0];
	for(int i=1; i< length; i++)
	{
		max = findRight(max, pointer[i] );
	}
	return max;
}

*/


#endif // POINT_H
