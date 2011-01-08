#ifndef TRIANGLE_METADATA
#define TRIANGLE_METADATA

#include <Metadata.h>

class TriangleMetadata : public Metadata
{
	private:
	int x1;
	int y1;
	int x2;
	int y2;
	int x3;
	int y3;

	public:
	TriangleMetadata(int point_x1, int point_y1, int point_x2, int point_y2, int point_x3, int point_y3);
	int getPointX1() const;
	int getPointY1() const;
	int getPointX2() const;
	int getPointY2() const;
	int getPointX3() const;
	int getPointY3() const;
};

#endif
