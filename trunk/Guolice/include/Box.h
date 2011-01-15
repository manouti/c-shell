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
		
		leftX = getLeftX();
		rightX = getRightX();
		upperY = getUpperY();
		bottomY = getBottomY();
	}
	
	Point* getBLCorner() const
	{ 
		return &point[0];
	}
	
	int getLeftX() 
	{
		return point[0].getX();
	}
	
	int getUpperY() 
	{
		return point[3].getY();
	}
	
	int getRightX() 
	{
		return point[1].getX();
	}
	
	int getBottomY() 
	{
		return point[0].getY();
	}

};




#endif // BOX_H
