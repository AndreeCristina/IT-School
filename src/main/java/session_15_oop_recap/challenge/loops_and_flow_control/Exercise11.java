package session_15_oop_recap.challenge.loops_and_flow_control;

import java.util.Scanner;

public class Exercise11 {
    /* Create a Java program to check if a given word is a palindrome. Utilize pre-decrement and
    post-decrement operators in your solution to handle your loop control variable.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a word:");
        String word = sc.nextLine();

        if (isPalindrome(word)) {
            System.out.println("The word is palindrome");
        } else {
            System.out.println("The word isn't palindrome.");
        }
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length() / 2; ++i) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}