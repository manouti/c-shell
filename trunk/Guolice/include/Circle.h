#ifndef CIRCLE_H
#define CIRCLE_H


#include "AbstractGui.h"


class Circle: public AbstractGui{
private:
    int radius;

public:

    Circle(Point center, int r) : AbstractGui(1) 
	{
        radius = r;
        point[0]= center;

		leftX = getLeftX();
		rightX = getRightX();
		upperY = getUpperY();
		bottomY = getBottomY();
    }

	int getRadius() const
	{
		return radius;
	}
	
	Point getCenter() const
	{ 
		return point[0];
	}
	
	int getLeftX() 
	{
		return point[0].getX() - radius;
	}
	
	int getUpperY() 
	{
		return point[0].getY() + radius;
	}
	
	int getRightX() 
	{
		return point[0].getX() + radius;
	}
	
	int getBottomY() 
	{
		return point[0].getY() - radius;
	}
};




#endif // CIRCLE_H
