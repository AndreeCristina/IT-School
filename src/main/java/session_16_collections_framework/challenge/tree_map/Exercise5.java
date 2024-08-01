package session_16_collections_framework.challenge.tree_map;

import java.util.Set;
import java.util.TreeMap;

public class Exercise5 {
    // Write a Java program to get all keys from the given a Tree Map.

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("lion", 5);
        treeMap.put("zebra", 21);
        treeMap.put("giraffe", 6);
        treeMap.put("tiger", 3);

        Set<String> keys = treeMap.keySet();

        System.out.println("Keys in the treeMap: " + keys);
    }
}