package session_9_arrays.challenge;

import java.util.Arrays;

public class Exercise9 {
    /* 9.Accept a string representation of a binary number, e.g., "1011". Convert this string into an Integer using
    the Integer wrapper class and the method that parses binary. Print out the decimal representation of this number.*/
    public static void main(String[] args) {
        String binaryNumber = "1011";

        int decimanlValue = Integer.parseInt(binaryNumber, 2);
        System.out.println("The decimal representation of " + binaryNumber + " is " + decimanlValue);
    }
}
