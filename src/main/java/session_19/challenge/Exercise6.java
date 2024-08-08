package session_19.challenge;

import java.util.Arrays;

public class Exercise6 {
    /* Create a stream of integers from an array and find the sum of all integers using the reduce method.
    (Input: Integer[] numbers = {1, 2, 3, 4, 5};) */

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(numbers)
                .reduce(0, (a, b) -> (a + b));

        System.out.println(sum);
    }
}