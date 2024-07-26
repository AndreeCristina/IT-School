package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Exercise19 {
    // Write a Java program to trim the capacity of an array list the current list size.

    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("apple");
        list.add("pineapple");
        list.add("banana");
        list.add("pear");
        list.add("lemon");
        list.add("strawberry");
        list.add("blueberry");

        System.out.println("Original capacity: " + list.size());

        list.trimToSize();

        System.out.println("Capacity after trimming: " + list.size());
    }
}