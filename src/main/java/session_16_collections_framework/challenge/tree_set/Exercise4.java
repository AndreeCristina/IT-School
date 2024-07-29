package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Exercise4 {
    // Write a Java program to create a reverse order view of the elements contained in a given tree set.

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(1);
        numbers.add(50);
        numbers.add(3);
        numbers.add(15);
        numbers.add(100);

        System.out.println("Original TreeSet numbers: ");
        displayTreeSet(numbers);

        TreeSet<Integer> numbers1 = new TreeSet<>(numbers.descendingSet());
        displayTreeSet(numbers1);
    }

    public static void displayTreeSet(TreeSet<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}