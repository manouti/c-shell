/** \file guiCompare.cpp
*\brief This file implements the different comparison methods between the Gui elements
*     
*/

#include <guiCompare.h>

/********************************************************************************************************/
/* "Left" function
/********************************************************************************************************/

/**
* Returns the set of solutions of the Gui elements, ones being on the left of the others
* The condition is verified if the most left point of the first Gui element is on the left of the most left point of the second Gui element 
* and the most right point of the first Gui element is on the left of the most right point of the second Gui element
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the groups of Gui elements located ones on the left of the others
*/

vector<vector<Solution> > guiIsLeftOf(vector<vector<Solution> > v1, vector<vector<Solution> > v2)
{
	vector<vector<Solution> > solution;
	for (int it_v1 = 0 ; it_v1 < v1.size() ; it_v1++)
	{	
		vector<Solution> item_v1 = v1.at(it_v1);
		for (int it_v2 = 0 ; it_v2 < v2.size() ; it_v2++)
		{
			vector<Solution> item_v2 = v2.at(it_v2);
			bool met = true;
			for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
			{	
				if (!met) continue;

				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					if (!met) continue;

					Solution gui_1 = item_v1.at(it_sub_v1);
					Solution gui_2 = item_v2.at(it_sub_v2);

					if (gui_1.shape->getName() == gui_2.shape->getName())
					{
						met = false;
						continue;
					}
					int g1LeftX, g2LeftX;
					int g1RightX, g2RightX;
				
					g1LeftX = gui_1.shape->getLeftX();
					g1RightX = gui_1.shape->getRightX();
				
					g2LeftX = gui_2.shape->getLeftX();
					g2RightX = gui_2.shape->getRightX();	

					bool  condition1 = g1LeftX < g2LeftX;
					bool  condition2 = g1RightX < g2RightX;
					 
					met = condition1 && condition2;
				}
			}
			if (met)
			{
				vector<Solution> result;
				for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
				{	
					result.push_back(item_v1.at(it_sub_v1));
				}
				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					result.push_back(item_v2.at(it_sub_v2));
				}
				solution.push_back(result);
			}
		}
	}
	return solution;
}

/********************************************************************************************************/
/* "Right" function
/********************************************************************************************************/


/**
* Returns the set of solutions of all the Gui elements that are located on the right of other elements
* The condition is verified if the most left point of the first Gui element is on the right of the most left point of the second Gui element 
* and the most right point of the first Gui element is on the right of the most right point of the second Gui element
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui elements that are located on the right of other elements
*/

vector<vector<Solution> > guiIsRightOf(vector<vector<Solution> > v1, vector<vector<Solution> > v2)
{
	vector<vector<Solution> > solution;
	for (int it_v1 = 0 ; it_v1 < v1.size() ; it_v1++)
	{	
		vector<Solution> item_v1 = v1.at(it_v1);
		for (int it_v2 = 0 ; it_v2 < v2.size() ; it_v2++)
		{
			vector<Solution> item_v2 = v2.at(it_v2);
			bool met = true;
			for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
			{	
				if (!met) continue;

				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					if (!met) continue;

					Solution gui_1 = item_v1.at(it_sub_v1);
					Solution gui_2 = item_v2.at(it_sub_v2);

					if (gui_1.shape->getName() == gui_2.shape->getName())
					{
						met = false;
						continue;
					}
					int g1LeftX, g2LeftX;
					int g1RightX, g2RightX;
				
					g1LeftX = gui_1.shape->getLeftX();
					g1RightX = gui_1.shape->getRightX();
				
					g2LeftX = gui_2.shape->getLeftX();
					g2RightX = gui_2.shape->getRightX();	

					bool  condition1 = g1LeftX > g2LeftX;
					bool  condition2 = g1RightX > g2RightX;
					 
					met = condition1 && condition2;
				}
			}
			if (met)
			{
				vector<Solution> result;
				for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
				{	
					result.push_back(item_v1.at(it_sub_v1));
				}
				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					result.push_back(item_v2.at(it_sub_v2));
				}
				solution.push_back(result);
			}
		}
	}
	return solution;
}

