package challenge_16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

    public static int[] findFloorCeilingDFSRec(Node node, int x) {
        int[] res = {-1, -1};
        if (node == null) {
            return res;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(node);
        return findElementDFSRecHelper(x, stack, res);
    }

    private static int[] findElementDFSRecHelper(int x, Stack<Node> stack, int[] res) {
        if (stack.empty()) {
            return res;
        }
        Node node = stack.pop();
        int value = node.getValue();
        if (value < x && value == x - 1) {
            res[0] = value;
        } else if (value > x && value == x + 1) {
            res[1] = value;
        } else if (value == x) {
            res[0] = value;
            res[1] = value;
            return res;
        }

        Node left = node.getLeft();
        Node right = node.getRight();
        if (left != null) {
            stack.push(left);
        }
        if (right != null) {
            stack.push(right);
        }

        return findElementDFSRecHelper(x, stack, res);
    }

    public static int[] findFloorCeilingBFSRec(Node node, int x) {
        int[] res = {-1, -1};
        if (node == null) {
            return res;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        return findElementBFSRecHelper(x, queue, res);
    }

    private static int[] findElementBFSRecHelper(int x, Queue<Node> queue, int[] res) {
        if (queue.isEmpty()) {
            return res;
        }
        Node node = queue.poll();
        int value = node.getValue();
        if (value < x && value == x - 1) {
            res[0] = value;
        } else if (value > x && value == x + 1) {
            res[1] = value;
        } else if (value == x) {
            res[0] = value;
            res[1] = value;
            return res;
        }

        Node left = node.getLeft();
        Node right = node.getRight();
        if (left != null) {
            queue.add(left);
        }
        if (right != null) {
            queue.add(right);
        }

        return findElementBFSRecHelper(x, queue, res);
    }

    public static int[] findFloorCeilingDFSIter(Node node, int x) {
        int[] res = {-1, -1};
        if (node == null) {
            return res;
        }

        Stack<Node> stack = new Stack<>(); // 1
        stack.push(node); // 1

        while (!stack.empty()) { // n
            node = stack.pop(); // 1
            int value = node.getValue();
            if (value < x && value == x - 1) {
                res[0] = value;
            } else if (value > x && value == x + 1) {
                res[1] = value;
            } else if (value == x) {
                res[0] = value;
                res[1] = value;
                return res;
            }

            Node left = node.getLeft(); // 1
            Node right = node.getRight(); // 1
            if (left != null) { // 1
                stack.push(left); // 1
            }
            if (right != null) { // 1
                stack.push(right); // 1
            }
        }

        return res; // 1

        // Time: O(n)
        // Space: O(n)
    }

    public static int[] findFloorCeilingBFSIter(Node node, int x) {
        int[] res = {-1, -1};
        if (node == null) {
            return res;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            node = queue.poll();
            int value = node.getValue();
            if (value < x && value == x - 1) {
                res[0] = value;
            } else if (value > x && value == x + 1) {
                res[1] = value;
            } else if (value == x) {
                res[0] = value;
                res[1] = value;
                return res;
            }

            Node left = node.getLeft();
            Node right = node.getRight();
            if (left != null) {
                queue.add(left);
            }
            if (right != null) {
                queue.add(right);
            }
        }

        return res;
    }
}
