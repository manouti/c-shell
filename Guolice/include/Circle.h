#ifndef CIRCLE_H
#define CIRCLE_H

#include "AbstractGui.h"


class Circle: public AbstractGui{
private:
    int radius;

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

	virtual string toString() const
	{
		string ret_str;
		char str[25];
		GuoliceUtil::dbl2str(str, radius);
		ret_str = "Circle : [Center" + point[0].toString() + ", Radius(" + string(str) + ")]";
		return ret_str;
	}

	virtual double getArea() const
	{
		return (22.0/7) * radius * radius; 
	}
};




#endif // CIRCLE_H
