package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Exercise18 {
    /* Write a Java program to test an array list is empty or not. */

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("blue");

        List<String> list2 = new ArrayList<>();

        System.out.println("Is list1 empty? " + list1.isEmpty() + ". It has the size: " + list1.size());
        System.out.println("Is list2 empty? " + list2.isEmpty() + ". It has the size: " + list2.size());
    }
}