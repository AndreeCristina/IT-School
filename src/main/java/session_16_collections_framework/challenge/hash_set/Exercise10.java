package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Exercise10 {
    // Write a Java program to compare two hash set.

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

        boolean isEquals = mySet1.equals(mySet2);
        System.out.println("Is this two hash set equals? " + isEquals);

        boolean isSubset = mySet2.containsAll(mySet1);
        System.out.println("mySet1 is a subset of mySet2: " + isSubset);

        mySet1.add("apple");
        mySet1.add("plum");

//        mySet1.retainAll(mySet2);
//        System.out.println("Intersection of mySet1 and mySet2: " + mySet1);

        mySet1.removeAll(mySet2);
        System.out.println("Difference of mySet1 and mySet2: " + mySet1);
    }
}