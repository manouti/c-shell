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
    }

	int getRadius() const
	{
		return radius;
	}
	
	Point getCenter() const
	{ 
		return point[0];
	}
	
	virtual int getLeftX() const
	{
		return point[0].getX() - radius;
	}
	
	virtual int getUpperY() const
	{
		return point[0].getY() + radius;
	}
	
	virtual int getRightX() const
	{
		return point[0].getX() + radius;
	}
	
	virtual int getBottomY() const
	{
		return point[0].getY() - radius;
	}
};

#endif // CIRCLE_H
