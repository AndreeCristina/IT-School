package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Exercise1 {
    /*  Write a Java program to create a new array list, add some colors (string) and print out the collection. */

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("pink");

        for (String color : colors) {
            System.out.print(color + " ");
        }
    }
}