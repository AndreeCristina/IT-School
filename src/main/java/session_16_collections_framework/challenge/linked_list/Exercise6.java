package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise6 {
    // Write a Java program to insert elements into the linked list at the first and last position.

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(14);
        myLinkedList.add(4);
        myLinkedList.add(55);
        myLinkedList.add(78);
        myLinkedList.add(10);
        myLinkedList.add(7);

        System.out.println("Original LinkedList: ");
        displayLinkedList(myLinkedList);

        myLinkedList.addFirst(101);
        System.out.println("LinkedList after insert an element to the first position");
        displayLinkedList(myLinkedList);

        myLinkedList.addLast(500);
        System.out.println("LinkedList after insert an element to the last position");
        displayLinkedList(myLinkedList);
    }

    public static void displayLinkedList(LinkedList<Integer> myLinkedList) {
        for (int element : myLinkedList) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}