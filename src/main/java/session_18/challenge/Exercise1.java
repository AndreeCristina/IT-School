package session_18.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    // Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(5, 8, 10, 7, 1, 9);

        List<Integer> evenNumbers = myList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even number: " + evenNumbers);
    }
}