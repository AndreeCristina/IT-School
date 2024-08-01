package session_16_collections_framework.challenge.tree_map;

import java.util.TreeMap;

public class Exercise15 {
    // Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(21, "apple");
        treeMap.put(2, "banana");
        treeMap.put(18, "pear");
        treeMap.put(8, "orange");

        int key = 2;

        Integer higherKey = treeMap.higherKey(key);

        if (higherKey != null) {
            System.out.println("Greatest key strictly greater than " + key + ": " + higherKey);
        } else {
            System.out.println("No key strictly greater than " + key);
        }
    }
}