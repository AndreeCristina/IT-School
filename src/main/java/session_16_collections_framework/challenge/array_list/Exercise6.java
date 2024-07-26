package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Exercise6 {
    /* Write a Java program to remove the third element from an array list.  */

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(15);
        myList.add(21);
        myList.add(71);
        myList.add(11);
        myList.add(9);
        myList.add(1);

        System.out.println("The original list: ");
        displayList(myList);

        removeElement(myList, 3);

        System.out.println("The updated list is: ");
        displayList(myList);
    }

    public static void removeElement(List<Integer> myList, int whichElement) {
        myList.remove(whichElement - 1);
    }

    public static void displayList(List<Integer> myList) {
        for (int element : myList) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}