package session_4_java_operators_loops.challenge;

public class Exercise2 {

    public static void main(String[] args) {
        /* 2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values.
        Use an equality operator to compare these two numbers and print the result. Do the same for two String objects
        firstString and secondString with the same value, but use the equals() method for comparison. Print the result.*/
        int firstNumber = 45;
        int secondNumber = 55;

        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers aren't equal.");
        }

        String firstString = "Andreea";
        String secondString = "Andreea";

        if (firstString.equals(secondString)) {
            System.out.println("The strings have the same content.");
        } else {
            System.out.println("The strings have different content.");
        }
    }
}
