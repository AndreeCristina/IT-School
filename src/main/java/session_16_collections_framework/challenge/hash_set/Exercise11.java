package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Exercise11 {
    // Write a Java program to compare two sets and retain elements which are same on both sets.

    public static void main(String[] args) {
        HashSet<String> mySet1 = new HashSet<>();
        mySet1.add("blueberry");
        mySet1.add("banana");
        mySet1.add("pear");

        HashSet<String> mySet2 = new HashSet<>();
        mySet2.add("blueberry");
        mySet2.add("banana");
        mySet2.add("pear");
        mySet2.add("melon");
        mySet2.add("mango");
        mySet2.add("pineapple");

        mySet2.retainAll(mySet1);
        System.out.println("Intersection of mySet1 and mySet2: " + mySet2);
    }
}