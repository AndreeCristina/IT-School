package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Exercise5 {
    // Write a Java program to test a hash set is empty or not.

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

        System.out.println("Is my hash set empty? " + mySet.isEmpty());

        mySet.clear();

        System.out.println("Hash set after clear the elements: ");
        displayHashSetElements(mySet);

        System.out.println("Is my hash set empty? " + mySet.isEmpty());
    }

    public static void displayHashSetElements(HashSet<String> mySet) {
        for (String element : mySet) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}