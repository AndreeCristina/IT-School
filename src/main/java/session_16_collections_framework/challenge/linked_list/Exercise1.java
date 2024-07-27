package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise1 {
    // Write a Java program to append the specified element to the end of a linked list.

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("New York");
        placesToVisit.add("London");
        placesToVisit.add("Madrid");
        placesToVisit.add("Milan");

        System.out.println("Original list: ");
        displayList(placesToVisit);

        placesToVisit.addLast("Berlin");

        System.out.println("Updated list: ");
        displayList(placesToVisit);
    }

    public static void displayList(LinkedList<String> placesToVisit) {
        for (String place : placesToVisit) {
            System.out.print(place + " ");
        }
        System.out.println();
    }
}