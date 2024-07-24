package session_15_oop_recap.challenge.java_basics;

public class Exercise9 {
    /* Type Casting: Declare a variable of one data type, and then assign it to a variable of another data type
    using type casting. For example, declare a double variable and assign it to an int variable using type casting.
     Print out the value of the int variable to verify that the type casting was successful. */

    public static void main(String[] args) {
        double doubleNumber = 1.574897;
        int integerValue = (int) doubleNumber;

        System.out.println("double value: " + doubleNumber + "\n" + "integer value, after casting: " + integerValue);
    }
}