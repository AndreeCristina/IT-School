package session_20.practice;

import java.util.*;

public class Problem3 {
    /* Given a list of random numbers, use Java streams to find the smallest and largest numbers in the list.
    Do not use the traditional loop-based method for this.*/

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(3);

        Optional<Integer> min = list.stream().min(Integer::compareTo);
        min.ifPresent(System.out::println);

        Optional<Integer> max = list.stream().max(Integer::compareTo);
        max.ifPresent(maxValue -> System.out.println(maxValue));
    }
}