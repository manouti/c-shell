#test sample for the gramer.

# Introduction #

this sample work on [r13](https://code.google.com/p/c-shell/source/detail?r=13)


constant int :  one   := 45 ;
var int : two;
var int : three := 4;

procedure : foo ()
> two := (2 + 1) **5 + 6 ;
end procedure**

function int : function1 ( int : 44 , string : "toot" )
> three := two + 1 ;
end function



WorkSpace : WorkSpace1
{
> Box : Box1    ( Width : 44 , Hight : 45 , StartPoint :(98,90) ,   OnClick ())
> Box : Box2      (	 Width : 13 , Hight : 13 , Position : LeftOf Box1 , BackColor : (90, 98 , 99)  )
> Circle : Circle1 ( R : 45 , StartPoint : (9,8) , KeyPress ())

// I don't know if we should allow the declaration on a new GUI object inside an old one ??? nevertheless
> Circle  : Circle2   (  R : 9 , Position : Below Box : Box3 ( 	Width : 99 , Hight : 33 , StartPoint : (8 , 4)))

Box2.OnClick (
> nine := ten - 1 ;
> eight := function1 ( x , "test" );
);
> > }
Finish WorkSpace