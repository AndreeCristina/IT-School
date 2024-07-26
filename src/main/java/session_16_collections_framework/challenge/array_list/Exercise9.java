package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Exercise9 {
    /* Write a Java program to copy one array list into another. */

    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<>();
        sourceList.add("apple");
        sourceList.add("pineapple");
        sourceList.add("banana");
        sourceList.add("pear");

        System.out.println("The element from the source list: ");
        displayArrayList(sourceList);

        List<String> targetList = new ArrayList<>();

        System.out.println("Target list before copy the element from the source list: ");
        displayArrayList(targetList);

        copiedArrays(sourceList, targetList);

        System.out.println("Target list with the element from the source list");
        displayArrayList(targetList);
    }

    public static void displayArrayList(List<String> myList) {
        for (String element : myList) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void copiedArrays(List<String> sourceList, List<String> targetList) {
        targetList.addAll(sourceList);
    }
}