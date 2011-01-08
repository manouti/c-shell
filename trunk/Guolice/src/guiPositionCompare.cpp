
#include <guiPositionCompare.h>

int guiIsLeftOf(Node* g1, Node* g2)
{
	int g1LeftX;
	int g1RightX;
	bool g1IsOP;
	if (g1->getType() == Node::VAR)
	{
		g1IsOP = false;

		Metadata* metadata = g1->getMetadata();
		if (metadata == NULL) 
		{
			return 2;
		}
		if (g1->getMode() == "Circle")
		{
			g1LeftX = ((CircleMetadata*)(metadata))->getCenterX() - ((CircleMetadata*)(metadata))->getRadius();
			g1RightX = ((CircleMetadata*)(metadata))->getCenterX() + ((CircleMetadata*)(metadata))->getRadius();
		}
		else if (g1->getMode() == "Box")
		{
			g1LeftX = ((BoxMetadata*)(metadata))->getLBCornerX();
			g1RightX = ((BoxMetadata*)(metadata))->getLBCornerX() + ((BoxMetadata*)(metadata))->getLength();
		}
		else if (g1->getMode() == "Triangle")
		{
			g1LeftX = ((TriangleMetadata*)(metadata))->getPointX1();
			if (((TriangleMetadata*)(metadata))->getPointX2() < g1LeftX)
			{
				g1LeftX = ((TriangleMetadata*)(metadata))->getPointX2();
			}
			if (((TriangleMetadata*)(metadata))->getPointX3() < g1LeftX)
			{
				g1LeftX = ((TriangleMetadata*)(metadata))->getPointX3();
			}

			g1RightX = ((TriangleMetadata*)(metadata))->getPointX1();
			if (((TriangleMetadata*)(metadata))->getPointX2() > g1LeftX)
			{
				g1RightX = ((TriangleMetadata*)(metadata))->getPointX2();
			}
			if (((TriangleMetadata*)(metadata))->getPointX3() > g1LeftX)
			{
				g1RightX = ((TriangleMetadata*)(metadata))->getPointX3();
			}
		}
	}
	else
	{
		g1IsOP = true;
	}


	int g2LeftX;
	int g2RightX;
	bool g2IsOP;
	if (g2->getType() == Node::VAR)
	{
		g2IsOP = false;

		Metadata* metadata = g2->getMetadata();
		if (metadata == NULL) 
		{
			return 3;
		}
		if (g2->getMode() == "Circle")
		{
			g2LeftX = ((CircleMetadata*)(metadata))->getCenterX() - ((CircleMetadata*)(metadata))->getRadius();
			g2RightX = ((CircleMetadata*)(metadata))->getCenterX() + ((CircleMetadata*)(metadata))->getRadius();
		}
		else if (g2->getMode() == "Box")
		{
			g2LeftX = ((BoxMetadata*)(metadata))->getLBCornerX();
			g2RightX = ((BoxMetadata*)(metadata))->getLBCornerX() + ((BoxMetadata*)(metadata))->getLength();
		}
		else if (g2->getMode() == "Triangle")
		{
			g2LeftX = ((TriangleMetadata*)(metadata))->getPointX1();
			if (((TriangleMetadata*)(metadata))->getPointX2() < g2LeftX)
			{
				g2LeftX = ((TriangleMetadata*)(metadata))->getPointX2();
			}
			if (((TriangleMetadata*)(metadata))->getPointX3() < g2LeftX)
			{
				g2LeftX = ((TriangleMetadata*)(metadata))->getPointX3();
			}

			g2RightX = ((TriangleMetadata*)(metadata))->getPointX1();
			if (((TriangleMetadata*)(metadata))->getPointX2() > g2LeftX)
			{
				g2RightX = ((TriangleMetadata*)(metadata))->getPointX2();
			}
			if (((TriangleMetadata*)(metadata))->getPointX3() > g2LeftX)
			{
				g2RightX = ((TriangleMetadata*)(metadata))->getPointX3();
			}
		}
	}
	else
	{
		g2IsOP = true;
	}

	if ((g1IsOP == false) && (g2IsOP == false))
	{
		if ((g1LeftX < g2LeftX) && (g1RightX < g2RightX))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	else if ((g1IsOP == false) && (g2IsOP == true))
	{
		vector<Node*> children = g2->getChildren();
		int ret_value;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsLeftOf(g1, children.at(i));

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
			ret_value = guiIsLeftOf(children.at(i), g2);

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
		int ret_value;
		for (int i = 0; i < children1.size(); i++)
		{		
			for (int j = 0; j < children2.size(); j++)
			{
				ret_value = guiIsLeftOf(children1.at(i), children2.at(j));

				if (ret_value != 0)
				{
					return ret_value;
				}
			}
		}

		return 0;
	}
}

int guiIsRightOf(Node* g1, Node* g2)
{
	int g1LeftX;
	int g1RightX;
	bool g1IsOP;
	if (g1->getType() == Node::VAR)
	{
		g1IsOP = false;

		Metadata* metadata = g1->getMetadata();
		if (metadata == NULL) 
		{
			return 2;
		}
		if (g1->getMode() == "Circle")
		{
			g1LeftX = ((CircleMetadata*)(metadata))->getCenterX() - ((CircleMetadata*)(metadata))->getRadius();
			g1RightX = ((CircleMetadata*)(metadata))->getCenterX() + ((CircleMetadata*)(metadata))->getRadius();
		}
		else if (g1->getMode() == "Box")
		{
			g1LeftX = ((BoxMetadata*)(metadata))->getLBCornerX();
			g1RightX = ((BoxMetadata*)(metadata))->getLBCornerX() + ((BoxMetadata*)(metadata))->getLength();
		}
		else if (g1->getMode() == "Triangle")
		{
			g1LeftX = ((TriangleMetadata*)(metadata))->getPointX1();
			if (((TriangleMetadata*)(metadata))->getPointX2() < g1LeftX)
			{
				g1LeftX = ((TriangleMetadata*)(metadata))->getPointX2();
			}
			if (((TriangleMetadata*)(metadata))->getPointX3() < g1LeftX)
			{
				g1LeftX = ((TriangleMetadata*)(metadata))->getPointX3();
			}

			g1RightX = ((TriangleMetadata*)(metadata))->getPointX1();
			if (((TriangleMetadata*)(metadata))->getPointX2() > g1LeftX)
			{
				g1RightX = ((TriangleMetadata*)(metadata))->getPointX2();
			}
			if (((TriangleMetadata*)(metadata))->getPointX3() > g1LeftX)
			{
				g1RightX = ((TriangleMetadata*)(metadata))->getPointX3();
			}
		}
	}
	else
	{
		g1IsOP = true;
	}


	int g2LeftX;
	int g2RightX;
	bool g2IsOP;
	if (g2->getType() == Node::VAR)
	{
		g2IsOP = false;

		Metadata* metadata = g2->getMetadata();
		if (metadata == NULL) 
		{
			return 3;
		}
		if (g2->getMode() == "Circle")
		{
			g2LeftX = ((CircleMetadata*)(metadata))->getCenterX() - ((CircleMetadata*)(metadata))->getRadius();
			g2RightX = ((CircleMetadata*)(metadata))->getCenterX() + ((CircleMetadata*)(metadata))->getRadius();
		}
		else if (g2->getMode() == "Box")
		{
			g2LeftX = ((BoxMetadata*)(metadata))->getLBCornerX();
			g2RightX = ((BoxMetadata*)(metadata))->getLBCornerX() + ((BoxMetadata*)(metadata))->getLength();
		}
		else if (g2->getMode() == "Triangle")
		{
			g2LeftX = ((TriangleMetadata*)(metadata))->getPointX1();
			if (((TriangleMetadata*)(metadata))->getPointX2() < g2LeftX)
			{
				g2LeftX = ((TriangleMetadata*)(metadata))->getPointX2();
			}
			if (((TriangleMetadata*)(metadata))->getPointX3() < g2LeftX)
			{
				g2LeftX = ((TriangleMetadata*)(metadata))->getPointX3();
			}

			g2RightX = ((TriangleMetadata*)(metadata))->getPointX1();
			if (((TriangleMetadata*)(metadata))->getPointX2() > g2LeftX)
			{
				g2RightX = ((TriangleMetadata*)(metadata))->getPointX2();
			}
			if (((TriangleMetadata*)(metadata))->getPointX3() > g2LeftX)
			{
				g2RightX = ((TriangleMetadata*)(metadata))->getPointX3();
			}
		}
	}
	else
	{
		g2IsOP = true;
	}

	if ((g1IsOP == false) && (g2IsOP == false))
	{
		if ((g1LeftX > g2LeftX) && (g1RightX > g2RightX))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	else if ((g1IsOP == false) && (g2IsOP == true))
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
	}
}

int guiIsAbove(Node* g1, Node* g2)
{
	int g1TopY;
	int g1BottomY;
	bool g1IsOP;
	if (g1->getType() == Node::VAR)
	{
		g1IsOP = false;

		Metadata* metadata = g1->getMetadata();
		if (metadata == NULL) 
		{
			return 2;
		}
		if (g1->getMode() == "Circle")
		{
			g1TopY = ((CircleMetadata*)(metadata))->getCenterY() - ((CircleMetadata*)(metadata))->getRadius();
			g1BottomY = ((CircleMetadata*)(metadata))->getCenterY() + ((CircleMetadata*)(metadata))->getRadius();
		}
		else if (g1->getMode() == "Box")
		{
			g1TopY = ((BoxMetadata*)(metadata))->getLBCornerY();
			g1BottomY = ((BoxMetadata*)(metadata))->getLBCornerY() + ((BoxMetadata*)(metadata))->getWidth();
		}
		else if (g1->getMode() == "Triangle")
		{
			g1TopY = ((TriangleMetadata*)(metadata))->getPointY1();
			if (((TriangleMetadata*)(metadata))->getPointY2() < g1TopY)
			{
				g1TopY = ((TriangleMetadata*)(metadata))->getPointY2();
			}
			if (((TriangleMetadata*)(metadata))->getPointY3() < g1TopY)
			{
				g1TopY = ((TriangleMetadata*)(metadata))->getPointY3();
			}

			g1BottomY = ((TriangleMetadata*)(metadata))->getPointY1();
			if (((TriangleMetadata*)(metadata))->getPointY2() > g1TopY)
			{
				g1BottomY = ((TriangleMetadata*)(metadata))->getPointY2();
			}
			if (((TriangleMetadata*)(metadata))->getPointY3() > g1TopY)
			{
				g1BottomY = ((TriangleMetadata*)(metadata))->getPointY3();
			}
		}
	}
	else
	{
		g1IsOP = true;
	}


	int g2TopY;
	int g2BottomY;
	bool g2IsOP;
	if (g2->getType() == Node::VAR)
	{
		g2IsOP = false;

		Metadata* metadata = g2->getMetadata();
		if (metadata == NULL) 
		{
			return 3;
		}
		if (g2->getMode() == "Circle")
		{
			g2TopY = ((CircleMetadata*)(metadata))->getCenterY() - ((CircleMetadata*)(metadata))->getRadius();
			g2BottomY = ((CircleMetadata*)(metadata))->getCenterY() + ((CircleMetadata*)(metadata))->getRadius();
		}
		else if (g2->getMode() == "Box")
		{
			g2TopY = ((BoxMetadata*)(metadata))->getLBCornerY();
			g2BottomY = ((BoxMetadata*)(metadata))->getLBCornerY() + ((BoxMetadata*)(metadata))->getWidth();
		}
		else if (g2->getMode() == "Triangle")
		{
			g2TopY = ((TriangleMetadata*)(metadata))->getPointY1();
			if (((TriangleMetadata*)(metadata))->getPointY2() < g2TopY)
			{
				g2TopY = ((TriangleMetadata*)(metadata))->getPointY2();
			}
			if (((TriangleMetadata*)(metadata))->getPointY3() < g2TopY)
			{
				g2TopY = ((TriangleMetadata*)(metadata))->getPointY3();
			}

			g2BottomY = ((TriangleMetadata*)(metadata))->getPointY1();
			if (((TriangleMetadata*)(metadata))->getPointY2() > g2TopY)
			{
				g2BottomY = ((TriangleMetadata*)(metadata))->getPointY2();
			}
			if (((TriangleMetadata*)(metadata))->getPointY3() > g2TopY)
			{
				g2BottomY = ((TriangleMetadata*)(metadata))->getPointY3();
			}
		}
	}
	else
	{
		g2IsOP = true;
	}

	if ((g1IsOP == false) && (g2IsOP == false))
	{
		if ((g1TopY > g2TopY) && (g1BottomY > g2BottomY))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	else if ((g1IsOP == false) && (g2IsOP == true))
	{
		vector<Node*> children = g2->getChildren();
		int ret_value;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsAbove(g1, children.at(i));

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
		int ret_value = true;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsAbove(children.at(i), g2);

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
		int ret_value;
		for (int i = 0; i < children1.size(); i++)
		{		
			for (int j = 0; j < children2.size(); j++)
			{
				ret_value = guiIsAbove(children1.at(i), children2.at(j));

				if (ret_value != 0)
				{
					return ret_value;
				}
			}
		}

		return 0;
	}
}

int guiIsBelow(Node* g1, Node* g2)
{
	int g1TopY;
	int g1BottomY;
	bool g1IsOP;
	if (g1->getType() == Node::VAR)
	{
		g1IsOP = false;

		Metadata* metadata = g1->getMetadata();
		if (metadata == NULL) 
		{
			return 2;
		}
		if (g1->getMode() == "Circle")
		{
			g1TopY = ((CircleMetadata*)(metadata))->getCenterY() - ((CircleMetadata*)(metadata))->getRadius();
			g1BottomY = ((CircleMetadata*)(metadata))->getCenterY() + ((CircleMetadata*)(metadata))->getRadius();
		}
		else if (g1->getMode() == "Box")
		{
			g1TopY = ((BoxMetadata*)(metadata))->getLBCornerY();
			g1BottomY = ((BoxMetadata*)(metadata))->getLBCornerY() + ((BoxMetadata*)(metadata))->getWidth();
		}
		else if (g1->getMode() == "Triangle")
		{
			g1TopY = ((TriangleMetadata*)(metadata))->getPointY1();
			if (((TriangleMetadata*)(metadata))->getPointY2() < g1TopY)
			{
				g1TopY = ((TriangleMetadata*)(metadata))->getPointY2();
			}
			if (((TriangleMetadata*)(metadata))->getPointY3() < g1TopY)
			{
				g1TopY = ((TriangleMetadata*)(metadata))->getPointY3();
			}

			g1BottomY = ((TriangleMetadata*)(metadata))->getPointY1();
			if (((TriangleMetadata*)(metadata))->getPointY2() > g1TopY)
			{
				g1BottomY = ((TriangleMetadata*)(metadata))->getPointY2();
			}
			if (((TriangleMetadata*)(metadata))->getPointY3() > g1TopY)
			{
				g1BottomY = ((TriangleMetadata*)(metadata))->getPointY3();
			}
		}
	}
	else
	{
		g1IsOP = true;
	}


	int g2TopY;
	int g2BottomY;
	bool g2IsOP;
	if (g2->getType() == Node::VAR)
	{
		g2IsOP = false;

		Metadata* metadata = g2->getMetadata();
		if (metadata == NULL) 
		{
			return 3;
		}
		if (g2->getMode() == "Circle")
		{
			g2TopY = ((CircleMetadata*)(metadata))->getCenterY() - ((CircleMetadata*)(metadata))->getRadius();
			g2BottomY = ((CircleMetadata*)(metadata))->getCenterY() + ((CircleMetadata*)(metadata))->getRadius();
		}
		else if (g2->getMode() == "Box")
		{
			g2TopY = ((BoxMetadata*)(metadata))->getLBCornerY();
			g2BottomY = ((BoxMetadata*)(metadata))->getLBCornerY() + ((BoxMetadata*)(metadata))->getWidth();
		}
		else if (g2->getMode() == "Triangle")
		{
			g2TopY = ((TriangleMetadata*)(metadata))->getPointY1();
			if (((TriangleMetadata*)(metadata))->getPointY2() < g2TopY)
			{
				g2TopY = ((TriangleMetadata*)(metadata))->getPointY2();
			}
			if (((TriangleMetadata*)(metadata))->getPointY3() < g2TopY)
			{
				g2TopY = ((TriangleMetadata*)(metadata))->getPointY3();
			}

			g2BottomY = ((TriangleMetadata*)(metadata))->getPointY1();
			if (((TriangleMetadata*)(metadata))->getPointY2() > g2TopY)
			{
				g2BottomY = ((TriangleMetadata*)(metadata))->getPointY2();
			}
			if (((TriangleMetadata*)(metadata))->getPointY3() > g2TopY)
			{
				g2BottomY = ((TriangleMetadata*)(metadata))->getPointY3();
			}
		}
	}
	else
	{
		g2IsOP = true;
	}

	if ((g1IsOP == false) && (g2IsOP == false))
	{
		if ((g1TopY < g2TopY) && (g1BottomY < g2BottomY))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	else if ((g1IsOP == false) && (g2IsOP == true))
	{
		vector<Node*> children = g2->getChildren();
		int ret_value;
		for (int i = 0; i < children.size(); i++)
		{
			ret_value = guiIsBelow(g1, children.at(i));

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
			ret_value = guiIsBelow(children.at(i), g2);

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
		int ret_value;
		for (int i = 0; i < children1.size(); i++)
		{		
			for (int j = 0; j < children2.size(); j++)
			{
				ret_value = guiIsBelow(children1.at(i), children2.at(j));

				if (ret_value != 0)
				{
					return ret_value;
				}
			}
		}

		return 0;
	}
}

int guiIsContains(Node* g1, Node* g2)
{
	return 0;
}
