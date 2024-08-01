package session_16_collections_framework.challenge.tree_map;

import java.util.TreeMap;

public class Exercise3 {
    // Write a Java program to search a key in a Tree Map.

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("lion", 5);
        treeMap.put("zebra", 21);
        treeMap.put("giraffe", 6);
        treeMap.put("tiger", 3);

        String keyToFind = "lion";
        System.out.println("Does the treeMap contain the key: " + keyToFind + "? ");
        System.out.println(itContainsTheKey(treeMap, keyToFind));

        keyToFind = "hyena";
        System.out.println("Does the treeMap contain the key: " + keyToFind + "? ");
        System.out.println(itContainsTheKey(treeMap, keyToFind));
    }

    public static boolean itContainsTheKey(TreeMap<String, Integer> treeMap, String keyToFind) {
        return treeMap.containsKey(keyToFind);
    }
}