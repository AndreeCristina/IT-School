package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
    // Write a Java program to remove all the mappings from a map.

    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 2);
        fruitMap.put("banana", 5);
        fruitMap.put("pear", 10);
        fruitMap.put("blueberry", 50);
        fruitMap.put("strawberry", 60);

        System.out.println("Original fruit map:" + fruitMap);

        fruitMap.clear();

        System.out.println("Fruit map after remove all the mapping. " + fruitMap);
    }
}