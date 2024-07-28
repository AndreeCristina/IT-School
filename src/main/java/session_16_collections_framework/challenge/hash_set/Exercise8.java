package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;
import java.util.TreeSet;

public class Exercise8 {
    // Write a Java program to convert a hash set to a tree set.

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("blueberry");
        mySet.add("banana");
        mySet.add("pear");
        mySet.add("melon");
        mySet.add("mango");
        mySet.add("pineapple");

        System.out.println("HashSet elements: ");
        displayHashSetElements(mySet);

        TreeSet<String> myTreeSet = new TreeSet<>(mySet);

        System.out.println("TreeSet elements: ");
        displayTreeSetElements(myTreeSet);
    }

    public static void displayHashSetElements(HashSet<String> mySet) {
        for (String element : mySet) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void displayTreeSetElements(TreeSet<String> myTreeSet) {
        for (String element : myTreeSet) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}