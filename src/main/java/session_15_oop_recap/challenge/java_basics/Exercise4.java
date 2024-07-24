package session_15_oop_recap.challenge.java_basics;

import java.util.Scanner;

public class Exercise4 {
    /*Char to Int Conversion: Write a program that prompts the user to enter a single character.
    Convert the character to its corresponding int value using the Character.getNumericValue() method.
    What happens if the character is not a numeric digit? How can you handle this scenario? */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a character:");
        char input = sc.next().charAt(0);

        int numericValue = Character.getNumericValue(input);
        if (numericValue != -1) {
            System.out.println("The numeric value of " + input + " is: " + numericValue);
        } else {
            System.out.println(input + " is not a numeric digit");
        }
    }
}