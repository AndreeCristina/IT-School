package session_15_oop_recap.challenge.loops_and_flow_control;

import java.util.Scanner;

public class Exercise7 {
    /* Continue Statement: Write a program that prompts the user to enter a series of numbers and
    calculates the sum of the even numbers using a continue statement to skip over the odd numbers. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumEvenNumber = 0;
        while (true) {
            System.out.println("Please, enter a number: (0 is to EXIT)");
            int number = sc.nextInt();

            if (number == 0) {
                break;
            } else if (number % 2 != 0) {
                continue;
            }
            sumEvenNumber += number;

        }

        System.out.println("The sum of the even number is: " + sumEvenNumber);
    }
}