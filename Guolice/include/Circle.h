#ifndef CIRCLE_H
#define CIRCLE_H

#include "Point.h"
#include "AbstractGui.h"


class Circle: public AbstractGui{
private:
    double radius;

public:
    Circle(){
        AbstractGui(2);
    }
    Circle(Point center, double length){
        AbstractGui(2);
        radius = length;
        point[0]= center;
    }
    void print(){
        cout<<"Circle: with center"<<point[0].toString()<<" and radius "<<radius<<endl;

    }




};




#endif // CIRCLE_H
