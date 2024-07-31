package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Exercise7 {
    // Write a Java program to test if a map contains a mapping for the specified key.

    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 2);
        fruitMap.put("banana", 5);
        fruitMap.put("pear", 10);
        fruitMap.put("blueberry", 50);
        fruitMap.put("strawberry", 60);

        String keyToCheck = "apple";
        System.out.println("fruitMap contains " + keyToCheck + " key?");
        System.out.println(checkAKey(fruitMap, keyToCheck));

        String keyToCheck2 = "mango";
        System.out.println("fruitMap contains " + keyToCheck2 + " key?");
        System.out.println(checkAKey(fruitMap, keyToCheck2));
    }

    public static boolean checkAKey(Map<String, Integer> fruitMap, String keyToCheck) {
        return fruitMap.containsKey(keyToCheck);
    }
}