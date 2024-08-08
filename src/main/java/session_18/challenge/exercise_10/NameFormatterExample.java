package session_18.challenge.exercise_10;

import java.util.Arrays;
import java.util.List;

public class NameFormatterExample {
    /* Create a functional interface with a method that takes a List<String> representing first names and
    returns a List<String> of those names formatted in uppercase. Implement it using a lambda expression.*/

    public static void main(String[] args) {
        List<String> firstName = Arrays.asList("John", "Jennifer", "Alina", "Bill", "Bob", "Charlie");

        NameFormatter formatter = names -> names.stream()
                .map(name -> name.toUpperCase())
                .toList();

        List<String> upperCaseNames = formatter.formatNames(firstName);
        System.out.println(upperCaseNames);
    }
}