/********************************************************************************************************/
/* "Above" function
/********************************************************************************************************/


/**
* Returns the set of solutions of all the Gui elements that are located above other elements
*The condition is verified if the upper point of the first Gui element is above the upper point of the second Gui element 
*and the lower point of the first Gui element is above the lower point of the second Gui element
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui elements that are located above other elements
*/
vector<vector<Solution> > guiIsAbove(vector<vector<Solution> > v1, vector<vector<Solution> > v2)
{
	vector<vector<Solution> > solution;
	for (int it_v1 = 0 ; it_v1 < v1.size() ; it_v1++)
	{	
		vector<Solution> item_v1 = v1.at(it_v1);
		for (int it_v2 = 0 ; it_v2 < v2.size() ; it_v2++)
		{
			vector<Solution> item_v2 = v2.at(it_v2);
			bool met = true;
			for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
			{	
				if (!met) continue;

				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					if (!met) continue;

					Solution gui_1 = item_v1.at(it_sub_v1);
					Solution gui_2 = item_v2.at(it_sub_v2);

					if (gui_1.shape->getName() == gui_2.shape->getName())
					{
						met = false;
						continue;
					}
					int g1TopY, g2TopY;
					int g1BottomY, g2BottomY;

					g1TopY = gui_1.shape->getUpperY();
					g1BottomY = gui_1.shape->getBottomY();
				
					g2TopY = gui_2.shape->getUpperY();
					g2BottomY = gui_2.shape->getBottomY();	

					bool  condition1 = g1TopY > g2TopY;
					bool  condition2 = g1BottomY > g2BottomY;
					 
					met = condition1 && condition2;
				}
			}
			if (met)
			{
				vector<Solution> result;
				for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
				{	
					result.push_back(item_v1.at(it_sub_v1));
				}
				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					result.push_back(item_v2.at(it_sub_v2));
				}
				solution.push_back(result);
			}
		}
	}
	return solution;
}

/********************************************************************************************************/
/* "Below" function
/********************************************************************************************************/

/**
* Returns the set of solutions of all the Gui elements that are located below of other elements
*The condition is verified if the upper point of the first Gui element is below the upper point of the second Gui element 
*and the lower point of the first Gui element is below the lower point of the second Gui element
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui elements that are located below other elements
*/

vector<vector<Solution> > guiIsBelow(vector<vector<Solution> > v1, vector<vector<Solution> > v2)
{	
	vector<vector<Solution> > solution;
	for (int it_v1 = 0 ; it_v1 < v1.size() ; it_v1++)
	{	
		vector<Solution> item_v1 = v1.at(it_v1);
		for (int it_v2 = 0 ; it_v2 < v2.size() ; it_v2++)
		{
			vector<Solution> item_v2 = v2.at(it_v2);
			bool met = true;
			for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
			{	
				if (!met) continue;

				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					if (!met) continue;

					Solution gui_1 = item_v1.at(it_sub_v1);
					Solution gui_2 = item_v2.at(it_sub_v2);
					if (gui_1.shape->getName() == gui_2.shape->getName())
					{
						met = false;
						continue;
					}
					int g1TopY, g2TopY;
					int g1BottomY, g2BottomY;

					g1TopY = gui_1.shape->getUpperY();
					g1BottomY = gui_1.shape->getBottomY();
				
					g2TopY = gui_2.shape->getUpperY();
					g2BottomY = gui_2.shape->getBottomY();	

					bool  condition1 = g1TopY < g2TopY;
					bool  condition2 = g1BottomY < g2BottomY;
					 
					met = condition1 && condition2;
				}
			}
			if (met)
			{	
				vector<Solution> result;
				for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
				{	
					result.push_back(item_v1.at(it_sub_v1));
				}
				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					result.push_back(item_v2.at(it_sub_v2));
				}
				solution.push_back(result);
			}
		}
	}
	return solution;
}

/********************************************************************************************************/
/* "Smaller" function
/********************************************************************************************************/

