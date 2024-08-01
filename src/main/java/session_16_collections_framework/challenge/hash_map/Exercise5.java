package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Exercise5 {
    // Write a Java program to check whether a map contains key-value mappings (empty) or not.

    public static void main(String[] args) {
        Map<String, Integer> fruitMap1 = new HashMap<>();
        Map<String, Integer> fruitMap2 = new HashMap<>();
        fruitMap2.put("apple", 2);
        fruitMap2.put("banana", 5);
        fruitMap2.put("pear", 10);
        fruitMap2.put("blueberry", 50);
        fruitMap2.put("strawberry", 60);

        System.out.println("Is fruitMap1 empty?: " + fruitMap1.isEmpty());
        System.out.println("Is fruitMap2 empty?: " + fruitMap2.isEmpty());
    }
}