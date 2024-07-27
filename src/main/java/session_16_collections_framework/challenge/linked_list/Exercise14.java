package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise14 {
    // Write a Java program to remove all the elements from a linked list.

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("New York");
        placesToVisit.add("London");
        placesToVisit.add("Madrid");
        placesToVisit.add("Milan");

        System.out.println("Original linked list: ");
        displayPlaceToVisit(placesToVisit);

        placesToVisit.clear();

        System.out.println("Linked list after remove all the elements: ");
        displayPlaceToVisit(placesToVisit);
    }

    public static void displayPlaceToVisit(LinkedList<String> placeToVisit) {
        for (String place : placeToVisit) {
            System.out.print(place + " ");
        }
        System.out.println();
    }
}