package session_16_collections_framework.challenge.tree_map;

import java.util.TreeMap;

public class Exercise9 {
    /* Write a Java program to get the first (lowest) key and the last (highest) key
    currently in a map. */

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(21, "apple");
        treeMap.put(2, "banana");
        treeMap.put(18, "pear");
        treeMap.put(8, "orange");

        Integer firstKey = treeMap.firstKey();
        Integer lastKey = treeMap.lastKey();

        System.out.println("firstKey: " + firstKey);
        System.out.println("lastKey: " + lastKey);
    }
}