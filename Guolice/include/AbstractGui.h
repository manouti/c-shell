#ifndef ABSTRACTGUI_H
#define ABSTRACTGUI_H

#include "Point.h"

class AbstractGui{
	protected:
		Point* points;
		int numOfVertices; //should be added as a decorator

	public:
		AbstractGui(int numberOfVertices)
		{
			points = new Point[numberOfVertices];
			numOfVertices = numberOfVertices;
		}
		
		virtual int getLeftX() const = 0;

		virtual int getUpperY() const = 0;

		virtual int getRightX() const = 0;

		virtual int getBottomY() const = 0;

		/*
		Point * getPoints()
		{
			return point;
		}

		void print();

		bool below(AbstractGui A){


		}
		bool above(AbstractGui A){


		}


		bool leftOf(AbstractGui A){


		}

		bool rightOf(AbstractGui A){


		}

	*/
};

#endif // ABSTRACTGUI_H
