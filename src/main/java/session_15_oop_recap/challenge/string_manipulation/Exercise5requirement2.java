package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

public class Exercise5requirement2 {
    /* Character Replacement: Create a program that prompts the user to enter a sentence. The program should then
    prompt the user to replace all occurrences of the word "apple" with the word "orange" in the sentence.
    After the replacement, the modified sentence should be printed out. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a sentence: ");
        String mysentence = sc.nextLine();

        String modifiedSentence = mysentence.replaceAll("apple", "orange");

        System.out.println("The modified sentence is: " + modifiedSentence);
    }
}