#ifndef BOX_METADATA
#define BOX_METADATA

#include <Metadata.h>

class BoxMetadata : public Metadata
{
	private:
	int x;
	int y;
	int l;
	int w;

	public:
	BoxMetadata(int lb_corner_x, int lb_corner_y, int length, int width);
	int getLBCornerX() const;
	int getLBCornerY() const;
	int getLength() const;
	int getWidth() const;
};

#endif
