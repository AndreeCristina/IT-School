package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class ProblemThree {

    public static void main(String[] args) {
        /* 3: Banking Operations. Write a Java program to simulate a simple banking operation.
        Given an initial account balance and a deposit amount deposit, calculate the new balance after the deposit.
        Print the initial balance, deposit amount, and new balance.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the initial balance:");
        double initialBalance = sc.nextDouble();
        System.out.println("Please, enter the deposit amount:");
        double depositAmount = sc.nextDouble();

        double newBalance = initialBalance + depositAmount;

        System.out.printf("The initial balance was %f, the deposit amount was %f and the new balance is %f", initialBalance, depositAmount, newBalance);
    }
}
