#ifndef GUOLICE_UTIL
#define GUOLICE_UTIL

//#include <Point.h>
//#include <cmath>
#include <stdio.h>
#include <string.h>


class GuoliceUtil{
public:
	//double TOLERANCE = 1e-9;


/*	
	static Point getMidpoint(Point p1, Point p2) 
	{
		double x = (p1.getX() + p2.getX())/2.0;
		double y = (p1.getY() + p2.getY())/2.0;
		Point* newPoint = new Point(x , y);
		return *newPoint;
	}
*/
	static void dbl2str (char* str, double number)
	{
		memset(str, 0, 25);
		sprintf(str, "%.2f", number);
	}

	static void int2str (char* str, int number)
	{
		memset(str, 0, 25);
		sprintf(str, "%d", number);
	}
};

#endif
