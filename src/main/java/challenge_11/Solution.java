package challenge_11;

import java.util.Stack;

public class Solution {

    public static ListNode reverseIter(ListNode list) {
        if (list != null) {
            Stack<Integer> stack = new Stack<>(); // 1
            ListNode current = list; // 1

            while (current != null) { // n
                stack.push(current.getValue()); // 1
                current = current.getNext(); // 1
            }

            ListNode result = null; // 1
            while (!stack.empty()) { // n
                if (result == null) { // 1
                    result = new ListNode(stack.pop()); // 1
                    current = result; // 1
                } else {
                    current.setNext(new ListNode(stack.pop())); // 1
                    current = current.getNext(); // 1
                }
            }

            return result; // 1
        }

        return null; // 1
    }

    // n + n = O(n)

//    public static ListNode reverseRec(ListNode list) {
//        if (list == null) { return null; }
//
//        return reverseRecHelper(list.getNext(), list);
//    }
//
//    public static ListNode reverseRecHelper(ListNode list, ListNode prev) {
//        if (list == null) { return prev; }
//
//        ListNode reversed = reverseRecHelper(list.getNext(), list);
//
//        list.setNext(reversed);
//
//        return list;
//    }
//
//    public static void printList(ListNode node) {
//        if (node != null) {
//            System.out.println(node.getValue());
//            printList(node.getNext());
//        }
//    }
//
//    public static void main(String[] args) {
//        ListNode list = new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(0)))));
//        reverseRec(list);
//    }
}
