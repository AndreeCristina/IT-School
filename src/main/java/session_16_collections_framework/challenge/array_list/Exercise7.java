package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Exercise7 {
    /* 7. Write a Java program to search an element in an array list. */

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("banana");
        fruits.add("pear");

        findFruit(fruits, "PEAR");
    }

    public static void findFruit(List<String> fruits, String fruitToFind) {
        if (fruits.contains(fruitToFind.toLowerCase())) {
            System.out.println("I find the fruit.");
        } else {
            System.out.println("I don't find the fruit");
        }
    }
}