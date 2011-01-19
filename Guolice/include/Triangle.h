#ifndef TRIANGLE_H
#define TRIANGLE_H

#include "AbstractGui.h"

class Triangle : public AbstractGui{
	public:
		Triangle(Point A, Point B, Point C) : AbstractGui(3)
		{
			points[0] = A;
			points[1] = B;
			points[2] = C;
		}

		Point* getVertices() const
		{ 
			return points;
		}

		virtual int getLeftX() const
		{
			int leftX = points[0].getX();
			if (points[1].getX() < leftX)
			{
				leftX = points[1].getX();
			}
			if (points[2].getX() < leftX)
			{
				leftX = points[2].getX();
			}
			return leftX;
		}
		
		virtual int getUpperY() const
		{
			int upperY = points[0].getY();
			if (points[1].getY() > upperY)
			{
				upperY = points[1].getY();
			}
			if (points[2].getY() > upperY)
			{
				upperY = points[2].getY();
			}
			return upperY; 
		}
		
		virtual int getRightX() const
		{
			int rightX = points[0].getX();
			if (points[1].getX() > rightX)
			{
				rightX = points[1].getX();
			}
			if (points[2].getX() > rightX)
			{
				rightX = points[2].getX();
			}
			return rightX; 
		}
		
		virtual int getBottomY() const
		{
			int bottomY = points[0].getY();
			if (points[1].getY() < bottomY)
			{
				bottomY = points[1].getY();
			}
			if (points[2].getY() < bottomY)
			{
				bottomY = points[2].getY();
			}
			return bottomY; 
		}
};

#endif // TRIANGLE_H
