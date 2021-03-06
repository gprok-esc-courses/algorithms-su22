package singly_linked_list;

public class ListNode {
    private int value;
    private ListNode next;

    public ListNode(int v) {
        value = v;
        next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
