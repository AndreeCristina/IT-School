package session_16_collections_framework.challenge.tree_map;

import java.util.TreeMap;

public class Exercise1 {
    // Write a Java program to associate the specified value with the specified key in a Tree Map.

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("lion", 5);
        treeMap.put("zebra", 21);
        treeMap.put("giraffe", 6);
        treeMap.put("tiger", 3);

        treeMap.forEach((k, v) -> System.out.println("key: " + k + " value " + v));
    }
}