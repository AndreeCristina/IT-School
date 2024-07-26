package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
    /* Write a Java program to retrieve an element (at a specified index) from a given array list. */

    public static void main(String[] args) {
        final int MAX_LENGTH = 10;

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> myList = new ArrayList<>();

        for (int index = 0; index < MAX_LENGTH; index++) {
            System.out.println("Please, enter an element:");
            myList.add(sc.nextInt());
        }

        System.out.println("Please, enter an index:");
        int myIndex = sc.nextInt();

        if (myIndex < 0 || myIndex > MAX_LENGTH) {
            System.out.println("The index is not valid.");
        } else {
            int specialElement = myList.get(5);
            System.out.println("The element from index " + myIndex + " is: " + myList.get(myIndex));
        }
    }
}