/**
* Returns the set of solutions of all the Gui elements having a smaller area compared to other elements
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui elements having a smaller area compared to other elements
*/

vector<vector<Solution> > guiSmallerThan(vector<vector<Solution> > v1, vector<vector<Solution> > v2)
{	
	vector<vector<Solution> > solution;
	for (int it_v1 = 0 ; it_v1 < v1.size() ; it_v1++)
	{	
		vector<Solution> item_v1 = v1.at(it_v1);
		for (int it_v2 = 0 ; it_v2 < v2.size() ; it_v2++)
		{
			vector<Solution> item_v2 = v2.at(it_v2);
			bool met = true;
			for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
			{	
				if (!met) continue;

				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					if (!met) continue;

					Solution gui_1 = item_v1.at(it_sub_v1);
					Solution gui_2 = item_v2.at(it_sub_v2);
					if (gui_1.shape->getName() == gui_2.shape->getName())
					{
						met = false;
						continue;
					}
					int g1Area, g2Area;

					g1Area = gui_1.shape->getArea();
					g2Area = gui_2.shape->getArea();
				
					bool  condition1 = g1Area < g2Area;
					 
					met = condition1;
				}
			}
			if (met)
			{	
				vector<Solution> result;
				for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
				{	
					result.push_back(item_v1.at(it_sub_v1));
				}
				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					result.push_back(item_v2.at(it_sub_v2));
				}
				solution.push_back(result);
			}
		}
	}
	return solution;
}

/********************************************************************************************************/
/* Bigger function
/********************************************************************************************************/

/**
* Returns the set of solutions of all the Gui elements having a bigger area compared to other elements
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui elements having a bigger area compared to other elements
*/

vector<vector<Solution> > guiBiggerThan(vector<vector<Solution> > v1, vector<vector<Solution> > v2)
{	
	vector<vector<Solution> > solution;
	for (int it_v1 = 0 ; it_v1 < v1.size() ; it_v1++)
	{	
		vector<Solution> item_v1 = v1.at(it_v1);
		for (int it_v2 = 0 ; it_v2 < v2.size() ; it_v2++)
		{
			vector<Solution> item_v2 = v2.at(it_v2);
			bool met = true;
			for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
			{	
				if (!met) continue;

				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					if (!met) continue;

					Solution gui_1 = item_v1.at(it_sub_v1);
					Solution gui_2 = item_v2.at(it_sub_v2);
					if (gui_1.shape->getName() == gui_2.shape->getName())
					{
						met = false;
						continue;
					}
					int g1Area, g2Area;

					g1Area = gui_1.shape->getArea();
					g2Area = gui_2.shape->getArea();
				
					bool  condition1 = g1Area > g2Area;
					 
					met = condition1;
				}
			}
			if (met)
			{	
				vector<Solution> result;
				for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
				{	
					result.push_back(item_v1.at(it_sub_v1));
				}
				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					result.push_back(item_v2.at(it_sub_v2));
				}
				solution.push_back(result);
			}
		}
	}
	return solution;
}

/********************************************************************************************************/
/* Equal function
/********************************************************************************************************/

/**
* Returns the set of solutions of all the Gui elements having equal areas
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui elements having a equal areas
*/

vector<vector<Solution> > guiEqualTo(vector<vector<Solution> > v1, vector<vector<Solution> > v2)
{	
	vector<vector<Solution> > solution;
	for (int it_v1 = 0 ; it_v1 < v1.size() ; it_v1++)
	{	
		vector<Solution> item_v1 = v1.at(it_v1);
		for (int it_v2 = 0 ; it_v2 < v2.size() ; it_v2++)
		{
			vector<Solution> item_v2 = v2.at(it_v2);
			bool met = true;
			for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
			{	
				if (!met) continue;

				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					if (!met) continue;

					Solution gui_1 = item_v1.at(it_sub_v1);
					Solution gui_2 = item_v2.at(it_sub_v2);
					if (gui_1.shape->getName() == gui_2.shape->getName())
					{
						met = false;
						continue;
					}
					int g1Area, g2Area;

					g1Area = gui_1.shape->getArea();
					g2Area = gui_2.shape->getArea();
				
					bool  condition1 = g1Area == g2Area;
					 
					met = condition1;
				}
			}
			if (met)
			{	
				vector<Solution> result;
				for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
				{	
					result.push_back(item_v1.at(it_sub_v1));
				}
				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					result.push_back(item_v2.at(it_sub_v2));
				}
				solution.push_back(result);
			}
		}
	}
	return solution;
}

