package session_15_oop_recap.challenge.java_basics;

public class Exercise2 {
    /*Division by Zero: Write a program that divides two int values. What happens if the second value is zero?
    How can you handle this scenario? */

    public static void main(String[] args) {
        int no1 = 17;
        int no2 = 5;

        if (no2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            System.out.println("The result is: " + (double) no1 / no2);
        }
    }
}