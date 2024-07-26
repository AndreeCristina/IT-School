package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class exercise16 {
    /* Write a Java program to clone an array list to another array list. */

    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<>();
        sourceList.add("apple");
        sourceList.add("pineapple");
        sourceList.add("banana");
        sourceList.add("pear");

        List<String> targetList = new ArrayList<>(sourceList);

        System.out.println("Source list:");
        displayArrayList(sourceList);

        System.out.println("Target list:");
        displayArrayList(targetList);
    }

    public static void displayArrayList(List<String> myList) {
        for (String element : myList) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}