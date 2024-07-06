package session_8_recap.challenge;

import java.util.Scanner;

public class BasicCalculator {
    /* 11. Create a basic calculator that can accept 2 numbers from the user and use them for the following operations: +, -, *, /.
    Requirements:
    User should be prompted with a message to enter two numbers for the mathematical operation
    User should be prompted with a message to enter the operator that he wants to use( +, -, * or /)
    Consider some validations in case the user doesn’t enter a proper number value
    The number is too large
    The format is not the one we expect
    Any other edge case you can think of
    Instruct the user what he has to do, with a message, if he finds himself on an edge case
    - After the operations is completed, the user should have the option to either enter 2 other numbers for another mathematical operation, or to exit the program */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter the first number: ");
            double number1 = sc.nextDouble();

            System.out.println("Enter the second number: ");
            double number2 = sc.nextDouble();

            System.out.println("Enter the operator(): (+, -, *, /)");
            char operator = sc.next().charAt(0);

            double result = calculate(number1, number2, operator);
            System.out.println("Result: " + result);

            System.out.println("Do you want to perform another calculation? (y/n):");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Exit the program");
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return Double.NaN;
                }
                return num1 / num2;
            default:
                return Double.NaN;
        }
    }
}
