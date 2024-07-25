package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

//public class Exercise7 {
//    /* Write a Java program that prompts the user to enter a string, and then finds and prints all the palindromic
//    substrings of the entered string.*/
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please, enter a string: ");
//        String myString = sc.nextLine();
//
//        System.out.println("Palindromic substrings:");
//        for (int i = 0; i < myString.length(); i++) {
//            if (myString.length() % 2 == 0) {
//                expandPalindrome(myString, i, i + 1);
//            } else {
//                expandPalindrome(myString, i, i );
//            }
//        }
//    }
//
//    private static void expandPalindrome(String s, int left, int right) {
//        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//            System.out.println(s.substring(left, right + 1));
//            left--;
//            right++;
//        }
//    }
//}