package session_16_collections_framework.challenge.linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise2 {
    // Write a Java program to iterate through all elements in a linked list.

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("New York");
        placesToVisit.add("London");
        placesToVisit.add("Madrid");
        placesToVisit.add("Milan");

        System.out.println("Place to visit: ");
        for (String place : placesToVisit) {
            System.out.print(place + " ");
        }

        System.out.println();

        Iterator<String> iterator = placesToVisit.iterator();
        while (iterator.hasNext()) {
            String place = iterator.next();
            System.out.print(place + " ");
        }
    }
}