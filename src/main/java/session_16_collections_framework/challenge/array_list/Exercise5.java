package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    /* Write a Java program to update specific array element by given element. */

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(8);
        array.add(15);
        array.add(78);
        array.add(105);

        System.out.println("The original list: ");
        displayList(array);

        updatedList(array, 1, 10);

        System.out.println("Updated list: ");
        displayList(array);
    }

    public static void displayList(List<Integer> myList) {
        for (int element : myList) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void updatedList(List<Integer> myList, int indexToUpdate, int newElement) {
        myList.set(indexToUpdate, newElement);
    }
}