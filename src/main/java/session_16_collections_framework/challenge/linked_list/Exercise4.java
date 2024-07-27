package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise4 {
    // Write a Java program to iterate a linked list in reverse order.

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(14);
        myLinkedList.add(4);
        myLinkedList.add(55);
        myLinkedList.add(78);
        myLinkedList.add(10);
        myLinkedList.add(7);

        System.out.println("Original LinkedList");
        for (int element : myLinkedList) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("LinkedList in reverse order: ");
        for (int i = myLinkedList.size() - 1; i >= 0; i--) {
            System.out.print(myLinkedList.get(i) + " ");
        }
    }
}