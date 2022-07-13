package hash_table;

import singly_linked_list.SinglyLinkedList;

import java.util.Random;

// EXERCISE 3:
// Think how we could add a quota variable
// and resize the hash table when any list
// will have more elements than the quota

public class HashTable {
    private SinglyLinkedList [] htable;
    private int tableSize;

    public HashTable(int size) {
        tableSize = size;
        htable = new SinglyLinkedList[tableSize];
        for(int i = 0; i < tableSize; i++) {
            htable[i] = new SinglyLinkedList();
        }
    }

    public int hashValue(int v) {
        return v % tableSize;
    }

    public void add(int v) {
        int h = hashValue(v);
        htable[h].add(v);
    }

    public void addUnique(int v) {
        int h = hashValue(v);
        htable[h].addUnique(v);
    }

    public void print() {
        for(int i = 0; i < tableSize; i++) {
            System.out.print(i + ": ");
            htable[i].printInline();
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        HashTable hashTable = new HashTable(10000);
        for(int i = 0; i < 1000000; i++) {
            int v = rnd.nextInt();
            v = v < 0 ? -1 * v : v;
            hashTable.add(v);
        }
        hashTable.print();
    }
}
