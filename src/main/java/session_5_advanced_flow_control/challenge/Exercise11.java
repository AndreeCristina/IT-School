package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        /* 11. Break Statement. Write a program that prompts the user to enter numbers.Calculate the average of these numbers.
        If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.*/
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        int counter = 0;

        while (true) {
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            if (number != 0) {
                ++counter;
                sum += number;
            } else {
                break;
            }
        }

        double average = sum / counter;
        if (counter > 0) {
            System.out.println("The average of the entered numbers is: " + average);
        } else {
            System.out.println("No invalid numbers entered.");
        }

        sc.close();
    }
}
