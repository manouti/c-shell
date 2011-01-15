the test case should be written like this example:
*******************************
C1 : -2, 0, 1
B1 : 1, 2, 2, 1
T1 : 0,0 , 1 ,1 , 0 , 2

*******************************

where you put the name of the GUI_variable and the ':'
followed by the parameters separated by comma.

for the Circle 	:   'ID' : 'center_point_X' , 'center_point_Y' , 'radius'
for the Box		:	'ID' : 'left_Bottom_corner_X' , 'left_Bottom_corner_Y' , 'length_(on_the_X_axis)' , 'width_(on_the_Y_axis)'
for the triangle:	'ID' : 'point_1_X' , 'point_1_Y' , 'point_2_X' , 'point_2_Y' , 'point_3_X' , 'point_3_Y' 

and then you put it the "../Guolice/test_examples/gui_metadata" file

good luck..  
