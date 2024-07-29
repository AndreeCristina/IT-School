package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Exercise16 {
    //  Write a Java program to remove a given element from a tree set.

    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("black");
        colors.add("white");
        colors.add("purple");
        colors.add("brown");

        System.out.println("Original TreeSet: ");
        displayTreeSet(colors);

        colors.remove("purple");

        System.out.println("The elements after remove a specific element");
        displayTreeSet(colors);
    }

    public static void displayTreeSet(TreeSet<String> colors) {
        for (String color : colors) {
            System.out.print(color + " ");
        }

        System.out.println();
    }
}