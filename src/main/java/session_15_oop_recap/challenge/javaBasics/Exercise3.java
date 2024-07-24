package session_15_oop_recap.challenge.javaBasics;

import java.util.Scanner;

public class Exercise3 {
    /* String to Integer: Write a program that prompts the user to enter a string representing an integer value.
    Convert the string to an int using the Integer.parseInt() method. What happens if the string cannot be parsed
    as an integer? How can you handle this scenario? */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter an integer number:");
        String number = sc.nextLine();

        try {
            int numberInt = Integer.parseInt(number);
            System.out.println("The integer value is: " + numberInt);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}