package session_16_collections_framework.challenge.tree_map;

import java.util.TreeMap;

public class Exercise2 {
    // Write a Java program to copy a Tree Map content to another Tree Map.

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("lion", 5);
        treeMap.put("zebra", 21);
        treeMap.put("giraffe", 6);
        treeMap.put("tiger", 3);

        TreeMap<String, Integer> copyTreeMap = new TreeMap<>(treeMap);

        System.out.println("Original treeMap: " + treeMap);
        System.out.println("Copied treeMap: " + copyTreeMap);
    }
}