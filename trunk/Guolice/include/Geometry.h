/**\file Geometry.h
 * \brief Holds any static fields and methods used in Segment.h or Line.h
 *
 */
#ifndef GEOMETRY
#define GEOMETRY

/**
 * \class Geometry
 * \brief Holds any static fields and methods used in Segment.h or Line.h
 *
 */
class Geometry
{
public:
/**
 * Tolerance of the calculations. Anything smaller is considered zero.
 */
	static const double  TOLERANCE = 1e-9;

/**
 * Checks whether a real value is close to zero.
 * @param x
 * @return <code>true</code> if <code>x</code> is close to zero
 */
	static bool isZero(double x)
	{
		return fabs(x) < TOLERANCE;
	}

/**
 * Checks whether two double values are equal.
 * @param x
 * @return <code>true</code> if <code>x</code> they are equal
 */
	static bool areEqual(double a, double b)
	{
		return isZero(a - b);
	}
};

#endif	//GEOMETRY
