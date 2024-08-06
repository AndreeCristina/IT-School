package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class ComplexStreamExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Alice");

        // filter names that start with "J"
        // make uppercase all the names
        // sort names
        // collect result into new list

        List<String> resultList = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(resultList);
    }
}