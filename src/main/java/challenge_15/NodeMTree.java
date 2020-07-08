package challenge_15;

import java.util.List;

public class NodeMTree {
    private final int value;
    private List<NodeMTree> children;

    public NodeMTree(int value) {
        this.value = value;
    }

    public NodeMTree(int value, List<NodeMTree> children) {
        this.value = value;
        this.children = children;
    }

    public int getValue() {
        return value;
    }

    public List<NodeMTree> getChildren() {
        return children;
    }
}
