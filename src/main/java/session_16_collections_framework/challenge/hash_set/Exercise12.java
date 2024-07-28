package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Exercise12 {
    // Write a Java program to remove all the elements from a hash set.

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("blueberry");
        mySet.add("banana");
        mySet.add("pear");
        mySet.add("melon");
        mySet.add("mango");
        mySet.add("pineapple");

        System.out.println("Original hash set: " + mySet);

        mySet.clear();

        System.out.println("The hash set after remove all the elements: " + mySet);
    }
}