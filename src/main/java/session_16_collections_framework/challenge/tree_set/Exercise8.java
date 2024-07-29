package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Exercise8 {
    // Write a Java program to compare two tree sets.

    public static void main(String[] args) {
        TreeSet<String> colors1 = new TreeSet<>();
        colors1.add("red");
        colors1.add("pink");
        colors1.add("blue");
        colors1.add("black");
        colors1.add("white");
        colors1.add("purple");

        TreeSet<String> colors2 = new TreeSet<>();
        colors2.add("black");
        colors2.add("white");
        colors2.add("purple");

        boolean isEqual = colors1.equals(colors2);
        System.out.println("colors1 is equal with colors2? " + isEqual);

        boolean isSubset = colors1.containsAll(colors2);
        System.out.println("colors2 is a subset of colors1? " + isSubset);

        boolean isSubset2 = colors2.containsAll(colors1);
        System.out.println("colors1 is a subset of colors2? " + isSubset2);

        colors1.retainAll(colors2);
        System.out.println("Intersection of colors1 and colors2");
        displayTreeSet(colors1);

        colors2.add("yellow");

        colors2.removeAll(colors1);
        System.out.println("Difference of colors1 and colors2");
        displayTreeSet(colors2);
    }

    public static void displayTreeSet(TreeSet<String> colors) {
        for (String color : colors) {
            System.out.print(color + " ");
        }

        System.out.println();
    }
}