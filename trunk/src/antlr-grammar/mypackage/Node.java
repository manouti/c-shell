package mypackage;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String value;
    private List<Node> children;
    private Node parent;
	
    public Node() { 	
    }
    
	public Node(Node node) {
		this.value = node.getValue();
		this.children = node.getChildren();
		this.parent = node.getParent();
	}
	
	public Node(String value) {
		this.value = value;
		children = new ArrayList<Node>();
		parent = new Node();
	}

    public Node(String value, List<Node> children, Node parent) {
        this.value = value;
        this.children = children;
        this.parent = parent;
    }

	public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public Node getParent() {
        return parent;
    }

    private void setParent(Node parent) {
    	this.parent = parent;
    }
	
    public void addChild(Node child) {
    	children.add(child);
        child.setParent(this);
    }

    public void removeChild(Node child) {
        for (int i = 0; i < children.size(); i++) {
            if (child.equals(children.get(i))) {
                Node removedNode = children.remove(i);
				removedNode.setParent(null);
                break;
            }
        }
    }
	
    private String printChildren() {
    	String childrenString = "";
    	for(int i = 0; i < children.size(); i++) {
    		if(i == 0) { childrenString += children.get(0).getValue(); }
    		
    		else childrenString += ", " + children.get(i).getValue();
    	}
    	
    	return childrenString;
    }
	@Override
	public String toString() {
		return "Node [value = "
		+ value + ", parent = " + ((parent == null)?"null":parent.getValue()) + ", children = " + printChildren() + "]";
	}
}
