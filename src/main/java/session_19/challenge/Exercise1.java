package session_19.challenge;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    /* Given a list of integers, create a new list that contains only the even numbers. Use streams to
       achieve this. (Input: List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);)*/

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println(evenNumbers);
    }
}