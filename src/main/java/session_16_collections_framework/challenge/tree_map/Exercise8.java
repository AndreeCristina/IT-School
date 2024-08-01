package session_16_collections_framework.challenge.tree_map;

import java.util.TreeMap;

public class Exercise8 {
    /* Write a Java program to get a key-value mapping associated with the greatest key
    and the least key in a map. */

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("lion", 5);
        treeMap.put("zebra", 21);
        treeMap.put("giraffe", 6);
        treeMap.put("tiger", 3);

        String greatestKey = treeMap.lastKey();
        Integer valueForGreatestKey = treeMap.get(greatestKey);
        System.out.println("greatestKey: " + greatestKey + " valueForGreatestKey: " + valueForGreatestKey);

        String leastKey = treeMap.firstKey();
        Integer valueForLeastKey = treeMap.get(leastKey);
        System.out.println("leastKey: " + leastKey + " valueForLeastKey: " + valueForLeastKey);
    }
}