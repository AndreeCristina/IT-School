package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Exercise14 {
    // Write a Java program to retrieve and remove the first element of a tree set.

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(1);
        numbers.add(50);
        numbers.add(9);
        numbers.add(3);
        numbers.add(15);
        numbers.add(100);

        System.out.println("Original TreeSet: ");
        displayTreeSet(numbers);

        int firstElement = numbers.first();

        System.out.println("The first element of the TreeSet is: " + firstElement);

        numbers.remove(firstElement);

        System.out.println("TreeSet after removed the first element: ");
        displayTreeSet(numbers);
    }

    public static void displayTreeSet(TreeSet<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}