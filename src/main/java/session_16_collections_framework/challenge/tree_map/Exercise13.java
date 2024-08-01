package session_16_collections_framework.challenge.tree_map;

import java.util.SortedMap;
import java.util.TreeMap;

public class Exercise13 {
    /* Write a Java program to get the portion of a map whose keys are strictly less than a given key. */

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(21, "apple");
        treeMap.put(2, "banana");
        treeMap.put(18, "pear");
        treeMap.put(8, "orange");

        int key = 21;

        SortedMap<Integer, String> subMap = treeMap.headMap(key);

        System.out.println("Map portion with keys less than " + key + ": " + subMap);
    }
}