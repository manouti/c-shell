#ifndef TRIANGLE_H
#define TRIANGLE_H

#include "AbstractGui.h"

class Triangle : public AbstractGui{
public:

    Triangle(Point A, Point B, Point C) : AbstractGui(3)
	{
        point[0] = A;
        point[1] = B;
        point[2] = C;

		leftX = getLeftX();
		rightX = getRightX();
		upperY = getUpperY();
		bottomY = getBottomY();
    }

	Point* getPoint_A() const
	{ 
		return &point[0];
	}

	int getLeftX() 
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
	
	int getUpperY() 
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
	
	int getRightX() 
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
	
	int getBottomY() 
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
};



#endif // TRIANGLE_H
