package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise8 {
    // Write a Java program to insert the specified element at the end of a linked list.

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(14);
        myLinkedList.add(4);
        myLinkedList.add(55);
        myLinkedList.add(78);
        myLinkedList.add(10);
        myLinkedList.add(7);

        System.out.println("Original linked list: ");
        displayLinkedList(myLinkedList);

        myLinkedList.addLast(200);
        System.out.println("Linked list after insert an element at the end of linked list");
        displayLinkedList(myLinkedList);

        myLinkedList.add(201);
        System.out.println("Linked list after insert an element at the end of linked list");
        displayLinkedList(myLinkedList);

        myLinkedList.offerLast(202);
        System.out.println("Linked list after insert an element at the end of linked list");
        displayLinkedList(myLinkedList);
    }

    public static void displayLinkedList(LinkedList<Integer> myLinkedList) {
        for (int element : myLinkedList) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}