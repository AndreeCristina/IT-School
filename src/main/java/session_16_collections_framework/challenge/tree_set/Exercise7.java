package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Exercise7 {
    // Write a Java program to get the number of elements in a tree set.

    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("black");
        colors.add("white");
        colors.add("purple");
        colors.add("brown");

        int elementsNo = colors.size();

        System.out.println("The TreeSet has " + elementsNo + " elements.");
    }
}