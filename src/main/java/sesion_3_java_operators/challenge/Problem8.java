package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {
        /* 8: Comparing Product Prices. Write a Java program to compare the prices of two products.
        Given the prices price1 and price2 of two products, print which product is cheaper or if they have the same price. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first price:");
        double price1 = sc.nextDouble();
        System.out.println("Please, enter the second price:");
        double price2 = sc.nextDouble();

        if (price1 < price2) {
            System.out.println("The first product is cheaper than the second.");
        } else if (price2 < price1) {
            System.out.println("The second product is cheaper than the first.");
        } else {
            System.out.println("The products have the same price.");
        }
    }
}
