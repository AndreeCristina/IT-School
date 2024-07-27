package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise13 {
    // Write a Java program to remove first and last element from a linked list.

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

        placesToVisit.removeFirst();
        System.out.println("Linked list after removed the first element.");
        displayPlaceToVisit(placesToVisit);

        placesToVisit.poll();
        System.out.println("Linked list after removed another first element.");
        displayPlaceToVisit(placesToVisit);

        placesToVisit.pollFirst();
        System.out.println("Linked list after removed another first element.");
        displayPlaceToVisit(placesToVisit);


        placesToVisit.removeLast();
        System.out.println("Linked list after remove the last element.");
        displayPlaceToVisit(placesToVisit);

        placesToVisit.pollLast();
        System.out.println("Linked list after remove another last element.");
        displayPlaceToVisit(placesToVisit);
    }

    public static void displayPlaceToVisit(LinkedList<String> placeToVisit) {
        for (String place : placeToVisit) {
            System.out.print(place + " ");
        }

        System.out.println();
    }
}