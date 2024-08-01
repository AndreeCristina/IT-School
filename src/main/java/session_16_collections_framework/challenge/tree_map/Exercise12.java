package session_16_collections_framework.challenge.tree_map;

import java.util.TreeMap;

public class Exercise12 {
    // Write a Java program to get the greatest key less than or equal to the given key.

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(21, "apple");
        treeMap.put(2, "banana");
        treeMap.put(18, "pear");
        treeMap.put(8, "orange");

        int key = 15;

        Integer floorKey = treeMap.floorKey(key);

        if (floorKey != null) {
            System.out.println("Greatest key less than or equal to " + key + ": " + floorKey);
        } else {
            System.out.println("No key less than or equal to " + key);
        }
    }
}