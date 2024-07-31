package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Exercise6 {
    // Write a Java program to get a shallow copy of a HashMap instance.

    public static void main(String[] args) {
        Map<String, Integer> carMap = new HashMap<>();
        carMap.put("BMW", 2);
        carMap.put("Mercedes", 5);
        carMap.put("Renault", 10);
        carMap.put("Volkswagen", 4);

        Map<String, Integer> copyCarMap = new HashMap<>(carMap);

        System.out.println("Original map: " + carMap);
        System.out.println("Copied map: " + copyCarMap);
    }
}