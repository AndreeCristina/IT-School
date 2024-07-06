package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        /* 6. While Loop. Write a program that asks the user to enter numbers.The program should continue prompting
        the user until they enter -1. After they enter -1, print the sum of all numbers entered (excluding -1).*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number:");
        int number = sc.nextInt();
        int sumNumbers = 0;

        while (number != -1) {
            sumNumbers += number;

            System.out.println("Please, enter a number:");
            number = sc.nextInt();
        }
        System.out.println("Sum of number is: " + sumNumbers);
    }
}
