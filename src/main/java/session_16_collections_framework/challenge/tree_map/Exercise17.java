package session_16_collections_framework.challenge.tree_map;

import java.util.TreeMap;

public class Exercise17 {
    // Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(21, "apple");
        treeMap.put(2, "banana");
        treeMap.put(18, "pear");
        treeMap.put(8, "orange");

        int givenKey = 2;

        Integer greatestKey = treeMap.lowerKey(givenKey);

        if (greatestKey != null) {
            System.out.println("The greatest key strictly less than " + givenKey + " is: " + greatestKey);
        } else {
            System.out.println("There is no key strictly less than " + givenKey);
        }
    }
}