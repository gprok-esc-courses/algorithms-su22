package singly_linked_list;

import java.util.Random;

public class SinglyLinkedList {
    private ListNode head;

    public SinglyLinkedList() {
        head = null;
    }

    public void add(int v) {
        ListNode temp = new ListNode(v);
        temp.setNext(head);
        head = temp;
    }

    public void addUnique(int v) {
        if(! exists(v)) {
            ListNode temp = new ListNode(v);
            temp.setNext(head);
            head = temp;
        }
    }

    public void addSorted(int v) {
        // EXERCISE 1:
        // Add a new value in the proper position such as the list will be sorted
        // and unique
    }

    public boolean delete(int v) {
        ListNode iter = head;
        ListNode prevIter = null;
        while(iter != null) {
            if(iter.getValue() == v) {
                if(prevIter == null) { // deleting the first node
                    head = iter.getNext();
                }
                else {
                    prevIter.setNext(iter.getNext());
                }
                return true;
            }
            prevIter = iter;
            iter = iter.getNext();
        }
        return false;
    }

    public void print() {
        ListNode iter = head;
        while(iter != null) {
            System.out.println(iter.getValue());
            iter = iter.getNext();
        }
    }

    public boolean exists(int v) {
        ListNode iter = head;
        while(iter != null) {
            if(iter.getValue() == v) {
                System.out.println(v + " exists");
                return true;
            }
            iter = iter.getNext();
        }
        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Random rnd = new Random();
        for(int i = 0; i < 100; i++) {
            int v = rnd.nextInt();
            list.addUnique(v);
        }
        long start = System.currentTimeMillis();
        int v = rnd.nextInt();
        list.addUnique(v);
        long end = System.currentTimeMillis();
        System.out.println("Start: " + start);
        System.out.println("End: " + end);
        System.out.println("Time: " + (end - start));
        // list.print();

        // EXERCISE 2:
        // Calculate the efficiency of addSorted method
    }
}
