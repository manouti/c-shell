/**\file Segment.h
 * \brief contains a class that models a segment in 2-dimensional space
 * This file was written to study the case where a triangle contains ather shapes
 */
#ifndef SEGMENT
#define SEGMENT

#include <cmath>
#include <Line.h>
/**
 * \class Segment
 * \brief Class that models a segment in 2-dimensional space.
 *
 */
class Segment{

private:
	Point p1, p2;

public:
/**
* A constructor that defines a segment from two points: its extremities.
* @param p1
* @param p2
*/
	Segment(Point p1, Point p2)
	{
		this->p1 = p1;
		this->p2 = p2;
	}

/**
* Returns the length of the segment.
* @return the length of the segment
*/
	double getLength()
	{
		return p1.getDistanceTo(p2);
	}

/**
* Checks whether a point is on the segment.
* @param p
* @return <code>true</code> if the point is on the segment
*/
	bool containsPoint(Point p)
	{
		if(&p == NULL)
		{
			return false;
		}
		
		double d1 = p.getDistanceTo(p1);
		double d2 = p.getDistanceTo(p2);
		double d = getLength();
		
		return fabs(d - (d1 + d2)) < Geometry::TOLERANCE;
	}

/**
* Returns the point at the intersection of two segments.
* @param s1
* @param s2
* @return the point at the intersection of <code>s1</code> and <code>s2</code>,
* or <code>null</code> if no such point exists or if an infinite number of
* points exist.
*/
	static Point* getIntersection(Segment s1, Segment s2)
	{
		Line* l1 = new Line(s1.getP1(), s1.getP2());
		Line* l2 = new Line(s2.getP1(), s2.getP2());

		Point* intersect = Line::getIntersection(*l1, *l2);
		if(intersect == NULL)
		{
			bool same11 = s1.getP1().isSamePoint(s2.getP1());
			bool same12 = s1.getP1().isSamePoint(s2.getP2());
			bool same21 = s1.getP2().isSamePoint(s2.getP1());
			bool same22 = s1.getP2().isSamePoint(s2.getP2());
			
			bool cont11 = s1.containsPoint(s2.getP1());
			bool cont12 = s1.containsPoint(s2.getP2());
			bool cont21 = s2.containsPoint(s1.getP1());
			bool cont22 = s2.containsPoint(s1.getP2());

			if(same11 && !cont12 && !cont22)
			{
				return &(s1.getP1());
			}
			if(same12 && !cont11 && !cont22)
			{
				return &(s1.getP1());
			}
			if(same21 && !cont12 && !cont21)
			{
				return &(s1.getP2());
			}
			if(same22 && !cont11 && !cont21)
			{
				return &(s1.getP2());
			}

			return NULL;
		}
		else
		{
cout << " in segment 2 " << intersect->toString() << endl;
			if(s1.containsPoint(*intersect) && s2.containsPoint(*intersect))
			{
				return intersect;
			}
			else
			{
				return NULL;
			}
		}
	}

	Point getP1()
	{
		return this->p1;
	}

	Point getP2()
	{
		return this->p2;
	}
};

#endif	//SEGMENT

