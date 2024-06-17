package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {
        /* 9.Currency Conversion. Write a Java program to convert an amount from dollars to euros.
        Given the amount in dollars and the conversion rate conversionRate, calculate and print the amount in euros. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the amount in dollars:");
        double dollars = sc.nextDouble();
        System.out.println("Please, enter the conversion rate:");
        double conversionRate = sc.nextDouble();

        double amountInEuros = dollars * conversionRate;

        System.out.println("For " + dollars + " dollars you will get " + amountInEuros + " euros.");
    }
}
