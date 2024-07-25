package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

public class Exercise1 {
    /* String Length: Write a program that prompts the user to enter a string and prints out the length of the string. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a word or a sentence.");
        String myString = sc.nextLine();

        int lengthOfString = myString.length();

        System.out.println("The length of the string is: " + lengthOfString);
    }
}