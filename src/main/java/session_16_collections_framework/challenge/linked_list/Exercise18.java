package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise18 {
    // Write a Java program to clone a linked list to another linked list.

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(14);
        myLinkedList.add(4);
        myLinkedList.add(55);
        myLinkedList.add(78);
        myLinkedList.add(10);
        myLinkedList.add(7);

        System.out.println("Linked list: ");
        displayLinkedList(myLinkedList);

        LinkedList<Integer> clonedMyLinkedList = new LinkedList<>(myLinkedList);

        System.out.println("The elements for the cloned linked list: ");
        displayLinkedList(clonedMyLinkedList);
    }

    public static void displayLinkedList(LinkedList<Integer> myLinkedList) {
        for (int element : myLinkedList) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
