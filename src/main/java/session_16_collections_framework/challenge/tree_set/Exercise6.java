package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Exercise6 {
    // Write a Java program to clone a tree set list to another tree set.

    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("black");
        colors.add("white");
        colors.add("purple");
        colors.add("brown");

        System.out.println("Elements of colors: ");
        displayTreeSet(colors);

        TreeSet<String> clonedColors = new TreeSet<>(colors);

        System.out.println("Elements of clonedColors: ");
        displayTreeSet(clonedColors);
    }

    public static void displayTreeSet(TreeSet<String> colors) {
        for (String color : colors) {
            System.out.print(color + " ");
        }

        System.out.println();
    }
}