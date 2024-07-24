package session_15_oop_recap.challenge.loops_and_flow_control;

import java.util.Scanner;

public class Exercise5 {
    /* Do-While Loop: Write a program that prompts the user to enter a number and calculates the sum of
    the digits of that number using a do-while loop. Print out the sum of the digits.*/

    public static void main(String[] args) {
        final int TEN = 10;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter an integer number: ");
        int number = sc.nextInt();

        int copyNumber = number;
        int sumOfDigits = 0;

        do {
            sumOfDigits += number % TEN;
            number /= TEN;
        } while (number > 0);

        System.out.println("The sum of the digits of the number: " + copyNumber + " is: " + sumOfDigits);
    }
}