package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
    // Write a Java program to count the number of key-value (size) mappings in a map

    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 2);
        fruitMap.put("banana", 5);
        fruitMap.put("pear", 10);
        fruitMap.put("blueberry", 50);
        fruitMap.put("strawberry", 60);

        int size = fruitMap.size();

        System.out.println("Number of key-value pairs: " + size);
    }
}