package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise11 {
    // Write a Java program to get a set view of the keys contained in this map.

    public static void main(String[] args) {
        Map<String, Integer> carMap = new HashMap<>();
        carMap.put("BMW", 2);
        carMap.put("Mercedes", 5);
        carMap.put("Renault", 10);
        carMap.put("Volkswagen", 4);

        Set<String> keys = carMap.keySet();

        for (String key : keys) {
            System.out.println(key);
        }
    }
}