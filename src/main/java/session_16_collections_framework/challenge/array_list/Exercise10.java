package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise10 {
    /* Write a Java program to shuffle elements in an array list. */

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("lemon");
        fruits.add("strawberry");
        fruits.add("blueberry");

        System.out.println("Original list: ");
        displayArrayList(fruits);

        Collections.shuffle(fruits);

        System.out.println("List after shuffle: ");
        displayArrayList(fruits);
    }

    public static void displayArrayList(List<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}