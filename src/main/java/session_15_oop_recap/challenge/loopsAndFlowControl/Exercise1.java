package session_15_oop_recap.challenge.loopsAndFlowControl;

import java.util.Scanner;

public class Exercise1 {
    /* If-Else Statement: Write a program that prompts the user to enter a number and checks if it is
    even or odd using an if-else statement. Print out a message indicating whether the number is even or odd. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}