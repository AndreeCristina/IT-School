package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    // Write a Java program to copy all the mappings from the specified map to another map.

    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 2);
        fruitMap.put("banana", 5);
        fruitMap.put("pear", 10);
        fruitMap.put("blueberry", 50);
        fruitMap.put("strawberry", 60);

        Map<String, Integer> fruitMap2 = new HashMap<>(fruitMap);

        System.out.println("Original fruit map: " + fruitMap);
        System.out.println("Copied map: " + fruitMap2);
    }
}