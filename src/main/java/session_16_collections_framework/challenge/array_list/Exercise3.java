package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Exercise3 {
    /* 3. Write a Java program to insert an element into the array list at the first position. */
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("banana");
        fruits.add("pear");

        fruits.addFirst("orange");

        System.out.println("The ArrayList after insert an element at the first position: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}