package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Exercise4 {
    // Write a Java program to empty a hash set.

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

        mySet.clear();

        System.out.println("Hash set after clear the elements: ");
        displayHashSetElements(mySet);
    }

    public static void displayHashSetElements(HashSet<String> mySet) {
        for (String element : mySet) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}