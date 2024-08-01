package session_16_collections_framework.challenge.tree_map;

import java.util.TreeMap;

public class Exercise4 {
    // Write a Java program to search a value in a Tree Map.

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("lion", 5);
        treeMap.put("zebra", 21);
        treeMap.put("giraffe", 6);
        treeMap.put("tiger", 3);

        searchAValue(treeMap, 21);
        searchAValue(treeMap, 1);
    }

    public static void searchAValue(TreeMap<String, Integer> treeMap, Integer value) {
        if (treeMap.containsValue(value)) {
            System.out.println("The value " + value + " is in the treeMap.");
        } else {
            System.out.println("Value not found.");
        }
    }
}