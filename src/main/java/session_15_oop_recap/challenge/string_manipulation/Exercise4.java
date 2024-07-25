package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

public class Exercise4 {
    /* String Comparison: Write a program that prompts the user to enter two strings and compares them using the
    equals() method. Print out a message indicating whether the strings are equal or not.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first string:");
        String string1 = sc.nextLine();

        System.out.println("Please, enter the second string:");
        String string2 = sc.nextLine();

        boolean isStringsEqual = string1.equals(string2);

        if (isStringsEqual) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings aren't equal.");
        }
    }
}