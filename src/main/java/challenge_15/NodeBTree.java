package challenge_15;

public class NodeBTree {
    private final int value;
    private NodeBTree left;
    private NodeBTree right;

    public NodeBTree(int value) {
        this.value = value;
    }

    public NodeBTree(int value, NodeBTree left, NodeBTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public NodeBTree getLeft() {
        return left;
    }

    public NodeBTree getRight() {
        return right;
    }
}
