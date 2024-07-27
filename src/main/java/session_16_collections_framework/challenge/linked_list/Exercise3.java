package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise3 {
    // Write a Java program to iterate through all elements in a linked list starting at the specified position.

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("New York");
        placesToVisit.add("London");
        placesToVisit.add("Madrid");
        placesToVisit.add("Milan");

        int startPosition = 2;

        ListIterator<String> iterator = placesToVisit.listIterator(startPosition);
        while (iterator.hasNext()) {
            String place = iterator.next();
            System.out.println(place + " ");
        }
    }
}