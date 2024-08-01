package session_16_collections_framework.challenge.tree_map;

import java.util.TreeMap;

public class Exercise6 {
    // Write a Java program to delete all elements from a given Tree Map.

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("lion", 5);
        treeMap.put("zebra", 21);
        treeMap.put("giraffe", 6);
        treeMap.put("tiger", 3);

        System.out.println("treeMap before clear the map: " + treeMap);

        treeMap.clear();

        System.out.println("treeMap after clear the map: " + treeMap);
    }
}