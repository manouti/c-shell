/** \file guiPositionCompare.cpp
*   \brief The file containing the functions responsible of comparing the positions of the GUI shapes.
*     
*/

#include <guiPositionCompare.h>

/**
*/
int guiIsLeftOf(Node* g1, Node* g2)
{
	int g1LeftX, g2LeftX;
	int g1RightX, g2RightX;
	bool g1IsOP, g2IsOP;
// Gui_1
	if (g1->getType() == Node::VAR)
	{
		g1IsOP = false;

		AbstractGui* gui = g1->getGui();
		if (gui == NULL) {return 2;}

		g1LeftX = gui->getLeftX();
		g1RightX = gui->getRightX();
	}
	else
	{
		g1IsOP = true;
	}

	// Gui_2 
	if (g2->getType() == Node::VAR)
	{
		g2IsOP = false;

		AbstractGui* gui = g2->getGui();
		if (gui == NULL) {return 3;}

		g2LeftX = gui->getLeftX();
		g2RightX = gui->getRightX();
	}
	else
	{
		g2IsOP = true;
	}

	// comparing guiIsLeftOf(gui1 , gui2)
	// if both nodes are VAR
	if ((g1IsOP == false) && (g2IsOP == false))
	{
		bool  condition1 = g1LeftX < g2LeftX;
		bool  condition2 = g1RightX < g2RightX;
		 
		if (condition1 && condition2)
		{return 0;}
		else
		{return 1;}
	}
	// if the first node is VAR and the second one is operation
	else if ((g1IsOP == false) && (g2IsOP == true))
	{
		vector<Node*> children = g2->getChildren();
		int ret_value;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsLeftOf(g1, children.at(i));

			if (ret_value != 0)
			{return ret_value;}
		}
		return 0;
	}
	// if the first node is operation and the second one is VAR.
	else if ((g1IsOP == true) && (g2IsOP == false))
	{
		vector<Node*> children = g1->getChildren();
		int ret_value;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsLeftOf(children.at(i), g2);

			if (ret_value != 0)
			{return ret_value;}
		}
		return 0;
	}
	// if both nodes are operation.
	else
	{
		vector<Node*> children1 = g1->getChildren();
		vector<Node*> children2 = g2->getChildren();
		int ret_value;
		for (int i = 0; i < children1.size(); i++)
		{		
			for (int j = 0; j < children2.size(); j++)
			{
				ret_value = guiIsLeftOf(children1.at(i), children2.at(j));

				if (ret_value != 0)
				{return ret_value;}
			}
		}
		return 0;
	}
}

/**
*/
int guiIsRightOf(Node* g1, Node* g2)
{
	int g1LeftX, g2LeftX;
	int g1RightX, g2RightX;
	bool g1IsOP, g2IsOP;
	// Gui_1
	if (g1->getType() == Node::VAR)
	{
		g1IsOP = false;

		AbstractGui* gui = g1->getGui();
		if (gui == NULL) {return 2;}

		g1LeftX = gui->getLeftX();
		g1RightX = gui->getRightX();
	}
	else
	{
		g1IsOP = true;
	}

	// Gui_2
	if (g2->getType() == Node::VAR)
	{
		g2IsOP = false;

		AbstractGui* gui = g2->getGui();
		if (gui == NULL) {return 3;}

		g2LeftX = gui->getLeftX();
		g2RightX = gui->getRightX();
	}
	else
	{
		g2IsOP = true;
	}

	// comparing guiIsRightOf(gui1 , gui2)
	// if both nodes are VAR
	if ((g1IsOP == false) && (g2IsOP == false))
	{
		bool condition1 = g1LeftX > g2LeftX;
		bool condition2 = g1RightX > g2RightX;
		 
		if (condition1 && condition2)
			{return 0;}
		else
			{return 1;}
	}
	else if ((g1IsOP == false) && (g2IsOP == true))
	{
		vector<Node*> children = g2->getChildren();
		int ret_value;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsRightOf(g1, children.at(i));

			if (ret_value != 0)
			{return ret_value;}
		}

		return 0;
	}
	else if ((g1IsOP == true) && (g2IsOP == false))
	{
		vector<Node*> children = g1->getChildren();
		int ret_value;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsRightOf(children.at(i), g2);

			if (ret_value != 0)
			{return ret_value;}
		}

		return 0;
	}
	else
	{
		vector<Node*> children1 = g1->getChildren();
		vector<Node*> children2 = g2->getChildren();
		int ret_value ;
		for (int i = 0; i < children1.size(); i++)
		{		
			for (int j = 0; j < children2.size(); j++)
			{
				ret_value = guiIsRightOf(children1.at(i), children2.at(j));

				if (ret_value != 0)
				{return ret_value;}
			}
		}

		return 0;
	}
}

