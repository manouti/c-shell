
#include <guiReadMetadata.h>

Metadata* ReadMetadata::guiReadCircle(char* metadata_file, string NodeValue)
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
	center_x = atoi(str_metadata.substr(position1, position2).data());

	position1 = position2 + 1;
	position2 = str_metadata.find(",", position1);
	center_y = atoi(str_metadata.substr(position1, position2).data());

	position1 = position2 + 1;
	radius = atoi(str_metadata.substr(position2 + 1).data());

	CircleMetadata* metadata = new CircleMetadata(center_x, center_y, radius);
	return metadata;
}

Metadata* ReadMetadata::guiReadBox(char* metadata_file, string NodeValue)
{
	string str_metadata = readMetadata(metadata_file, NodeValue);
	if (str_metadata == "")
	{
		return NULL;
	}

	int lb_corner_x;
	int lb_corner_y;
	int length;
	int width;

	int position1 = 0;
	int position2 = str_metadata.find(",");
	lb_corner_x = atoi(str_metadata.substr(position1, position2).data());

	position1 = position2 + 1;
	position2 = str_metadata.find(",", position1);
	lb_corner_y = atoi(str_metadata.substr(position1, position2).data());

	position1 = position2 + 1;
	position2 = str_metadata.find(",", position1);
	length = atoi(str_metadata.substr(position1, position2).data());

	position1 = position2 + 1;
	width = atoi(str_metadata.substr(position2 + 1).data());

	BoxMetadata* metadata = new BoxMetadata(lb_corner_x, lb_corner_y, length, width);
	return metadata;
}

Metadata* ReadMetadata::guiReadTriangle(char* metadata_file, string NodeValue)
{
	string str_metadata = readMetadata(metadata_file, NodeValue);
	if (str_metadata == "")
	{
		return NULL;
	}

	int point_x1;
	int point_y1;
	int point_x2;
	int point_y2;
	int point_x3;
	int point_y3;

	int position1 = 0;
	int position2 = str_metadata.find(",");
	point_x1 = atoi(str_metadata.substr(position1, position2).data());

	position1 = position2 + 1;
	position2 = str_metadata.find(",", position1);
	point_y1 = atoi(str_metadata.substr(position1, position2).data());

	position1 = position2 + 1;
	position2 = str_metadata.find(",", position1);
	point_x2 = atoi(str_metadata.substr(position1, position2).data());

	position1 = position2 + 1;
	position2 = str_metadata.find(",", position1);
	point_y2 = atoi(str_metadata.substr(position1, position2).data());

	position1 = position2 + 1;
	position2 = str_metadata.find(",", position1);
	point_x3 = atoi(str_metadata.substr(position1, position2).data());

	position1 = position2 + 1;
	point_y3 = atoi(str_metadata.substr(position2 + 1).data());

	TriangleMetadata* metadata = new TriangleMetadata(point_x1, point_y1, point_x2, point_y2, point_x3, point_y3);
	return metadata;
}

string ReadMetadata::readMetadata(char* metadata_file, string NodeValue)
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

string ReadMetadata::getNodeValue(char* text)
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

string ReadMetadata::getMetadata(char* text)
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
