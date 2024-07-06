package session_6_java_core_apis.challenge;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        /* Palindrome Checker Description: Write a program that checks whether a given string is a palindrome
        using the StringBuilder class. A palindrome is a word, phrase, number, or other sequences of characters
        that reads the same forward and backward.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a word:");
        String myWord = sc.nextLine();

        StringBuilder myReversedWord = new StringBuilder(myWord).reverse();

        if (myWord.equalsIgnoreCase(myReversedWord.toString())) {
            System.out.println("The string " + myWord + " is palindrome.");
        } else {
            System.out.println("The string " + myWord + " is not palindrome.");
        }
    }
}
