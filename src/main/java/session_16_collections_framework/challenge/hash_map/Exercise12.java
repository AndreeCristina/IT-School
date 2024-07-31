package session_16_collections_framework.challenge.hash_map;

import java.util.*;

public class Exercise12 {
    // Write a Java program to get a collection view of the values contained in this map.

    public static void main(String[] args) {
        Map<String, Integer> carMap = new HashMap<>();
        carMap.put("BMW", 2);
        carMap.put("Mercedes", 5);
        carMap.put("Renault", 10);
        carMap.put("Volkswagen", 4);

        Collection<Integer> values = carMap.values();

        for (int value : values) {
            System.out.println(value);
        }
    }
}