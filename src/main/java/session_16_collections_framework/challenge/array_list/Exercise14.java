package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise14 {
    /* Write a Java program of swap two elements in an array list. */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(21);
        list.add(71);
        list.add(11);
        list.add(9);
        list.add(1);

        System.out.println("Original list: ");
        displayList(list);

        swapTwoElements(list, 1, 5);

        System.out.println("The list after swap two elements: ");
        displayList(list);
    }

    public static void swapTwoElements(List<Integer> list, int index1, int index2) {
        Collections.swap(list, index1, index2);
    }

    public static void displayList(List<Integer> myList) {
        for (int element : myList) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}