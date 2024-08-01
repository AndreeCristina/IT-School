package session_16_collections_framework.challenge.tree_map;

import java.util.Map;
import java.util.TreeMap;

public class Exercise11 {
    /* Write a Java program to get a key-value mapping associated with the greatest key less
    than or equal to the given key.  */

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(21, "apple");
        treeMap.put(2, "banana");
        treeMap.put(18, "pear");
        treeMap.put(8, "orange");

        int key = 9;

        Map.Entry<Integer, String> floorEntry = treeMap.floorEntry(key);

        if (floorEntry != null) {
            System.out.println("Key-value: " + floorEntry.getKey() + " - " + floorEntry.getValue());
        } else {
            System.out.println("No key less than or equal to " + key);
        }
    }
}