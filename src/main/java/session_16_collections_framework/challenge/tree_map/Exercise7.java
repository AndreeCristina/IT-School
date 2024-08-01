package session_16_collections_framework.challenge.tree_map;

import java.util.Comparator;
import java.util.TreeMap;

public class Exercise7 {
    // Write a Java program to sort keys in Tree Map by using comparator.

    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.reverseOrder();

        TreeMap<String, Integer> treeMap = new TreeMap<>(comparator);
        treeMap.put("lion", 5);
        treeMap.put("zebra", 21);
        treeMap.put("giraffe", 6);
        treeMap.put("tiger", 3);

        for (String key : treeMap.keySet()) {
            System.out.println(key);
        }
    }
}