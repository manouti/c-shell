/**\file Line.h
 * \brief contains a class that models a line in 2-dimensional space
 * This file was written to study the case where a triangle contains other shapes
 */
#ifndef LINE
#define LINE

#include <Geometry.h>
#include <Point.h>

/**
 * \class Line
 * \brief Class that models a line in 2-dimensional space.
 *
 */

class Line
{
private:
	/**
	 * ax + by = c
	 */
	double a, b, c;

public:
/**
 * A constructor that defines a line from three variables.
 * @param a
 * @param b
 * @param c
 */
	Line(double a, double b, double c)
	{	
		this->a = a;
		this->b = b;
		this->c = c;
		
		normalize();
	}

/**
 * A constructor that defines a line from two points.
 * @param p1
 * @param p2
 */
	Line (Point* p1, Point* p2)
	{
		double dx = p1->getX() - p2->getX();
		double dy = p1->getY() - p2->getY();

		if (dx == 0)
		{
			a = 1;
			b = 0;
			c = p1->getX();
		}
		else
		{
			double m = dy/dx;
			double p = p1->getY() - (m * p1->getX());
			
			a = -m;
			b = 1;
			c = p;
		}

		normalize();
	}

/**
 * Checks whether a point is on the line.
 * @param p
 * @return <code>true</code> if the point is on the line.
 */
	bool containsPoint(Point* p)
	{
		return Geometry::isZero((a * p->getX() + b * p->getY() - c));
	}

/**
 * Returns the point at the intersection of two lines.
 * @param l1
 * @param l2
 * @return the point at the intersection of <code>l1</code> and <code>l2</code>.
 */
	static Point* getIntersection(Line* l1, Line* l2)
	{
		if(!Geometry::isZero(l1->getB()))
		{
			double ap = l2->getA() - l2->getB() / l1->getB() * l1->getA();
			if(!Geometry::isZero(ap))
			{
				double cp = l2->getC() - l2->getB() / l1->getB() * l1->getC();
				double x = cp / ap;
				double y = l1->getYFromX(x);
				Point* ret = new Point(x,y);
				return ret;
			}
			else
				return NULL;
		}
		else
		{
			double x = l1->getC() / l1->getA();
			if(Geometry::isZero(l2->getB()))
			{
				return NULL;
			}
			double y = l2->getYFromX(x);
			Point* ret = new Point(x,y);
			return ret;
		}
	}

/**
 * Returns the Y coordinate corresponding to an X coordinate of the line.
 * @param x
 *
 * @return Y as double 
 */
	double getYFromX(double x)
	{
		if(Geometry::isZero(b))
		{
			return 0;
		}
		else
		{
			return (c - a * x) / b;
		}
	}

/**
 * Returns the X coordinate corresponding to an Y coordinate of the line.
 * @param y
 *
 * @return X as double 
 */
	double getXFromY(double y)
	{
		if(Geometry::isZero(a))
		{
			return 0;
		}
		else
		{
			return (c - b * y) / a;
		}
	}

/**
 * Checks whether two lines are perpendicular.
 * @param l1
 * @param l2
 * @return <code>true</code> if the lines are perpendicular.
 */
	static bool arePerpendicular(Line l1, Line l2)
	{
		return Geometry::isZero(l1.getA() * l2.getA() + l1.getB() * l2.getB());
	}

/**
 * Checks whether two lines are parallel.
 * @param l1
 * @param l2
 * @return <code>true</code> if the lines are parallel.
 */
	static bool areParallel(Line l1, Line l2)
	{
		Line* nl1 = new Line(l1.getA(), l1.getB(), l1.getC());
		Line* nl2 = new Line(l2.getA(), l2.getB(), l2.getC());
		nl1->normalize();
		nl2->normalize();
		
		return (Geometry::areEqual(nl1->getA(), nl2->getA()) && Geometry::areEqual(nl1->getB(), nl2->getB()));
	}

/**
 * Checks whether two lines are the same line.
 * @param l1
 * @param l2
 * @return <code>true</code> if the lines are the same.
 */
	static bool areTheSame(Line l1, Line l2)
	{
		Line* nl1 = new Line(l1.getA(), l1.getB(), l1.getC());
		Line* nl2 = new Line(l2.getA(), l2.getB(), l2.getC());
		nl1->normalize();
		nl2->normalize();
		
		double dc = nl1->getC() - nl2->getC();
		
		return (areParallel(l1, l2) && Geometry::isZero(dc));
	}

	void normalize()
	{
		if(!Geometry::isZero(b))
		{
			a /= b;
			c /= b;
			b = 1;
		}
		else
		{
			b /= a;
			c /= a;
			a = 1;
		}
	}

	double getA()
	{
		return this->a;
	}

	double getB()
	{
		return this->b;
	}

	double getC()
	{
		return this->c;
	}
};


#endif	//Line
