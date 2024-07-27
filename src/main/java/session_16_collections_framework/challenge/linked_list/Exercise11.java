package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise11 {
    // Write a Java program to display the elements and their positions in a linked list.

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

        displayElements(myLinkedList);
    }

    public static void displayElements(LinkedList<Integer> myLinkedList) {
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.printf("Element : %-5d position: %d", myLinkedList.get(i), i);
            System.out.println();
        }
    }
}