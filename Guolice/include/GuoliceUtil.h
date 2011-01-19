#ifndef GUOLICE_UTIL
#define GUOLICE_UTIL

#include <Point.h>
#include <cmath>

class GuoliceUtil{
	public:
		//double TOLERANCE = 1e-9;

		static float getDistance(Point p1, Point p2)
		{
			double x = p1.getX() - p2.getX();
			double y = p1.getY() - p2.getY();
			double x2 = pow(x,2);
			double y2 = pow(y,2);
			return sqrt(x2 + y2);
		}
		
		static Point getMidpoint(Point p1, Point p2) 
		{
			double x = (p1.getX() + p2.getX())/2.0;
			double y = (p1.getY() + p2.getY())/2.0;
			Point* newPoint = new Point(x , y);
			return *newPoint;
		}
};

#endif
