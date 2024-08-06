package session_18.challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise2 {
    // Write a program that uses lambda expressions to sort a list of strings in alphabetical order.

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("banana", "kiwi", "apple", "pear", "strawberry");

        Collections.sort(myList, (elm1, elm2) -> elm1.compareToIgnoreCase(elm2));

        System.out.println("MyList alphabetical order: " + myList);
    }
}