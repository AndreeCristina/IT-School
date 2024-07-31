package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Exercise8 {
    // Write a Java program to test if a map contains a mapping for the specified value.

    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 2);
        fruitMap.put("banana", 5);
        fruitMap.put("pear", 10);
        fruitMap.put("blueberry", 50);
        fruitMap.put("strawberry", 60);

        int valueToCheck = 2;
        System.out.println("fruitMap contains a mapping for the value: " + valueToCheck + " ?");
        System.out.println(checkAValue(fruitMap, valueToCheck));

        int valueToCheck2 = 100;
        System.out.println("fruitMap contains a mapping for the value: " + valueToCheck2 + " ?");
        System.out.println(checkAValue(fruitMap, valueToCheck2));
    }

    public static boolean checkAValue(Map<String, Integer> fruitMap, int valueToCheck) {
        return fruitMap.containsValue(valueToCheck);
    }
}