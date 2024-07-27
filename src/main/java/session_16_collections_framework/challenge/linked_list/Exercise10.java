package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise10 {
    // Write a Java program to get the first and last occurrence of the specified elements in a linked list.

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(14);
        myLinkedList.add(4);
        myLinkedList.add(55);
        myLinkedList.add(78);
        myLinkedList.add(10);
        myLinkedList.add(7);
        myLinkedList.add(4);
        myLinkedList.add(74);

        int elementToFind = 4;

        int firstOccurrence = myLinkedList.indexOf(elementToFind);
        int lastOccurrence = myLinkedList.lastIndexOf(elementToFind);

        System.out.println("The first occurrence for the element " + elementToFind + " is: " + firstOccurrence);
        System.out.println("The last occurrence for the element " + elementToFind + " is: " + lastOccurrence);
    }
}