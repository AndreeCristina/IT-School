package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Exercise3 {
    // Write a Java program to add all the elements of a specified tree set to another tree set.

    public static void main(String[] args) {
        TreeSet<String> colors1 = new TreeSet<>();
        colors1.add("red");
        colors1.add("pink");
        colors1.add("blue");
        colors1.add("black");
        colors1.add("white");
        colors1.add("purple");
        colors1.add("brown");
        colors1.add("green");

        System.out.println("The elements of TreeSet colors1: ");
        displayTreeSet(colors1);

        TreeSet<String> colors2 = new TreeSet<>(colors1);

        System.out.println("The elements of TreeSet colors2: ");
        displayTreeSet(colors2);
    }

    public static void displayTreeSet(TreeSet<String> colors) {
        for (String color : colors) {
            System.out.print(color + " ");
        }

        System.out.println();
    }
}