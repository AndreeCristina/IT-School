package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

public class Exercise5 {
    /* Character Replacement: Write a program that prompts the user to enter a string and replaces all occurrences of
     a specific character in the string with another character using the replace() method.Print out the modified string.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a word or a sentence");
        String myString = sc.nextLine();

        System.out.println("Please, enter the character to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.println("Please, enter the new character: ");
        char newChar = sc.next().charAt(0);

        String modifiedString = myString.replace(oldChar, newChar);

        System.out.println("Modified string is: " + modifiedString);
    }
}