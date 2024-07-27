package session_16_collections_framework.challenge.linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class Exercise16 {
    // Write a Java program to shuffle the elements in a linked list.

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

        Collections.shuffle(placesToVisit);

        System.out.println("Shuffled linked list: ");
        displayPlaceToVisit(placesToVisit);
    }

    public static void displayPlaceToVisit(LinkedList<String> placeToVisit) {
        for (String place : placeToVisit) {
            System.out.print(place + " ");
        }
        System.out.println();
    }
}