package session_15_oop_recap.challenge.loops_and_flow_control;

import java.util.Scanner;

public class Exercise3 {
    /* For Loop: Write a program that prompts the user to enter a number and calculates the factorial of that
    number using a for loop. Print out the factorial of the number.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}