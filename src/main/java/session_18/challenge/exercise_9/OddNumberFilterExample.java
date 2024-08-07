package session_18.challenge.exercise_9;

import java.util.Arrays;
import java.util.List;

public class OddNumberFilterExample {
    /* Create a functional interface that takes a list of integers and returns a list of integers. Use a lambda
    expression to implement this interface, such that it returns a list containing only the odd numbers from
    the original list. */

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 5, 8, 7, 10, 9, 3, 2);

        OddNumberFilter oddNumberFilter = list -> list.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        List<Integer> oddNumbers = oddNumberFilter.filter(inputList);
        System.out.println(oddNumbers);
    }
}