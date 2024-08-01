package session_16_collections_framework.challenge.tree_map;

import java.util.Map;
import java.util.TreeMap;

public class Exercise16 {
    /*  Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key.
     Return null if there is no such key.*/

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(21, "apple");
        treeMap.put(2, "banana");
        treeMap.put(18, "pear");
        treeMap.put(8, "orange");

        int key = 8;

        Map.Entry<Integer, String> entry = treeMap.lowerEntry(key);

        if (entry != null) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        } else {
            System.out.println("No such key exists.");
        }
    }
}