/**\file Guoliceutil.h
*/
#ifndef GUOLICE_UTIL
#define GUOLICE_UTIL

#include <stdio.h>
#include <string.h>


/** 
*
*\brief This class implements the utility functions used accross the program
*/ 
class GuoliceUtil{
public:
/**
* Converts a number of type double to a string 
*
*@param str
* A pointer to a string where the converted value will be stored
*
*@param number
* A number of type double to be converted to string
*/
	static void dbl2str (char* str, double number)
	{
		memset(str, 0, 25);
		sprintf(str, "%.2f", number);
	}

/**
* Converts a number of type integer to a string 
*
*@param str
* A pointer to a string where the converted value will be stored
*
*@param number
* A number of type integer to be converted to string
*/
	static void int2str (char* str, int number)
	{
		memset(str, 0, 25);
		sprintf(str, "%d", number);
	}
};

#endif // GUOLICE_UTIL
