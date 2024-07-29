package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Exercise10 {
    // Write a Java program to get the element in a tree set which is greater than or equal to the given element.

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

        int targetNo = 7;

        Integer result = numbers.ceiling(targetNo);

        System.out.println("The element grater or equal with the target number is: " + result);
    }

    public static void displayTreeSet(TreeSet<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}