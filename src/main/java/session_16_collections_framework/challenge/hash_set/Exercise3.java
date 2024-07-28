package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Exercise3 {
    // Write a Java program to get the number of elements in a hash set.

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("blueberry");
        mySet.add("banana");
        mySet.add("pear");
        mySet.add("melon");
        mySet.add("mango");
        mySet.add("pineapple");

        int noOfElements = mySet.size();

        System.out.println("The hash set has " + noOfElements + " elements");
    }
}