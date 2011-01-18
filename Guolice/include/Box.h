#ifndef BOX_H
#define BOX_H

#include <AbstractGui.h>

class Box: public AbstractGui {
private:
	int width, height;

public:
	Box(Point bottomLeft, int w, int h) : AbstractGui(4)
	{
		point[0] = bottomLeft;
		point[1] = Point(bottomLeft.getX() + w, bottomLeft.getY());
		point[2] = Point(point[1].getX(), point[1].getY() + h);
		point[3]  =Point(bottomLeft.getX(), point[2].getY());
		width = w;
		height = h;
	}
	
	Point* getBLCorner() const
	{ 
		return &point[0];
	}
	
	virtual int getLeftX() const
	{
		return point[0].getX();
	}
	
	virtual int getUpperY() const
	{
		return point[3].getY();
	}
	
	virtual int getRightX() const
	{
		return point[1].getX();
	}
	
	virtual int getBottomY() const
	{
		return point[0].getY();
	}

};

#endif // BOX_H
