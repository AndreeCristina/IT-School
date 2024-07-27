package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise15 {
    // Write a Java program of swap two elements in a linked list.

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

        int index1 = 1;
        int index2 = 5;

        swapElements(myLinkedList, index1, index2);

        System.out.println("Linked list after swap two elements is: ");
        displayLinkedList(myLinkedList);
    }

    public static void swapElements(LinkedList<Integer> myLinkedList, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= myLinkedList.size() || index2 >= myLinkedList.size()) {
            System.out.println("Invalid index.");
        } else if (index1 == index2) {
            System.out.println("No need to swap if indices are the same");
        } else {
            int temp = myLinkedList.get(index1);
            myLinkedList.set(index1, myLinkedList.get(index2));
            myLinkedList.set(index2, temp);
        }
    }

    public static void displayLinkedList(LinkedList<Integer> myLinkedList) {
        for (int element : myLinkedList) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}