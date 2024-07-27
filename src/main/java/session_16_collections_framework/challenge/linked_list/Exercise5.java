package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise5 {
    // Write a Java program to insert the specified element at the specified position in the linked list.

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

        insertAnElement(myLinkedList, 100, 2);

        System.out.println("LinkedList after insert an element:");
        displayLinkedList(myLinkedList);
    }

    public static void insertAnElement(LinkedList<Integer> myLinkedList, int specifiedElement, int specifiedPosition) {
        myLinkedList.add(specifiedPosition, specifiedElement);
    }

    public static void displayLinkedList(LinkedList<Integer> myLinkedList) {
        for (int element : myLinkedList) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}