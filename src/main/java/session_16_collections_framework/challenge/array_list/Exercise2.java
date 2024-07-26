package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    /* 2. Write a Java program to iterate through all elements in an array list. */

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("banana");
        fruits.add("pear");

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}