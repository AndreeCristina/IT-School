package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Exercise12 {
    // Write a Java program to get the element in a tree set which is strictly greater (than or equal) to the given element.

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

        int targetNo = 9;

        Integer result = numbers.higher(targetNo);

        System.out.println("Element strictly greater than " + targetNo + " is: " + result);
    }

    public static void displayTreeSet(TreeSet<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}