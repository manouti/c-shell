#ifndef POSITION_COMPARE
#define POSITION_COMPARE

#include <iostream>
#include <Node.h>
#include <Circle.h>
#include <Box.h>
#include <Triangle.h>
#include <GuoliceUtil.h>

using std::cout;
using std::endl;

int guiIsLeftOf(Node* g1, Node* g2);
int guiIsRightOf(Node* g1, Node* g2);
int guiIsAbove(Node* g1, Node* g2);
int guiIsBelow(Node* g1, Node* g2);
int guiIsContains(Node* g1, Node* g2);

#endif
