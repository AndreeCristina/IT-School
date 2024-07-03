package session_9_arrays.challenge;

import java.util.Scanner;

public class Exercise4WithScanner {
    // 4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Please, enter a number: ");
            numbers[index] = sc.nextInt();
        }

        int countEven = 0, countOdd = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0) {
                ++countEven;
            } else {
                ++countOdd;
            }
        }

        System.out.println("Even number: " + countEven);
        System.out.println("Odd number: " + countOdd);

        sc.close();
    }
}
