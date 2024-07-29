package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Exercise5 {
    // Write a Java program to get the first and last elements in a tree set.

    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("black");
        colors.add("white");
        colors.add("purple");
        colors.add("brown");

        String firstElement = colors.getFirst();
        String lastElement = colors.pollLast();

        System.out.println("The first elements of the TreeSet color is: " + firstElement);
        System.out.println("The last elements of the TreeSet color is: " + lastElement);
    }
}