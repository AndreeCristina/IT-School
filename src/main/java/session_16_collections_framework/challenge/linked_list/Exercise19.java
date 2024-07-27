package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise19 {
    // Write a Java program to remove and return the first element of a linked list.

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

        System.out.println("First element and the element removed is: ");
        System.out.println(removeFirstEl(placesToVisit));

        System.out.println("Remaining list: ");
        displayPlaceToVisit(placesToVisit);
    }

    public static String removeFirstEl(LinkedList<String> placesToVisit) {
        return placesToVisit.removeFirst();
    }

    public static void displayPlaceToVisit(LinkedList<String> placeToVisit) {
        for (String place : placeToVisit) {
            System.out.print(place + " ");
        }

        System.out.println();
    }
}