#ifndef BOX_H
#define BOX_H

#include <AbstractGui.h>

class Box: public AbstractGui {
	public:
		/** Order of points is as follows:
		*
		*		3 *-------------------* 2
		*	  	  |		   			  |
		*	  	  | 			      |  (height)
		*	  	  |					  |
		*	  	  |					  |
		*	    0 *-------------------* 1
		*       	    (width)
		*
		* For a box, points[0] is always assumed to be the lowerleft vertex.
		*/
		Box(Point lowerLeft, int w, int h) : AbstractGui(4)
		{
			points[0] = lowerLeft;
			points[1] = Point(lowerLeft.getX() + w, lowerLeft.getY());
			points[2] = Point(points[1].getX(), points[1].getY() + h);
			points[3] = Point(lowerLeft.getX(), points[2].getY());
		}
		
		Point getLLCorner() const
		{ 
			return points[0];
		}
		
		virtual int getLeftX() const
		{
			return points[0].getX();
		}
		
		virtual int getUpperY() const
		{
			return points[3].getY();
		}
		
		virtual int getRightX() const
		{
			return points[1].getX();
		}
		
		virtual int getBottomY() const
		{
			return points[0].getY();
		}
		
		int getWidth() {
			return points[1].getX() - points[0].getX();
		}
		
		int getHeight() {
			return points[3].getY() - points[0].getY();
		}
};

#endif // BOX_H
