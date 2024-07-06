package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        /* 4. String Reverser. Ask the user to enter a string. Print the reversed version of this string.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a string:");
        String myString = sc.nextLine();

        String reversedMyString = reverseString(myString);

        System.out.println("Reversed String: " + reversedMyString);
        sc.close();
    }

    public static String reverseString(String myString) {
        StringBuilder reversed = new StringBuilder();

        for (int index = myString.length() - 1; index >= 0; --index) {
            reversed.append(myString.charAt(index));
        }

        return reversed.toString();
    }
}
