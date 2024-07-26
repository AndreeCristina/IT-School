package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Exercise12 {
    /* Write a Java program to extract a portion of an array list. */

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("pink");
        colors.add("brown");
        colors.add("purple");

        List<String> subList = colors.subList(1, 3);

        System.out.println("Original list:");
        displayList(colors);

        System.out.println("Sublist: ");
        displayList(subList);
    }

    public static void displayList(List<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}