package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise12 {
    // Write a Java program to remove a specified element from a linked list.

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("New York");
        placesToVisit.add("London");
        placesToVisit.add("Madrid");
        placesToVisit.add("Milan");

        System.out.println("Original linked list: ");
        displayPlaceToVisit(placesToVisit);

        String specifiedElement = "London";

        placesToVisit.remove(specifiedElement);

        System.out.println("Linked list after remove a specified element.");
        displayPlaceToVisit(placesToVisit);
    }

    public static void displayPlaceToVisit(LinkedList<String> placeToVisit) {
        for (String place : placeToVisit) {
            System.out.print(place + " ");
        }

        System.out.println();
    }
}