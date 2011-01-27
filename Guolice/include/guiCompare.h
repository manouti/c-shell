#ifndef COMPARE
#define COMPARE

#include <iostream>
#include <Node.h>
#include <Circle.h>
#include <Box.h>
#include <Triangle.h>
#include <GuoliceUtil.h>
#include <Solution.h>


using std::cout;
using std::endl;

vector<vector<Solution> > guiIsLeftOf(vector<vector<Solution> > v1, vector<vector<Solution> > v2);
vector<vector<Solution> > guiIsRightOf(vector<vector<Solution> > v1, vector<vector<Solution> > v2);
vector<vector<Solution> > guiIsAbove(vector<vector<Solution> > v1, vector<vector<Solution> > v2);
vector<vector<Solution> > guiIsBelow(vector<vector<Solution> > v1, vector<vector<Solution> > v2);
vector<vector<Solution> > guiIsContains(vector<vector<Solution> > v1, vector<vector<Solution> > v2);

vector<vector<Solution> > guiSmallerThan(vector<vector<Solution> > v1, vector<vector<Solution> > v2);
vector<vector<Solution> > guiBiggerThan(vector<vector<Solution> > v1, vector<vector<Solution> > v2);
vector<vector<Solution> > guiEqualTo(vector<vector<Solution> > v1, vector<vector<Solution> > v2);

vector<vector<Solution> > guiAND(vector<vector<Solution> > v1, vector<vector<Solution> > v2);
vector<vector<Solution> > guiOR(vector<vector<Solution> > v1, vector<vector<Solution> > v2);

#endif //COMPARE
