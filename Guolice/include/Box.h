/**\file Box.h
*/
#ifndef BOX_H
#define BOX_H


#include <AbstractGui.h>

/** 
*\class Box
*\brief This class implements a GUI element of type "Box"
*
*/ 

class Box: public AbstractGui {
private:
	int width, height;

public:
/**
* \brief the constructer of the Box class
*@param bottomLeft
* The lower left edge of the box as point
*
*@param w
* An integer indicating the width of the box
*
*@param h
* An integer indicating the height of the box
*
*@param index
* An integer used to create the identifier of the box element created
*/
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
	
/**
* Returns the X coordinate of the most left point of the Box element
*
*@return
* An integer holding the value of the X coordinate of the most left point of the Box element
*/
	virtual int getLeftX() const
	{
		return point[0].getX();
	}

/**
* Returns the Y coordinate of the upper point of the Box element
*
*@return
* An integer holding the value of the Y coordinate of the upper point of the Box element
*/
	
	virtual int getUpperY() const
	{
		return point[3].getY();
	}

/**
* Returns the X coordinate of the most right point of the Box element
*
*@return
* An integer holding the value of the X coordinate of the most right point of the Box element
*/
	virtual int getRightX() const
	{
		return point[1].getX();
	}

/**
* Returns the Y coordinate of the lower point of the Box element
*
*@return
* An integer holding the value of the Y coordinate of the lower point of the Box element
*/

	virtual int getBottomY() const
	{
		return point[0].getY();
	}

/**
* Returns a string containing the information of a Box element in a specific format
*
*@return
* A string containing the information of a Box element as follows: "Box : [Corner(X,Y), Width(W), Height(H)]"
*/

	virtual string toString() const
	{
		string ret_str;
		char str[25];
		GuoliceUtil::dbl2str(str, width);
		ret_str = "Box : [Corner" + point[0].toString() + ", Width(" + string(str) + "),";
		GuoliceUtil::dbl2str(str, height);
		ret_str += " Height(" + string(str) + ")]";
		return ret_str;
	}	


/**
* Calculates the area of the Box element
*
*@return
* The area of the Box element as double
*/

	virtual double getArea() const
	{
		return width * height;
	}
};




#endif // BOX_H
