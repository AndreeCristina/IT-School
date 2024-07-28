package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Exercise1 {
    /* Write a Java program to append the specified element to the end of a hash set.
     (The concept of "appending" an element to the "end" doesn't apply to HashSets.
     HashSets don't maintain a specific order of elements.) */

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("blueberry");
        mySet.add("banana");
        mySet.add("pear");
        mySet.add("melon");

        System.out.println("HashSet elements: " + mySet);
    }
}