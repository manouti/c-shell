#ifndef TRIANGLE_H
#define TRIANGLE_H

#include "AbstractGui.h"

class Triangle : public AbstractGui{

 public:
    Triangle(){
        AbstractGui(3);
    }
    Triangle(Point A, Point B, Point C){
        AbstractGui(3);
        point[0] = A;
        point[1] = B;
        point[2] = C;
    }

    Point getPoint(int vertex){
        return point[vertex];

    }

    void print(){
        cout<<"Triangle: with points";
        for(int i =0; i< 3; i++)
            cout<<point[i].toString()<<", ";
        cout<<endl;
    }


};



#endif // TRIANGLE_H
