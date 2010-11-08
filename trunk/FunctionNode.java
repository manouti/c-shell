package mypackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FunctionNode extends Node {

	private String returnType;
	private Map<String, String> parameters;
    
	
	
	public FunctionNode() {
		super();
	}

	public FunctionNode(Node node) {
		super(node);
		parameters = new HashMap<String, String>();
	}

	public FunctionNode(String value, List<Node> children, Node parent) {
		super(value, children, parent);
		parameters = new HashMap<String, String>();
	}

	public FunctionNode(String value) {
		super(value);
		parameters = new HashMap<String, String>();
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	private String printParameters() {
		String parameterText = "";
		for (Iterator<String> i = parameters.keySet().iterator(); i.hasNext();) {
			String param = i.next();
			parameterText += parameters.get(param) + " " + param + "; ";
		}
		return parameterText;
	}
	
	@Override
	public String toString() {
		return "Node [value = "
		+ getValue() + "(" + printParameters() + ") returns = " + getReturnType()
		+ ", parent = " + ((getParent() == null)?"null":getParent().getValue()) + ", children = " + printChildren() + "]";
	}
}
