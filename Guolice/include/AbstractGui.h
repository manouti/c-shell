#ifndef ABSTRACTGUI_H
#define ABSTRACTGUI_H


#include "Point.h"


class AbstractGui{
protected:
    Point * point;
    int vertices; //should be added as a decorator
public:
    AbstractGui(){
        point = new Point();


    }
    AbstractGui(int numberOfVertcies){
        point = new Point[numberOfVertcies];
        vertices = numberOfVertcies;

    }

    Point * getPoints(){
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





};





#endif // ABSTRACTGUI_H
