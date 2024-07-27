package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercise9 {
    //  Write a Java program to insert some elements at the specified position into a linked list.

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("New York");
        placesToVisit.add("London");
        placesToVisit.add("Madrid");
        placesToVisit.add("Milan");

        System.out.println("Original linked list: ");
        displayLinkedList(placesToVisit);

        List<String> elementsToInsert = List.of("Barcelona", "Bali", "Lima");
        int index = 2;

        ListIterator<String> iterator = placesToVisit.listIterator(index);
        for (String element : elementsToInsert) {
            iterator.add(element);
        }

        System.out.println("Linked list after insert some elements: ");
        displayLinkedList(placesToVisit);
    }

    public static void displayLinkedList(LinkedList<String> placesToVisit) {
        for (String place : placesToVisit) {
            System.out.print(place + " ");
        }

        System.out.println();
    }
}