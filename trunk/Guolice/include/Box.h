#ifndef BOX_H
#define BOX_H

#include "AbstractGui.h"

class Box: public AbstractGui {
  private:
    double length, width;
  public:
    Box(){
       AbstractGui(4);
   }
    Box(Point bottomLeft, Point bottomRight, Point topRight, Point topLeft){ // defined ccw
        AbstractGui(4);
        point[0] = bottomLeft;
        point[1] = bottomRight;
        point[2] = topRight;
        point[3] = topLeft;
        length = bottomRight.x -  bottomLeft.x;
        width =  topRight.y - bottomRight.y;


    }
    Box(Point bottomLeft, int length, int width){
        AbstractGui(4);
        point[0] = bottomLeft;
        point[1] = Point(bottomLeft.x + length, bottomLeft.y);
        point[2] = Point(point[1].x, point[1].y + width);
        point[3]  =Point(bottomLeft.x, point[2].y);
        this->length = length;
        this->width = width;

    }

    void print(){
        cout<<"Box: with points";
        for(int i =0; i< 4; i++)
            cout<<point[i].toString()<<", ";
        cout<<endl;
    }





};




#endif // BOX_H
