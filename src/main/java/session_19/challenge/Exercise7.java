package session_19.challenge;

import java.util.Arrays;
import java.util.List;

public class Exercise7 {
    // Use streams to transform a list of strings into a list of their respective lengths.
    // (Input: List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");)

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");

        List<Integer> lengths = strings.stream()
                .map(String::length)
                .toList();

        System.out.println(lengths);
    }
}