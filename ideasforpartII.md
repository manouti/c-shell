Ideas for part two:

need class drawnodes
class drawNodes{

return string drawFunction();
return string drawProcedure();
return string drawifNode();
return string drawGuiType();
--each function should draw a shape specific to it
dont know if we want to do edges
we may want to do it for if else, while for coloring the condition
...
}
need aspect for class node.
aspect graphViz{

advice (whenever we have addtoGraph()}
{
will take the node add call specific function. this will return a string we
will append it to a graph.dot file, by iso:append

}


after running the graph can be drawn by running the command.
-need a function to traverse the tree - we dont have one