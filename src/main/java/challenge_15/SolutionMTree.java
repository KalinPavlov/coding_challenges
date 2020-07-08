package challenge_15;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class SolutionMTree {

    public static boolean findElementDFSRec(final NodeMTree node, final int x) {
        if (node == null) {
            return false;
        }

        final Stack<NodeMTree> stack = new Stack<>();
        stack.push(node);
        return findElementDFSRecHelper(x, stack);
    }

    private static boolean findElementDFSRecHelper(final int x, final Stack<NodeMTree> stack) {
        if (stack.empty()) {
            return false;
        }
        final NodeMTree currentNode = stack.pop();
        if (currentNode.getValue() == x) {
            return true;
        } else {
            stackAdd(currentNode.getChildren(), stack);
        }

        return findElementDFSRecHelper(x, stack);
    }

    public static boolean findElementBFSRec(final NodeMTree node, final int x) {
        if (node == null) {
            return false;
        }

        Queue<NodeMTree> queue = new LinkedList<>();
        queue.add(node);
        return findElementBFSRecHelper(x, queue);
    }

    private static boolean findElementBFSRecHelper(final int x, final Queue<NodeMTree> queue) {
        if (queue.isEmpty()) {
            return false;
        }
        final NodeMTree currentNode = queue.poll();
        if (currentNode.getValue() == x) {
            return true;
        } else {
            queueAdd(currentNode.getChildren(), queue);
        }

        return findElementBFSRecHelper(x, queue);
    }

    public static boolean findElementDFSIter(final NodeMTree node, final int x) {
        if (node == null) { // 1
            return false; // 1
        }

        Stack<NodeMTree> stack = new Stack<>(); // 1
        stack.push(node); // 1

        while (!stack.empty()) { // n
            NodeMTree currentNode = stack.pop(); // 1
            if (currentNode.getValue() == x) { // 1
                return true; // 1
            } else {
                stackAdd(currentNode.getChildren(), stack);
            }
        }

        return false; // 1

        // Time: O(n)
        // Space: O(n)
    }

    public static boolean findElementBFSIter(final NodeMTree node, final int x) {
        if (node == null) {
            return false;
        }

        final Queue<NodeMTree> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            NodeMTree currentNode = queue.poll();
            if (currentNode.getValue() == x) {
                return true;
            } else {
                queueAdd(currentNode.getChildren(), queue);
            }
        }

        return false;
    }

    private static void queueAdd(final List<NodeMTree> nodes, final Queue<NodeMTree> queue) {
        if (nodes != null) {
            nodes.forEach(node -> {
                if (node != null) {
                    queue.add(node);
                }
            });
        }
    }

    private static void stackAdd(final List<NodeMTree> nodes, final Stack<NodeMTree> stack) {
        if (nodes != null) {
            nodes.forEach(node -> {
                if (node != null) {
                    stack.push(node);
                }
            });
        }
    }
}
