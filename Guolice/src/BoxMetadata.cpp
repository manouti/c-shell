
#include <BoxMetadata.h>

BoxMetadata::BoxMetadata(int lb_corner_x, int lb_corner_y, int length, int width)
{
	x = lb_corner_x;
	y = lb_corner_y;
	l = length;
	w = width;
}

int BoxMetadata::getLBCornerX() const
{
	return x;
}

int BoxMetadata::getLBCornerY() const
{
	return y;
}

int BoxMetadata::getLength() const
{
	return l;
}

int BoxMetadata::getWidth() const
{
	return w;
}
