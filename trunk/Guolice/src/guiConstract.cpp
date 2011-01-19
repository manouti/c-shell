#include <guiConstract.h>

#ifndef capturedData
#define capturedData atoi(str_metadata.substr(position1,position2).data())

AbstractGui* guiConstract::guiCircleConstract(char* metadata_file, string NodeValue)
{
	string str_metadata = readMetadata(metadata_file, NodeValue);
	if (str_metadata == "")
	{
		return NULL;
	}

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
	Circle* circle = new Circle(*center, radius);
	return circle;
}

AbstractGui* guiConstract::guiBoxConstract(char* metadata_file, string NodeValue)
{
	string str_metadata = readMetadata(metadata_file, NodeValue);
	if (str_metadata == "")
	{
		return NULL;
	}

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
	Box* box = new Box(*lb_corner, width, height);
	return box;
}

AbstractGui* guiConstract::guiTriangleConstract(char* metadata_file, string NodeValue)
{
	string str_metadata = readMetadata(metadata_file, NodeValue);
	if (str_metadata == "")
	{
		return NULL;
	}

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

	
	Triangle* triangle = new Triangle(*point_1, *point_2, *point_3);
	return triangle;
}






string guiConstract::readMetadata(char* metadata_file, string NodeValue)
{
	ifstream metadata_stream ((char*)metadata_file, ios::in);
	if (metadata_stream == NULL)
	{
		return "";
	}

	char line[1000];
	metadata_stream.getline(line, 1000);
	while (!metadata_stream.eof())
	{
		string value = getNodeValue(line);
		if (value == NodeValue)
		{
			metadata_stream.close();
			return getMetadata(line);
		}

		metadata_stream.getline(line, 1000);
	}

	return "";
}

string guiConstract::getNodeValue(char* text)
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

string guiConstract::getMetadata(char* text)
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
