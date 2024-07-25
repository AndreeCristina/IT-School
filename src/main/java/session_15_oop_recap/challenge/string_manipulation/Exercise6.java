package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

public class Exercise6 {
    /* String Formatting: Write a program that prompts the user to enter a name and an age, and formats them into a
    sentence using the String.format() method. Print out the formatted sentence.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your name: ");
        String name = sc.nextLine();

        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        String sentence = String.format("%s, %d", name, age);

        System.out.println("The formatted sentence is: " + sentence);
    }
}