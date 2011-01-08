
#include <TriangleMetadata.h>

TriangleMetadata::TriangleMetadata(int point_x1, int point_y1, int point_x2, int point_y2, int point_x3, int point_y3)
{
	x1 = point_x1;
	y1 = point_y1;
	x2 = point_x2;
	y2 = point_y2;
	x3 = point_x3;
	y3 = point_y3;
}

int TriangleMetadata::getPointX1() const
{
	return x1;
}

int TriangleMetadata::getPointY1() const
{
	return y1;
}

int TriangleMetadata::getPointX2() const
{
	return x2;
}

int TriangleMetadata::getPointY2() const
{
	return y2;
}

int TriangleMetadata::getPointX3() const
{
	return x3;
}

int TriangleMetadata::getPointY3() const
{
	return y3;
}

