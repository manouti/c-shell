/** \file AbstractNodeFactory.h
* Abstract Node Type Factory
*
*/
#ifndef ABSTRACTNODEFACTORY_H
#define ABSTRACTNODEFACTORY_H

#include <map>
#include "ParseTree.h"
#include <iostream>
using namespace std;

enum FactoryType {guolice, standard};


/**
* \class AbstractNodeFactory
* \brief Abstract Class which GuoliceNodeFactory and StandardNodeFactory inherit
*
*/


class AbstractNodeFactory{
	private:
                FactoryType factoryType;        //! Class type

	public:

                AbstractNodeFactory();

		void print();

		void setFactoryType(FactoryType type);
};

#endif // ABSTRACTNODEFACTORY_H
