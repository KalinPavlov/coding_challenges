package challenge_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Node {
    private final char value;
    private Node left;
    private Node right;

    public Node(char value) {
        this.value = value;
    }

    public Node(char value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public char getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public List<Character> toListPreorder() {
        List<Character> result = new ArrayList<>();

        Stack<Node> stack = new Stack<>();
        stack.push(this);

        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();
            result.add(currentNode.getValue());
            Node right = currentNode.getRight();
            if (right != null) {
                stack.push(right);
            }
            Node left = currentNode.getLeft();
            if (left != null) {
                stack.push(left);
            }
        }

        return result;
    }
}