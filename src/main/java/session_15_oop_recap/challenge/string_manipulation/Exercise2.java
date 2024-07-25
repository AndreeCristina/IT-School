package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

public class Exercise2 {
    /* String Concatenation: Write a program that prompts the user to enter two strings and concatenates them using
    the + operator. Print out the concatenated string. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first string: ");
        String string1 = sc.nextLine();

        System.out.println("Please, enter the second string: ");
        String string2 = sc.nextLine();

        String concatenatedString = string1 + string2;

        System.out.println("The strings concatenate is:  " + concatenatedString);
    }
}