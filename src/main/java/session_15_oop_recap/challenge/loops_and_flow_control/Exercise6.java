package session_15_oop_recap.challenge.loops_and_flow_control;

import java.util.Scanner;

public class Exercise6 {
    /* Break Statement: Write a program that prompts the user to enter a series of numbers until they
    enter a negative number. Calculate the sum of the positive numbers using a break statement to exit
    the loop when a negative number is entered. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOfElements = 0;

        do {
            System.out.println("Please, enter a number: ");
            int number = sc.nextInt();

            if (number < 0) {
                break;
            }

            sumOfElements += number;
        } while (true);

        System.out.println("The sum of the positive elements is: " + sumOfElements);
    }
}