int guiIsAbove(Node* g1, Node* g2)
{
	int g1TopY, g2TopY;
	int g1BottomY, g2BottomY;
	bool g1IsOP, g2IsOP;
	if (g1->getType() == Node::VAR)
	{
		g1IsOP = false;

		AbstractGui* gui = g1->getGui();
		if (gui == NULL) {return 2;}
		
		g1TopY = gui->getUpperY();
		g1BottomY = gui->getBottomY();
		
	}
	else
	{
		g1IsOP = true;
	}


	if (g2->getType() == Node::VAR)
	{
		g2IsOP = false;

		AbstractGui* gui = g2->getGui();
		if (gui == NULL) {return 3;}

		g2TopY = gui->getUpperY();
		g2BottomY = gui->getBottomY();
	}
	else
	{
		g2IsOP = true;
	}

	if ((g1IsOP == false) && (g2IsOP == false))
	{
		bool condition1 = g1TopY > g2TopY;
		bool condition2 = g1BottomY > g2BottomY;
		 
		if (condition1 && condition2)
		{return 0;}
		else
		{return 1;}
	}
	else if ((g1IsOP == false) && (g2IsOP == true))
	{
		vector<Node*> children = g2->getChildren();
		int ret_value;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsAbove(g1, children.at(i));

			if (ret_value != 0)
			{return ret_value;}
		}

		return 0;
	}
	else if ((g1IsOP == true) && (g2IsOP == false))
	{
		vector<Node*> children = g1->getChildren();
		int ret_value = true;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsAbove(children.at(i), g2);

			if (ret_value != 0)
			{return ret_value;}
		}

		return 0;
	}
	else
	{
		vector<Node*> children1 = g1->getChildren();
		vector<Node*> children2 = g2->getChildren();
		int ret_value;
		for (int i = 0; i < children1.size(); i++)
		{		
			for (int j = 0; j < children2.size(); j++)
			{
				ret_value = guiIsAbove(children1.at(i), children2.at(j));

				if (ret_value != 0)
				{return ret_value;}
			}
		}

		return 0;
	}
}

int guiIsBelow(Node* g1, Node* g2)
{
	int g1TopY, g2TopY;
	int g1BottomY, g2BottomY;
	bool g1IsOP, g2IsOP;

	if (g1->getType() == Node::VAR)
	{
		g1IsOP = false;

		AbstractGui* gui = g1->getGui();
		if (gui == NULL) {return 2;}

		g1TopY = gui->getUpperY();
		g1BottomY = gui->getBottomY();		
	}
	else
	{
		g1IsOP = true;
	}

	if (g2->getType() == Node::VAR)
	{
		g2IsOP = false;

		AbstractGui* gui = g2->getGui();
		if (gui == NULL) {return 3;}

		g2TopY = gui->getUpperY();
		g2BottomY = gui->getBottomY();

	}
	else
	{
		g2IsOP = true;
	}

	if ((g1IsOP == false) && (g2IsOP == false))
	{
		bool condition1 = g1TopY < g2TopY;
		bool condition2 = g1BottomY < g2BottomY;
		 
		if (condition1 && condition2)
		{return 0;}
		else
		{return 1;}
	}
	else if ((g1IsOP == false) && (g2IsOP == true))
	{
		vector<Node*> children = g2->getChildren();
		int ret_value;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsBelow(g1, children.at(i));

			if (ret_value != 0)
			{return ret_value;}
		}

		return 0;
	}
	else if ((g1IsOP == true) && (g2IsOP == false))
	{
		vector<Node*> children = g1->getChildren();
		int ret_value;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsBelow(children.at(i), g2);

			if (ret_value != 0)
			{return ret_value;}
		}

		return 0;
	}
	else
	{
		vector<Node*> children1 = g1->getChildren();
		vector<Node*> children2 = g2->getChildren();
		int ret_value;
		for (int i = 0; i < children1.size(); i++)
		{		
			for (int j = 0; j < children2.size(); j++)
			{
				ret_value = guiIsBelow(children1.at(i), children2.at(j));

				if (ret_value != 0)
				{return ret_value;}
			}
		}

		return 0;
	}
}

