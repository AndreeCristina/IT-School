package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class Problem7 {

    public static void main(String[] args) {
        /* 7. Loan Interest Calculation. Write a Java program to calculate the interest on a loan.
        Given the principal amount, the annual interest rate, and the time period in years time,
        calculate the simple interest using the formula Interest = (principal * rate * time) / 100. Print the interest amount. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the principal amount:");
        int principalAmount = sc.nextInt();
        System.out.println("Please, enter the annual interest rate:");
        double annualInterestRate = sc.nextDouble();
        System.out.println("Please, enter the time period in years time:");
        int timePeriod = sc.nextInt();

        double interest = (principalAmount * annualInterestRate * timePeriod) / 100;

        System.out.println("The interest amount is: " + interest);
    }
}
