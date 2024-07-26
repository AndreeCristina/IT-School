package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise11 {
    /* Write a Java program to reverse elements in an array list. */

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(8);
        array.add(15);
        array.add(78);
        array.add(105);

        System.out.println("Original array list:");
        displayArrayList(array);

        Collections.reverse(array);

        System.out.println("Reversed array after used the function reverse from Collections: ");
        displayArrayList(array);

        List<Integer> reversedList = new ArrayList<>();

        reverseList(array, reversedList);

        System.out.println("Reversed array after used a own method: ");
        displayArrayList(reversedList);
    }

    public static void displayArrayList(List<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void reverseList(List<Integer> list, List<Integer> reversedList) {
        for (int index = list.size() - 1; index >= 0; index--) {
            reversedList.add(list.get(index));
        }
    }
}