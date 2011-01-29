/**\file Solution.h
*/
#ifndef SOLUTION
#define SOLUTION

#include <AbstractGui.h>
#include <string>

/** 
*\class Solution
*\brief This class implements a solution representation of the evaluation 
*
*/
class Solution
{
	public:

		AbstractGui*  shape; //!< a data member containing the coordinates and the parameters defining the Gui shape, represented in an AbstractGui object 
		string varName;//!< a string containing the name of  the variable holding the shape
};

#endif //SOLUTION
