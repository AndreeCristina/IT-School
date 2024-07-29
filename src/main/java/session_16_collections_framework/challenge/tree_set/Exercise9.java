package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Exercise9 {
    //  Write a Java program to find the numbers less than 7 in a tree set.

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(1);
        numbers.add(50);
        numbers.add(3);
        numbers.add(15);
        numbers.add(100);

        System.out.println("Original TreeSet: ");
        displayTreeSet(numbers);

        TreeSet<Integer> numbersLess7 = new TreeSet<>(numbers.headSet(7));

        System.out.println("The elements of the TreeSet numbersLess7: ");
        displayTreeSet(numbersLess7);
    }

    public static void displayTreeSet(TreeSet<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}