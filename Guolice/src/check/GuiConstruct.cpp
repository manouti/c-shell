/**\file guiConstruct.cpp
*/
#include <GuiConstruct.h>


#ifndef capturedData
#define capturedData atoi(str_metadata.substr(position1,position2).data())

/**
* Constructs the Circle element using metadata provided by the user
*
*@param metadata_file
* the path of the file that contains the metadata of the element
*
*@param NodeValue
* the identifier of the element
*
*@return
* A vector containing all the circles listed in the metadata file 
*/

vector<AbstractGui*> guiConstruct::guiCircleConstruct(char* metadata_file, string NodeValue)
{
	vector<AbstractGui*> circles;
	int index = 1; //for naming the elements

	ifstream metadata_stream ((char*)metadata_file, ios::in);
	if (metadata_stream == NULL)
	{
		return circles;
	}
	
	char line[1000];
	metadata_stream.getline(line, 1000);
	
	while (!metadata_stream.eof())
	{
		string value = getNodeValue(line);
		if (value == NodeValue)
		{
			string str_metadata = getMetadata(line);

			int center_x;
			int center_y;
			int radius;

			int position1 = 0;
			int position2 = str_metadata.find(",");
			center_x = capturedData;

			position1 = position2 + 1;
			position2 = str_metadata.find(",", position1);
			center_y = capturedData;

			position1 = position2 + 1;
			radius = atoi(str_metadata.substr(position2 + 1).data());

			Point* center = new Point(center_x , center_y);
			Circle* circle = new Circle(*center, radius, index++);
			circles.push_back(circle);
		}
		memset(line,0,1000);
		metadata_stream.getline(line, 1000);
	}
	metadata_stream.close();

	return circles;
}

/**
* Constructs the Box element using metadata provided by the user
*
*@param metadata_file
* the path of the file that contains the metadata of the element
*
*@param NodeValue
* the identifier of the element
*
*@return
* A vector containing all the boxes listed in the metadata file 
*/

vector<AbstractGui*> guiConstruct::guiBoxConstruct(char* metadata_file, string NodeValue)
{
	vector<AbstractGui*> boxes;
	int index = 1; //for naming the elements

	ifstream metadata_stream ((char*)metadata_file, ios::in);
	if (metadata_stream == NULL)
	{
		return boxes;
	}

	char line[1000];
	metadata_stream.getline(line, 1000);
	
	while (!metadata_stream.eof())
	{
		string value = getNodeValue(line);
		if (value == NodeValue)
		{
			string str_metadata = getMetadata(line);

			int lb_corner_x;
			int lb_corner_y;
			int width;
			int height;

			int position1 = 0;
			int position2 = str_metadata.find(",");
			lb_corner_x = capturedData;

			position1 = position2 + 1;
			position2 = str_metadata.find(",", position1);
			lb_corner_y = capturedData;

			position1 = position2 + 1;
			position2 = str_metadata.find(",", position1);
			width = capturedData;

			position1 = position2 + 1;
			height = atoi(str_metadata.substr(position2 + 1).data());

	
			Point* lb_corner = new Point(lb_corner_x , lb_corner_y);
			Box* box = new Box(*lb_corner, width, height, index++);
			boxes.push_back(box);
		}
		memset(line,0,1000);
		metadata_stream.getline(line, 1000);
	}
	metadata_stream.close();

	return boxes;
}

/**
* Constructs the Triangle element using metadata provided by the user
*
*@param metadata_file
* the path of the file that contains the metadata of the element
*
*@param NodeValue
* the identifier of the element
*
*@return
* A vector containing all the triangles listed in the metadata file 
*/

vector<AbstractGui*> guiConstruct::guiTriangleConstruct(char* metadata_file, string NodeValue)
{
	vector<AbstractGui*> triangles;
	int index = 1; //for naming the elements

	ifstream metadata_stream ((char*)metadata_file, ios::in);
	if (metadata_stream == NULL)
	{
		return triangles;
	}

	char line[1000];
	metadata_stream.getline(line, 1000);
	
	while (!metadata_stream.eof())
	{
		string value = getNodeValue(line);
		if (value == NodeValue)
		{
			string str_metadata = getMetadata(line);


			int x1, y1;
			int x2, y2;
			int x3, y3;

			int position1 = 0;
			int position2 = str_metadata.find(",");
			x1 = capturedData;

			position1 = position2 + 1;
			position2 = str_metadata.find(",", position1);
			y1 = capturedData;

			position1 = position2 + 1;
			position2 = str_metadata.find(",", position1);
			x2 = capturedData;

			position1 = position2 + 1;
			position2 = str_metadata.find(",", position1);
			y2 = capturedData;

			position1 = position2 + 1;
			position2 = str_metadata.find(",", position1);
			x3 = capturedData;

			position1 = position2 + 1;
			y3 = atoi(str_metadata.substr(position2 + 1).data());

			Point* point_1 = new Point(x1, y1);
			Point* point_2 = new Point(x2, y2);
			Point* point_3 = new Point(x3, y3);

	
			Triangle* triangle = new Triangle(*point_1, *point_2, *point_3, index++);
			triangles.push_back(triangle);
		}
		memset(line,0,1000);
		metadata_stream.getline(line, 1000);
	}
	metadata_stream.close();

	return triangles;
}



string guiConstruct::getNodeValue(char* text)
{
	string str_text(text);
	int position = str_text.find(":");
	if (position != -1)
	{
		str_text.erase(position);
	}
	position = str_text.find(" ");
	while (position != -1)
	{
		str_text.erase(position, 1);
		position = str_text.find(" ", position);
	}
	return str_text;
}

string guiConstruct::getMetadata(char* text)
{
	string str_text(text);
	int position = str_text.find(":");
	if (position != -1)
	{
		str_text = str_text.substr(position + 1);
	}
	position = str_text.find(" ");
	while (position != -1)
	{
		str_text.erase(position, 1);
		position = str_text.find(" ", position);
	}
	return str_text;
}

#endif //capturedData
