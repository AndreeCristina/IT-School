package session_15_oop_recap.challenge.java_basics;

public class Exercise5 {
    /* Floating Point Precision: Write a program that calculates the average of three floating-point numbers.
       What happens if the sum of the three numbers exceeds the maximum value that can be represented by a float?
       How can you handle this scenario? */

    public static void main(String[] args) {
        float firstValue = 1.2f;
        float secondValue = 1.9f;
        float thirdValue = 2.6f;

        double average = (firstValue + secondValue + thirdValue) / 3;

        System.out.println("The average is: " + average);
    }
}