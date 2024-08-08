package session_19.challenge;

import java.util.Arrays;
import java.util.List;

public class Exercise10 {
    /* Using streams, find the total number of characters across a list of strings excluding whitespace characters.
     (Input: List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");) */

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");

        long totalCharacters = strings.stream()
                .flatMapToInt(String::chars)
                .filter(Character::isLetterOrDigit)
                .count();

        System.out.println("Total characters: " + totalCharacters);
    }
}