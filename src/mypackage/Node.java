package mypackage;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String value;
    private List<Node> children;
    private Node parent;

    public Node() {
        this("");
    }
	
	public Node(Node node) {
		this.value = node.getValue();
		this.children = node.getChildren();
		this.parent = node.getParent();
	}
	
	public Node(String value) {
		this.value = value;
		children = new ArrayList<Node>();
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

    public void setParent(Node parent) {
        this.parent = parent;
	}
	
    public void addChild(Node child) {
        this.children.add(child);
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
	
	@Override
	public String toString() {
		return "Node [children=" + children + ", parent=" + parent + ", value="
				+ value + "]";
	}
}
