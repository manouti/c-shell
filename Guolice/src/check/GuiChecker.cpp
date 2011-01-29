#include "GuiChecker.h"


GuiChecker::GuiChecker(){
    errors= "";
    metaDataExists = false;
    comparison_output_file = "../tests/test_output";
    comparison_output_on_screen = "";
    comparison_output = "";
}

void GuiChecker::printCheck(){

    cout << endl << endl;
    cout << "****************************************************************************************************" << endl;
    cout << endl << endl << "GUI Comparision Output:" << endl << endl;
    cout << comparison_output_on_screen << endl;

    ofstream result(comparison_output_file);
    if (result != NULL)
    {
            result << comparison_output;
            result.close();
    }
    cout <<errors<<endl;


}

void GuiChecker::setIfMetaData(bool metaData){
    metaDataExists = metaData;

}

void GuiChecker::checkError(Node * node){
    if(node->getMode() == "ERROR")
    {
            errors += "*** error: '" + node->getValue() + "' was not declared.\n";
    }

}
void  GuiChecker::compareExpression(Node* node, StringAbstractGuiMap guiObject, string guiCompareExpression){
        comparison_output += "\nEvaluating '" + guiCompareExpression + "'\n";
        comparison_output_on_screen += "\nEvaluating '" + guiCompareExpression+ "'\n";
        vector<vector<Solution> > solutions;
        solutions = node->evaluate(guiObject);
        char cstr[25];
        GuoliceUtil::int2str(cstr, solutions.size());
        comparison_output += "Number Of solutions: " + string(cstr) + "\n";
        comparison_output += "=======================\n";
        comparison_output_on_screen += "Number Of solutions: " + string(cstr) + "\n";
        comparison_output_on_screen += "=======================\n";
        for (int solutionIt = 0 ; solutionIt < solutions.size() ; solutionIt++)
        {
                GuoliceUtil::int2str(cstr, solutionIt + 1);
                if (solutionIt == 2)
                {
                        comparison_output_on_screen += "\n    More solutions can be found on the output file ../tests/test_output.\n";
                }
                comparison_output += "\n    Solution: " + string(cstr) + "\n";
                comparison_output += "    ------------\n";
                if (solutionIt < 2)
                {
                        comparison_output_on_screen += "\n    Solution: " + string(cstr) + "\n";
                        comparison_output_on_screen += "    ------------\n";
                }
                for (int solutionIt_sub = 0; solutionIt_sub < solutions.at(solutionIt).size() ; solutionIt_sub++)
                {
                        comparison_output += "    " + solutions.at(solutionIt).at(solutionIt_sub).varName + ": " +
                                                                solutions.at(solutionIt).at(solutionIt_sub).shape->toString() + "\n";
                        if (solutionIt < 2)
                        {
                                comparison_output_on_screen += "    " + solutions.at(solutionIt).at(solutionIt_sub).varName + ": " +
                                                                solutions.at(solutionIt).at(solutionIt_sub).shape->toString() + "\n";
                        }
                }
        }



}
void GuiChecker::check(){
    if(metaDataExists)
        printCheck();
    else
        cout<<"No metaData exist to preform  a check. "<<endl;

}
