package challenge_11;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    private final int value;
    private ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public List<Integer> toList() {
        List<Integer> list = new ArrayList<>();
        ListNode current = this;
        while (current != null) {
            list.add(current.getValue());
            current = current.getNext();
        }

        return list;
    }
}
