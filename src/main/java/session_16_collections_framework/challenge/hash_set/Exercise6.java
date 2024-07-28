package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Exercise6 {
    // Write a Java program to clone a hash set to another hash set.

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

        HashSet<String> myClonedSet = new HashSet<>();

        System.out.println("Original of the hash set cloned: ");
        displayHashSetElements(myClonedSet);

        myClonedSet.addAll(mySet);

        System.out.println("The second hashSet after cloned the first hashSet: ");
        displayHashSetElements(myClonedSet);
    }

    public static void displayHashSetElements(HashSet<String> mySet) {
        for (String element : mySet) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}