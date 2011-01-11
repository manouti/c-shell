#ifndef POINT_H
#define POINT_H

#include <string>
#include <sstream>
#include <iostream>
using namespace std;

class Point{
public:
       int x;
       int y;
       Point(){}
       Point(int x, int y){
           this->x = x;
           this->y = y;
       }
       string toString(){

           stringstream ss;
           ss <<"("<<x<<", "<<y<<")";
           return ss.str();
       }

};


Point findLeft(Point A, Point B){
    if(A.x < B.x)
        return A;
    return B;
}
//returns which point is right of
Point findRight(Point A, Point B){
    if(A.x > B.x)
        return A;
    return B;

}

Point findAbove(Point A, Point B){
    if(A.y> B.y)
        return A;
    return B;

}

Point findBelow(Point A, Point B){

    if(A.y < B.y)
        return A;
    return B;
}

Point minY(Point* pointArray, int length){
    Point* pointer = new Point[length];
    pointer = pointArray;
    Point min = pointer[0];
    for(int i=1; i< length; i++)
        min = findBelow(min, pointer[i] );
    return min;

}

Point minX(Point* pointArray, int length){
    Point * pointer = new Point[length];
    pointer = pointArray;
    Point min = pointer[0];
    for(int i=1; i< length; i++)
        min = findLeft(min, pointer[i] );
    return min;

}

Point maxY(Point* pointArray, int length){
    Point * pointer = new Point[length];
    pointer = pointArray;
    Point max = pointer[0];
    for(int i=1; i< length; i++)
        max = findAbove(max, pointer[i] );
    return max;

}

Point maxX(Point* pointArray, int length){
    Point * pointer = new Point[length];
    pointer = pointArray;
    Point max = pointer[0];
    for(int i=1; i< length; i++)
        max = findRight(max, pointer[i] );
    return max;

}









#endif // POINT_H
