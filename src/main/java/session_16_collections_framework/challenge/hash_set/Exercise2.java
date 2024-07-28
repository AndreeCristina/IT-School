package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;
import java.util.Iterator;

public class Exercise2 {
    // Write a Java program to iterate through all elements in a hash list.

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("blueberry");
        mySet.add("banana");
        mySet.add("pear");
        mySet.add("melon");
        mySet.add("mango");
        mySet.add("pineapple");

        System.out.println("The hash set elements using a for-each loop: ");
        for (String element : mySet) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("The hash set elements using an iterator: ");
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
    }
}