#ifndef CIRCLE_METADATA
#define CIRCLE_METADATA

#include <Metadata.h>

class CircleMetadata : public Metadata
{
	private:
	int x;
	int y;
	int r;

	public:
	CircleMetadata(int center_x, int center_y, int radius);
	int getCenterX() const;
	int getCenterY() const;
	int getRadius() const;
};

#endif
