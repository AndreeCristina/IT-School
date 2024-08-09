package session_19.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise2 {
    /* Using a list of strings, find and print the longest string using Java streams.
     (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)*/

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        String longestString = strings.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(longestString);
    }
}