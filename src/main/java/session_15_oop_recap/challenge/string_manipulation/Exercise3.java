package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

public class Exercise3 {
    /* Substring Extraction: Write a program that prompts the user to enter a string and extracts a substring
    from the string using the substring() method. Print out the extracted substring. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a string");
        String myString = sc.nextLine();

        String substringExtracted = myString.substring(3);

        System.out.println("The substring of the string " + myString + " is " + substringExtracted);
    }
}