int guiIsContains(Node* g1, Node* g2)
{
	int g1Radius, g2Radius;
	Point g1Center, g2Center;
	bool g1IsOP, g2IsOP;
	int g1LeftX, g1RightX, g1TopY, g1BottomY;
	int g2LeftX, g2RightX, g2TopY, g2BottomY;

	Point* point;

	if (g1->getType() == Node::VAR)
	{
		g1IsOP = false;

		AbstractGui* gui = g1->getGui();
		if (gui == NULL) {return 2;}
		
		if (g1->getGuiShape() == "Circle")
		{
			g1Radius = ((Circle*)(gui))->getRadius();
			g1Center = ((Circle*)(gui))->getCenter();
		}
		else if (g1->getGuiShape() == "Box")
		{
			g1TopY = gui->getUpperY();
			g1BottomY = gui->getBottomY();
			g1LeftX = gui->getLeftX();
			g1RightX = gui->getRightX();
		}
		else if (g1->getGuiShape() == "Triangle")
		{
		}
	}
	else
	{
		g1IsOP = true;
	}

	if (g2->getType() == Node::VAR)
	{
		g2IsOP = false;

		AbstractGui* gui = g2->getGui();
		if (gui == NULL) {return 2;}

		g2TopY = gui->getUpperY();
		g2BottomY = gui->getBottomY();
		g2LeftX = gui->getLeftX();
		g2RightX = gui->getRightX();

		if (g2->getGuiShape() == "Circle")
		{
			g2Radius = ((Circle*)(gui))->getRadius();
			g2Center = ((Circle*)(gui))->getCenter();
		}
		else if (g2->getGuiShape() == "Box")
		{
			point = ((Box*)(gui))->getBLCorner();
		}
		else if (g2->getGuiShape() == "Triangle")
		{
			point = ((Triangle*)(gui))->getPoint_A();
		}
	}
	else
	{
		g2IsOP = true;
	}


	if ((g1IsOP == false) && (g2IsOP == false))
	{
		if (g1->getGuiShape() == "Circle") 
		{	
			if (g2->getGuiShape() == "Circle")
			{	
				bool  condition1 = g1Radius > g2Radius;
				float distance   = GuoliceUtil::getDistance (g1Center, g2Center);
				bool  condition2 = g1Radius >= g2Radius + distance;
				 
				if (condition1 && condition2)
				{return 0;}
				else
				{return 1;}
			}
			else if (g2->getGuiShape() == "Box")
			{
				bool condition1 = GuoliceUtil::getDistance (g1Center, point[0]) <= g1Radius;
				bool condition2 = GuoliceUtil::getDistance (g1Center, point[1]) <= g1Radius;
				bool condition3 = GuoliceUtil::getDistance (g1Center, point[2]) <= g1Radius;
				bool condition4 = GuoliceUtil::getDistance (g1Center, point[3]) <= g1Radius;
				if (condition1 && condition2 && condition3 && condition4)
				{return 0;}
				else
				{return 1;}
			}
			else if (g2->getGuiShape() == "Triangle")
			{
				bool condition1 = GuoliceUtil::getDistance (g1Center, point[0]) <= g1Radius;
				bool condition2 = GuoliceUtil::getDistance (g1Center, point[1]) <= g1Radius;
				bool condition3 = GuoliceUtil::getDistance (g1Center, point[2]) <= g1Radius;
				if (condition1 && condition2 && condition3)
				{return 0;}
				else
				{return 1;}
			}
		}
		else if (g1->getGuiShape() == "Box") 
		{
			bool condition1 = g1TopY >= g2TopY;
			bool condition2 = g1BottomY <= g2BottomY;
			bool condition3 = g1LeftX <= g2LeftX;
			bool condition4 = g1RightX >= g2RightX;
		
			if (condition1 && condition2 && condition3 && condition4)
			{return 0;}
			else
			{return 1;}
		}		
	}
/*	else if ((g1IsOP == false) && (g2IsOP == true))
	{
		vector<Node*> children = g2->getChildren();
		int ret_value;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsRightOf(g1, children.at(i));

			if (ret_value != 0)
			{
				return ret_value;
			}
		}

		return 0;
	}
	else if ((g1IsOP == true) && (g2IsOP == false))
	{
		vector<Node*> children = g1->getChildren();
		int ret_value;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsRightOf(children.at(i), g2);

			if (ret_value != 0)
			{
				return ret_value;
			}
		}

		return 0;
	}
	else
	{
		vector<Node*> children1 = g1->getChildren();
		vector<Node*> children2 = g2->getChildren();
		int ret_value ;
		for (int i = 0; i < children1.size(); i++)
		{		
			for (int j = 0; j < children2.size(); j++)
			{
				ret_value = guiIsRightOf(children1.at(i), children2.at(j));

				if (ret_value != 0)
				{
					return ret_value;
				}
			}
		}

		return 0;
	}*/

return 0;
}