/********************************************************************************************************/
/* "Contains" function
/********************************************************************************************************/

/*
* Returns the set of solutions of all the Gui elements contained in other elements
* The condition verification depends on the Gui elements used and is as follows:
* Case 1: The elements are of type "Circle": 
*			The radius of the containing circle is bigger than the sum of the distance between the centers and the radius of the contained circle
* Case 2: The containing element is of type "Circle" and the contained elements are of type "Triangle" or "Box":
*		  	The distance between all the edges of the contained elements to the center of the circle is less than the radius of the containing circle
* Case 3: The containing element is of type "Box":
*			_The highest point of the contained element has a smaller Y coordinate than the the highest point of the containing element 
*			_The lowest point of the contained element has a larger Y coordinate than the the lowest point of the containing element 
*			_The most left point of the contained element has a larger X coordinate than the the most left point of the containing element 
*			_The most right point of the contained element has a smaller X coordinate than the the most right point of the containing element
* Case 4: The containing element is of type "Triangle": It is approximated to a "Box' and treated as such
*
*@param v1
* the set of solutions to be tested, placed on the left of the comparison operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the comparison operation
*
*@return
* A vector of solutions of all the Gui elements contained in other elements
*/

vector<vector<Solution> > guiIsContains(vector<vector<Solution> > v1, vector<vector<Solution> > v2)
{	
	vector<vector<Solution> > solution;
	for (int it_v1 = 0 ; it_v1 < v1.size() ; it_v1++)
	{	
		vector<Solution> item_v1 = v1.at(it_v1);
		for (int it_v2 = 0 ; it_v2 < v2.size() ; it_v2++)
		{
			vector<Solution> item_v2 = v2.at(it_v2);
			bool met = true;
			for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
			{	
				if (!met) continue;

				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					if (!met) continue;

					Solution gui_1 = item_v1.at(it_sub_v1);
					Solution gui_2 = item_v2.at(it_sub_v2);
					if (gui_1.shape->getName() == gui_2.shape->getName())
					{
						met = false;
						continue;
					}
					int g1Radius, g2Radius;
					Point g1Center, g2Center;
					int g1LeftX, g1RightX, g1TopY, g1BottomY;
					int g2LeftX, g2RightX, g2TopY, g2BottomY;
					Point* point;
					Point* points1;
					Point* points2[4];
					Segment*  s1[3];// Segment*  s1_2; Segment*  s1_3;
					Segment*  s2[4];//	Segment*  s2_2;	Segment*  s2_3; Segment*  s2_4; 
	
					if (gui_1.shape->getMode() == "Circle")
					{
						g1Radius = ((Circle*)(gui_1.shape))->getRadius();
						g1Center = ((Circle*)(gui_1.shape))->getCenter();
					}
					else if (gui_1.shape->getMode() == "Box" || gui_1.shape->getMode() == "Triangle")
					{
					//TODO: check if the first gui shape is a triangle and put it in its own method
						g1TopY = gui_1.shape->getUpperY();
						g1BottomY = gui_1.shape->getBottomY();
						g1LeftX = gui_1.shape->getLeftX();
						g1RightX = gui_1.shape->getRightX();
					}
					/*else if (gui_1.shape->getMode() == "Triangle")
					{
						points1 = gui_1.shape->getPoints();
						s1[0] = new Segment (points1[0], points1[1]);
						s1[1] = new Segment (points1[1], points1[2]);
						s1[2] = new Segment (points1[0], points1[2]);
					}*/

					g2TopY = gui_2.shape->getUpperY();
					g2BottomY = gui_2.shape->getBottomY();
					g2LeftX = gui_2.shape->getLeftX();
					g2RightX = gui_2.shape->getRightX();

					if (gui_2.shape->getMode() == "Circle")
					{
						g2Radius = ((Circle*)(gui_2.shape))->getRadius();
						g2Center = ((Circle*)(gui_2.shape))->getCenter();
					}
					else if (gui_2.shape->getMode() == "Box")
					{
						point = gui_2.shape->getPoints();
					}
					else if (gui_2.shape->getMode() == "Triangle")
					{
						point = gui_2.shape->getPoints();
					}

//begin comparing..
					if (gui_1.shape->getMode() == "Circle") 
					{	
						if (gui_2.shape->getMode() == "Circle")
						{	
							bool  condition1 = g1Radius > g2Radius;
							float distance   = g1Center.getDistanceTo(g2Center);
							bool  condition2 = g1Radius >= g2Radius + distance;
							 
							met =condition1 && condition2;
					
						}
						else if (gui_2.shape->getMode() == "Box")
						{
							bool condition1 = g1Center.getDistanceTo(point[0]) <= g1Radius;
							bool condition2 = g1Center.getDistanceTo(point[1]) <= g1Radius;
							bool condition3 = g1Center.getDistanceTo(point[2]) <= g1Radius;
							bool condition4 = g1Center.getDistanceTo(point[3]) <= g1Radius;
							met = condition1 && condition2 && condition3 && condition4;
							
						}
						else if (gui_2.shape->getMode() == "Triangle")
						{
							bool condition1 = g1Center.getDistanceTo(point[0]) <= g1Radius;
							bool condition2 = g1Center.getDistanceTo(point[1]) <= g1Radius;
							bool condition3 = g1Center.getDistanceTo(point[2]) <= g1Radius;
							met = condition1 && condition2 && condition3;
						}
					}
					else if (gui_1.shape->getMode() == "Box" || gui_1.shape->getMode() == "Triangle" ) 
					//TODO: check if the first gui shape is a triangle and put it in its own method
					{
						bool condition1 = g1TopY >= g2TopY;
						bool condition2 = g1BottomY <= g2BottomY;
						bool condition3 = g1LeftX <= g2LeftX;
						bool condition4 = g1RightX >= g2RightX;
		
						met = condition1 && condition2 && condition3 && condition4;
					}
					/*else if (gui_1.shape->getMode() == "Triangle") 
					{	
						points2[0] = new Point(g2LeftX, g2BottomY);
						points2[1] = new Point(g2RightX, g2BottomY);
						points2[2] = new Point(g2RightX, g2TopY);
						points2[3] = new Point(g2LeftX, g2TopY);

						s2[0] = new Segment (points1[0], points1[1]);
						s2[1] = new Segment (points1[1], points1[2]);
						s2[2] = new Segment (points1[2], points1[3]);	
						s2[3] = new Segment (points1[0], points1[3]);									
						
						Point* intersect;
						for (int i = 0; i < 3 ; i++)
						{
							if (met == false) 
								{break;}

							for (int j = 0; j < 4 ; j++)
							{
								intersect = NULL;
								intersect = Segment::getIntersection(*s1[i], *s2[j]);
								if (intersect != NULL)
								{
									met = false; 
									break;
								}
							}
						}
					
						Line* line[3];
						double ys[3];
						double ys2[2];
						int counter = 0;
						for (int i=0; i < 3 ; i++)
						{
							line[i] = new Line (s1[i]->getP1(), s1[i]->getP2());
							ys[i] = line[i]->getYFromX(g2LeftX);
							if (s1[i]->containsPoint(*(new Point (g2LeftX, ys[i]))))
							{
								ys2[counter] = ys[i];
								counter++;
							}
						}
						double minY, maxY;
						if (ys2[0] < ys2[1])
						{
							minY = ys2[0];
							maxY = ys2[1];
						}
						else
						{
							minY = ys2[1];
							maxY = ys2[2];
						}
						if ( !(g2BottomY < maxY && g2BottomY > minY))
						{
							met = false;
						}
					}*/
				}
			}
			if (met)
			{	
				vector<Solution> result;
				for (int it_sub_v1 = 0 ; it_sub_v1 < item_v1.size() ; it_sub_v1++)
				{	
					result.push_back(item_v1.at(it_sub_v1));
				}
				for (int it_sub_v2 = 0 ; it_sub_v2 < item_v2.size() ; it_sub_v2++)
				{
					result.push_back(item_v2.at(it_sub_v2));
				}
				solution.push_back(result);
			}
		}
	}
	return solution;
}

