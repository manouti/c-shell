#ifndef BOX_H
#define BOX_H


#include <AbstractGui.h>

class Box: public AbstractGui {
private:
	int width, height;

public:

	Box(Point bottomLeft, int w, int h, int index) : AbstractGui(4)
	{
		point[0] = bottomLeft;
		point[1] = Point(bottomLeft.getX() + w, bottomLeft.getY());
		point[2] = Point(point[1].getX(), point[1].getY() + h);
		point[3]  =Point(bottomLeft.getX(), point[2].getY());
		mode = "Box";
		width = w;
		height = h;
		char str[25];
		GuoliceUtil::int2str(str, index);
		name = "B" + string(str);
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

	virtual string toString() const
	{
		string ret_str;
		char str[25];
		GuoliceUtil::dbl2str(str, width);
		ret_str = "Box : [Corner" + point[0].toString() + ",Width(" + string(str) + "),";
		GuoliceUtil::dbl2str(str, height);
		ret_str += " Height(" + string(str) + ")]";
		return ret_str;
	}	

	virtual double getArea() const
	{
		return width * height;
	}
};




#endif // BOX_H
