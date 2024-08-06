package session_18.challenge.exercise_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMaxValueFinder {
    /* Create a functional interface that takes a list of integers and returns the maximum value from the list.
    Implement this interface using a lambda expression. Ensure your lambda correctly handles an empty list case. */

    public static void main(String[] args) {
        MaxValueFinder maxFinder = numbers -> numbers.isEmpty() ? Integer.MIN_VALUE : Collections.max(numbers);

        List<Integer> myIntegerList = Arrays.asList(1, 10, 7, 5, 21, 50, 4, 60);
        List<Integer> emptyList = List.of();

        System.out.println(maxFinder.findMaxValue(myIntegerList));
        System.out.println(maxFinder.findMaxValue(emptyList));
    }
}