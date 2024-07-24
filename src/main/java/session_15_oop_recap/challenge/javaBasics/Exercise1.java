package session_15_oop_recap.challenge.javaBasics;

public class Exercise1 {
    /* Integer Overflow: Write a program that multiplies two int values and stores the result in an int.
    What happens if the result is larger than the maximum int value? How can you handle this scenario?*/

    public static void main(String[] args) {
        int no1 = 75;
        int no2 = 105;

        long result = no1 * no2;
        System.out.println("The result is: " + result);
    }
}