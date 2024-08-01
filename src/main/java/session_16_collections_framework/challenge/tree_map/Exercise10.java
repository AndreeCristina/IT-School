package session_16_collections_framework.challenge.tree_map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Exercise10 {
    // Write a Java program to get a reverse order view of the keys contained in a given map.

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(21, "apple");
        treeMap.put(2, "banana");
        treeMap.put(18, "pear");
        treeMap.put(8, "orange");

        System.out.println("Original " + treeMap.keySet());

        Set<Integer> keys = treeMap.keySet();

        TreeSet<Integer> reversedTreeMap = new TreeSet<>(Comparator.reverseOrder());
        reversedTreeMap.addAll(keys);

        System.out.println("Reverse order key: " + reversedTreeMap);
    }
}