package session_16_collections_framework.challenge.hash_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercise7 {
    // Write a Java program to convert a hash set to an array.

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("blueberry");
        mySet.add("banana");
        mySet.add("pear");
        mySet.add("melon");
        mySet.add("mango");
        mySet.add("pineapple");

        System.out.println("Original hash set: ");
        displayHashSetElements(mySet);

        List<String> myArray = new ArrayList<>(mySet);

        System.out.println("The elements of the array");
        displayArrayElements(myArray);
    }

    public static void displayHashSetElements(HashSet<String> mySet) {
        for (String element : mySet) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void displayArrayElements(List<String> myArray) {
        for (String element : myArray) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}