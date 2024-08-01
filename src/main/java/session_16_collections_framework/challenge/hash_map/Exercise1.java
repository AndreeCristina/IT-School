package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    // Write a Java program to associate the specified value with the specified key in a HashMap.

    public static void main(String[] args) {
        Map<String, Integer> fruit = new HashMap<>();
        fruit.put("apple", 2);
        fruit.put("banana", 5);
        fruit.put("pear", 10);

        System.out.println(fruit.get("apple"));
    }
}