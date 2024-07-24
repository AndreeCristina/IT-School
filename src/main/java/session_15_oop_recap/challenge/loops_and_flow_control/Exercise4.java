package session_15_oop_recap.challenge.loops_and_flow_control;

import java.util.Scanner;

public class Exercise4 {
    /* While Loop: Write a program that prompts the user to enter a number and checks if it is a prime
    number using a while loop. Print out a message indicating whether the number is prime or not.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number:");
        int number = sc.nextInt();

        if (number == 2) {
            System.out.println("The number is prim.");
        } else if (number < 2) {
            System.out.println("The number isn't prim.");
        } else if (number % 2 == 0) {
            System.out.println("The number isn't prim.");
        } else {
            boolean isPrim = true;
            int d = 3;
            while ((d * d) <= number && isPrim) {
                if (number % d == 0) {
                    isPrim = false;
                }
                d += 2;
            }
            if (!isPrim) {
                System.out.println("The number isn't prim.");
            } else {
                System.out.println("The number is prim.");
            }
        }
    }
}