#ifndef CIRCLE_H
#define CIRCLE_H

#include "AbstractGui.h"

class Circle: public AbstractGui{
	private:
		int radius;

	public:
		Circle(Point center, int radius) : AbstractGui(1) 
		{
			this->radius = radius;
			points[0] = center;
		}

		int getRadius() const
		{
			return radius;
		}
		
		Point getCenter() const
		{ 
			return points[0];
		}
		
		virtual int getLeftX() const
		{
			return points[0].getX() - radius;
		}
		
		virtual int getUpperY() const
		{
			return points[0].getY() + radius;
		}
		
		virtual int getRightX() const
		{
			return points[0].getX() + radius;
		}
		
		virtual int getBottomY() const
		{
			return points[0].getY() - radius;
		}
};

#endif // CIRCLE_H
