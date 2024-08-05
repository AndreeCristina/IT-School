package session_18.challenge;

import java.util.Arrays;
import java.util.List;

public class Exercise3 {
    // Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 8, 4, 7, 10, 4, 11, 21);

        int sum = myList.stream()
                .reduce(0, Integer::sum);

        System.out.println("The sum: " + sum);
    }
}