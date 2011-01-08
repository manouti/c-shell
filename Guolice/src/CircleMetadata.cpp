
#include <CircleMetadata.h>

CircleMetadata::CircleMetadata(int center_x, int center_y, int radius)
{
	x = center_x;
	y = center_y;
	r = radius;
}

int CircleMetadata::getCenterX() const
{
	return x;
}

int CircleMetadata::getCenterY() const
{
	return y;
}

int CircleMetadata::getRadius() const
{
	return r;
}
