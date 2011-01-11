#include "Circle.h"
#include "Box.h"
#include "Triangle.h"


int main(){
    Point A(3, 4);
    Point B(5, 7);
    Point D(2, 5);
//
//    cout<<"The points are "<<A.toString()<<" and "<<B.toString()<<endl;
//    Point C = findLeft(A, B);
//    cout<<"Point leftOF is: "<<C.toString()<<endl;
//    cout<<"Point rightOF is: "<<findRight(A, B).toString()<<endl;
//    cout<<"Point above is: "<<findAbove(A, B).toString()<<endl;
//    cout<<"Point below is: "<<findBelow(A, B).toString()<<endl;
//    Point * pointer = new Point[3];
//    pointer[0] = D;
//   AbstractGui gui(2);
    Circle* cir;
    cir = new Circle(A, 3);
    cir->print();
//    cir.print();
   Box box(A, 5, 9);
    Triangle tri(A, B, D);
//    circle.print();
   box.print();
    tri.print();


}
