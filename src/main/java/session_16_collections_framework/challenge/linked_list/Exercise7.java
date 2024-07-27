package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Exercise7 {
    // 7. Write a Java program to insert the specified element at the front of a linked list.

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("New York");
        placesToVisit.add("London");
        placesToVisit.add("Madrid");
        placesToVisit.add("Milan");

        System.out.println("Original LinkedList: ");
        displayPlacesToVisit(placesToVisit);


        placesToVisit.offerFirst("Dubai");

        System.out.println("Linked list after insert the specified element at the front of a linked list.");
        displayPlacesToVisit(placesToVisit);

        placesToVisit.addFirst("Barcelona");

        System.out.println("Linked list after insert another specified element at the front of a linked list.");
        displayPlacesToVisit(placesToVisit);

        placesToVisit.push("Bali");

        System.out.println("Linked list after insert another specified element at the front of a linked list.");
        displayPlacesToVisit(placesToVisit);
    }

    public static void displayPlacesToVisit(LinkedList<String> placesToVisit) {
        for (String place : placesToVisit) {
            System.out.print(place + " ");
        }

        System.out.println();
    }
}