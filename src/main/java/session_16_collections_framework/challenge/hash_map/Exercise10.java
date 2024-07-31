package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Exercise10 {
    // Write a Java program to get the value of a specified key in a map.

    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 2);
        fruitMap.put("banana", 5);
        fruitMap.put("pear", 10);
        fruitMap.put("blueberry", 50);
        fruitMap.put("strawberry", 60);

        getTheValue(fruitMap, "strawberry");
        getTheValue(fruitMap, "mango");
    }

    public static void getTheValue(Map<String, Integer> fruitMap, String key) {
        Integer value = fruitMap.get(key);

        if (value != null) {
            System.out.println("Value for key " + key + " is: " + value);
        } else {
            System.out.println(key + " isn't in the map.");
        }
    }
}