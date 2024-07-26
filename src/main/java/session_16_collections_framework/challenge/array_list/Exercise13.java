package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise13 {
    /* Write a Java program to compare two array lists. */

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(15);
        list1.add(21);
        list1.add(71);
        list1.add(11);
        list1.add(9);
        list1.add(1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(9);
        list2.add(11);
        list2.add(71);
        list2.add(21);
        list2.add(15);
        list2.add(5);

        boolean isEqual = list1.equals(list2);
        System.out.println("Is the list1 equal with list2? " + isEqual);

        Collections.sort(list1);
        Collections.sort(list2);
        boolean isEquivalent = list1.equals(list2);
        System.out.println("Is the list1 equivalent with the list2? " + isEquivalent);
    }
}