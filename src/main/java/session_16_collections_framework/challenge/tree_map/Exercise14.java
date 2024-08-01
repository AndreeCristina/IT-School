package session_16_collections_framework.challenge.tree_map;

import java.util.SortedMap;
import java.util.TreeMap;

public class Exercise14 {
    /*  Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true)
     a given key. */

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(21, "apple");
        treeMap.put(2, "banana");
        treeMap.put(18, "pear");
        treeMap.put(8, "orange");

        int key = 7;
        boolean inclusive = true;

        SortedMap<Integer, String> portionMap = treeMap.headMap(key, inclusive);

        System.out.println("Portion of the map: " + portionMap);
    }
}