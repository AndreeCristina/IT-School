package session_19.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise9 {
    /* Given a list of sentences, use flatMap to create a list of all words in all the sentences, and then find
    the most frequently occurring word. (Input: List<String> sentences = Arrays.asList("Hello World",
    "Hello Everyone", "Welcome to the World of Java");) */

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");

        Map<String, Long> wordFrequency = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String mostFrequentWord = wordFrequency.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Most frequent word: " + mostFrequentWord);
    }
}