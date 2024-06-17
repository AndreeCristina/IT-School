package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
        /* 5. Grocery Store Discounts. Write a Java program to apply a discount to a grocery bill.
        Given the original bill amount originalBill and a discount percentage discountPercent,
        calculate and print the final bill amount after applying the discount.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the bill amount before discount: ");
        double originalBill = sc.nextDouble();
        System.out.println("Please, enter the discount percentage: ");
        double discountPercent = sc.nextDouble();

        double finalBillAmount = originalBill - (originalBill * discountPercent / 100);

        System.out.println("The final bill amount after discount is: " + finalBillAmount);
    }
}
