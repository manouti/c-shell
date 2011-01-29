#ifndef ABSTRACTGUI_H
#define ABSTRACTGUI_H


#include "Point.h"
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <GuoliceUtil.h>
#include <cmath>





class AbstractGui{
protected:
    Point* point;
    int vertices; //should be added as a decorator
	string mode;
	string name;

public:

    AbstractGui(int numberOfVertcies)
	{
        point = new Point[numberOfVertcies];
        vertices = numberOfVertcies;
    }
	
	virtual int getLeftX() const = 0;

	virtual int getUpperY() const = 0;

	virtual int getRightX() const = 0;

	virtual int getBottomY() const = 0;
	
	virtual	string toString() const = 0;
	
	virtual double getArea() const = 0;

	string getMode() const
	{	
		return mode;
	}

	string getName() const
	{
		return name;
	}

    Point* getPoints() const
	{
        return point;
    }




};





#endif // ABSTRACTGUI_H
