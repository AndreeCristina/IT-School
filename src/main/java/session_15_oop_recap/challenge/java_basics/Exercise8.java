package session_15_oop_recap.challenge.java_basics;

public class Exercise8 {
    /*Arithmetic Operations: Declare two int variables and perform arithmetic operations on them, such as addition,
     subtraction, multiplication, and division. Print out the results of each operation to verify that they were
     calculated correctly. */

    public static void main(String[] args) {
        int no1 = 15;
        int no2 = 2;

        int addition = no1 + no2;
        int substraction = no1 - no2;
        long multiplication = no1 * no2;
        double division = (double) no1 / no2;

        System.out.println("Addition:" + addition);
        System.out.println("Substraction: " + substraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}