package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise9 {
    // Write a Java program to create a set view of the mappings contained in a map.

    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 2);
        fruitMap.put("banana", 5);
        fruitMap.put("pear", 10);
        fruitMap.put("blueberry", 50);
        fruitMap.put("strawberry", 60);

        Set<Map.Entry<String, Integer>> entrySet = fruitMap.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}