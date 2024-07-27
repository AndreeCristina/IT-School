package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise20 {
    // Write a Java program to retrieve but does not remove, the first element of a linked list.

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("New York");
        placesToVisit.add("London");
        placesToVisit.add("Madrid");
        placesToVisit.add("Milan");
        placesToVisit.add("Barcelona");
        placesToVisit.add("Berna");
        placesToVisit.add("Aya Napa");
        placesToVisit.add("Athens");
        placesToVisit.add("Lisbon");

        System.out.println("Original linked list: ");
        displayPlaceToVisit(placesToVisit);

        System.out.println("First element from the list: ");
        System.out.println(retrieveFirstEl(placesToVisit));

        System.out.println("Linked list: ");
        displayPlaceToVisit(placesToVisit);
    }

    public static String retrieveFirstEl(LinkedList<String> placesToVisit) {
        return placesToVisit.getFirst();
    }

    public static void displayPlaceToVisit(LinkedList<String> placeToVisit) {
        for (String place : placeToVisit) {
            System.out.print(place + " ");
        }

        System.out.println();
    }
}