/********************************************************************************************************/
/* AND function
/********************************************************************************************************/

/**
* Returns the intersection of the set of solutions 
*
*@param v1
* the set of solutions to be tested, placed on the left of the AND operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the AND operation
*
*@return
* A vector of solutions verifying the intersection operation
*/

vector<vector<Solution> > guiAND(vector<vector<Solution> > v1, vector<vector<Solution> > v2)
{	

	/** combine v1 and v2
	*/
	vector<vector<Solution> > preSolution ;	
	for (int it1 = 0 ; it1 < v1.size() ; it1++)
	{	
		vector<Solution> temp;
		for (int it2 = 0 ; it2 < v2.size() ; it2++)
		{
			temp = v1.at(it1);
			vector<Solution> temp_v2 = v2.at(it2);
			for(int it3=0 ; it3< temp_v2.size(); it3++ )
			{
				temp.push_back(temp_v2.at(it3));
			}
			preSolution.push_back(temp);
		}
	}


	vector<vector<Solution> > solution;
	for (int i = 0 ; i < preSolution.size() ; i++)
	{	
	/** put in counter the size of the solution vector.
		*/
		int counter=0;
		for (int i1 = 0 ; i1 < preSolution.at(i).size() ; i1++)
		{
			bool met3 = true;
			for (int j1 = i1+1 ; j1 < preSolution.at(i).size() ; j1++)
			{
				bool condition1 = preSolution.at(i).at(i1).varName == preSolution.at(i).at(j1).varName ;
				if(condition1)
				{
					met3 = false;
				}
			}
			if (met3)
			{counter++;}
		}

		vector<Solution> temp;
		vector<Solution> item_i = preSolution.at(i);
		for (int j = 0 ; j < item_i.size() ; j++)
		{
			bool met = true;
			Solution item_i_j = item_i.at(j);
			for (int k = j+1 ; k < item_i.size() ; k++)
			{
				Solution item_i_k = item_i.at(k);
				bool condition1 = item_i_j.varName == item_i_k.varName ;
				bool condition2 = item_i_j.shape->getName() == item_i_k.shape->getName() ;								
				if(!((condition1 && condition2) || (!condition1 && !condition2)))
					{met = false;}
			}
			if(met)
			{
				bool met2 = true;
				for (int it = 0 ; it < temp.size() ; it++)
				{
					if(temp.at(it).varName == item_i_j.varName)
						{met2 = false;}
				}
				if (met2)
					{temp.push_back(item_i_j);}
			}
		}
		if (temp.size() == counter)
			{solution.push_back(temp);}
		temp.clear();
	}

	return solution;
}

/********************************************************************************************************/
/* OR function
/********************************************************************************************************/

/**
* Returns the union of the set of solutions 
*
*@param v1
* the set of solutions to be tested, placed on the left of the OR operation
*
*@param v2
* the set of solutions to be tested, placed on the right of the OR operation
*
*@return
* A vector of solutions verifying the union operation
*/

vector<vector<Solution> > guiOR(vector<vector<Solution> > v1, vector<vector<Solution> > v2)
{	
	vector<vector<Solution> > solution;
	for (int i = 0 ; i < v1.size() ; i++)
	{
		solution.push_back(v1.at(i));	
	}

	for (int i = 0 ; i < v2.size() ; i++)
	{
		solution.push_back(v2.at(i));	
	}

	return solution;
}
