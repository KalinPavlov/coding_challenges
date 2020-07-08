package challenge_15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SolutionBTree {

    public static boolean findElementDFSRec(NodeBTree node, int x) {
        if (node == null) {
            return false;
        }

        Stack<NodeBTree> stack = new Stack<>();
        stack.push(node);
        return findElementDFSRecHelper(x, stack);
    }

    private static boolean findElementDFSRecHelper(int x, Stack<NodeBTree> stack) {
        if (stack.empty()) {
            return false;
        }
        NodeBTree node = stack.pop();
        if (node.getValue() == x) {
            return true;
        } else {
            NodeBTree left = node.getLeft();
            NodeBTree right = node.getRight();
            if (left != null) {
                stack.push(left);
            }
            if (right != null) {
                stack.push(right);
            }
        }

        return findElementDFSRecHelper(x, stack);
    }

    public static boolean findElementBFSRec(NodeBTree node, int x) {
        if (node == null) {
            return false;
        }

        Queue<NodeBTree> queue = new LinkedList<>();
        queue.add(node);
        return findElementBFSRecHelper(x, queue);
    }

    private static boolean findElementBFSRecHelper(int x, Queue<NodeBTree> queue) {
        if (queue.isEmpty()) {
            return false;
        }
        NodeBTree node = queue.poll();
        if (node.getValue() == x) {
            return true;
        } else {
            NodeBTree left = node.getLeft();
            NodeBTree right = node.getRight();
            if (left != null) {
                queue.add(left);
            }
            if (right != null) {
                queue.add(right);
            }
        }

        return findElementBFSRecHelper(x, queue);
    }

    public static boolean findElementDFSIter(NodeBTree node, int x) {
        if (node == null) { // 1
            return false; // 1
        }

        Stack<NodeBTree> stack = new Stack<>(); // 1
        stack.push(node); // 1

        while (!stack.empty()) { // n
            node = stack.pop(); // 1
            if (node.getValue() == x) { // 1
                return true; // 1
            } else {
                NodeBTree left = node.getLeft(); // 1
                NodeBTree right = node.getRight(); // 1
                if (left != null) { // 1
                    stack.push(left); // 1
                }
                if (right != null) { // 1
                    stack.push(right); // 1
                }
            }
        }

        return false; // 1

        // Time: O(n)
        // Space: O(n)
    }

    public static boolean findElementBFSIter(NodeBTree node, int x) {
        if (node == null) {
            return false;
        }

        Queue<NodeBTree> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            node = queue.poll();
            if (node.getValue() == x) {
                return true;
            } else {
                NodeBTree left = node.getLeft();
                NodeBTree right = node.getRight();
                if (left != null) {
                    queue.add(left);
                }
                if (right != null) {
                    queue.add(right);
                }
            }
        }

        return false;
    }
}
