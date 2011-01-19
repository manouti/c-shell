#ifndef ABSTRACTNODEFACTORY_H
#define ABSTRACTNODEFACTORY_H

//used in inherited classes
#include <map>
#include "ParseTree.h"

#include <iostream>
using namespace std;

enum FactoryType {guolice, standard};

class AbstractNodeFactory{
	private:
		FactoryType factoryType;
		
	public:
		AbstractNodeFactory();

		void print();

		void setFactoryType(FactoryType type);
};

#endif // ABSTRACTNODEFACTORY_H
