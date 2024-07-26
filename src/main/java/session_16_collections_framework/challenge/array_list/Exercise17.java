package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Exercise17 {
    /* Write a Java program to empty an array list. */

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("pineapple");
        list1.add("banana");
        list1.add("pear");
        list1.add("lemon");
        list1.add("strawberry");
        list1.add("blueberry");

        List<String> list2 = new ArrayList<>(list1);

        System.out.println("The list1 before removed elements: ");
        displayArrayList(list1);

        list1.removeAll(list1);

        System.out.println("The list1 after removed elements: ");
        displayArrayList(list1);

        System.out.println("The list2 before removed elements: ");
        displayArrayList(list2);

        list2.clear();

        System.out.println("The list2 after removed elements: ");
        displayArrayList(list2);

    }

    public static void displayArrayList(List<String> myList) {
        for (String element : myList) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}