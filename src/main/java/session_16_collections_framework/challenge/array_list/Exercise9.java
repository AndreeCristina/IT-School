package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Exercise9 {
    /* Write a Java program to copy one array list into another. */

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("banana");
        fruits.add("pear");

        List<String> otherFruits = new ArrayList<>();
        otherFruits.add("lemon");
        otherFruits.add("strawberry");
        otherFruits.add("blueberry");

        System.out.println("fruits arrayList: ");
        displayArrayList(fruits);

        System.out.println("otherFruits arrayList: ");
        displayArrayList(otherFruits);

        concatenatedArrays(fruits, otherFruits);

        System.out.println("ArrayList after concatenated: ");
        displayArrayList(fruits);
    }

    public static void displayArrayList(List<String> myList) {
        for (String element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void concatenatedArrays(List<String> fruits, List<String> otherFruits) {
        fruits.addAll(otherFruits);
    }
}