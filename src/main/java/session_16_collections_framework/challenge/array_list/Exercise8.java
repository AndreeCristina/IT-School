package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise8 {
    /* Write a Java program to sort a given array list. */
    public static void main(String[] args) {
        List<Integer> myArray = new ArrayList<>();
        myArray.add(5);
        myArray.add(15);
        myArray.add(21);
        myArray.add(24);
        myArray.add(1);
        myArray.add(6);

        System.out.println("The original arrayList: ");
        displayArrayList(myArray);

        sortAnArray(myArray);

        System.out.println("The sorted arrayList: ");
        displayArrayList(myArray);
    }

    public static void sortAnArray(List<Integer> myArray) {
        Collections.sort(myArray);
    }

    public static void displayArrayList(List<Integer> myArray) {
        for (int element : myArray) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}