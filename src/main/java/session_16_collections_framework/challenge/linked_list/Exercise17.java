package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise17 {
    //  Write a Java program to join two linked lists.

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("New York");
        placesToVisit.add("London");
        placesToVisit.add("Madrid");
        placesToVisit.add("Milan");

        LinkedList<String> placesToVisit2 = new LinkedList<>();
        placesToVisit2.add("Barcelona");
        placesToVisit2.add("Berna");
        placesToVisit2.add("Aya Napa");
        placesToVisit2.add("Athens");
        placesToVisit2.add("Lisbon");

        System.out.println("First linked list: ");
        displayPlaceToVisit(placesToVisit);

        System.out.println("Second linked list: ");
        displayPlaceToVisit(placesToVisit2);

        concatenatedTwoLinkedList(placesToVisit, placesToVisit2);

        System.out.println("First linked list concatenated with the second linked list");
        displayPlaceToVisit(placesToVisit);
    }

    public static void concatenatedTwoLinkedList(LinkedList<String> placesToVisit, LinkedList<String> placesToVisit2) {
        placesToVisit.addAll(placesToVisit2);
    }

    public static void displayPlaceToVisit(LinkedList<String> placeToVisit) {
        for (String place : placeToVisit) {
            System.out.print(place + " ");
        }

        System.out.println();
    }
}