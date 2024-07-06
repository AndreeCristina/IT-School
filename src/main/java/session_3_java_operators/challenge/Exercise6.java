package session_3_java_operators.challenge;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        // 6. Write a Java program that takes two numbers from the user and uses relational operators to display
        // whether the first number is greater than, less than, or equal to the second number.
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please, enter the second number: ");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than the second.");
        } else if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The first number is smaller then the second.");
        }
    }
}
