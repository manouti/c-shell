#ifndef TRIANGLE_H
#define TRIANGLE_H

#include "AbstractGui.h"

class Triangle : public AbstractGui{
public:

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


	virtual int getLeftX() const
	{
		int leftX = point[0].getX();
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
	
	virtual int getUpperY() const
	{
		int upperY = point[0].getY();
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
	
	virtual int getRightX() const
	{
		int rightX = point[0].getX();
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
	
	virtual int getBottomY() const
	{
		int bottomY = point[0].getY();
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
	
	virtual string toString() const
	{
		string ret_str;
		ret_str = "Triangle : [Point_1" + point[0].toString() + ", Point_2" + point[1].toString() +", Point_3" + point[2].toString() + ")]";
		return ret_str;
	}

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
