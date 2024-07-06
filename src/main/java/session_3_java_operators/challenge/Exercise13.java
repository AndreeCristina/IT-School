package session_3_java_operators.challenge;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        //13. Write a program to calculate the price after discount. Take the original price and discount percentage as input.
        // Use compound assignment operator to perform the calculation.

        // first version - without compound assignment operator

        double originalPrice = 150.5;
        double myDiscount = 10;

        double priceAfterDiscount = originalPrice - ((originalPrice * myDiscount) / 100);

        System.out.println("The price after discount is: " + priceAfterDiscount);

        // second version - without compound assignment operator

        Scanner sc = new Scanner(System.in);

//        System.out.println("Please, enter the price: ");
//        double price = sc.nextDouble();
//        System.out.println("Please, enter de discount: ");
//        double discount = sc.nextDouble();
//
//        double myPriceAfterDiscount = price - ((price * discount) / 100);
//
//        System.out.println("The price after discount is: " + myPriceAfterDiscount);

        // the third version - with compound assignment operator

        System.out.println("Please, enter the price: ");
        double price = sc.nextDouble();
        System.out.println("Please, enter de discount: ");
        double discount = sc.nextDouble();

        double myDiscount2 = discount / 100;
        price *= (1 - myDiscount2);

        System.out.println("My price after discount is : " + price);
    }
}
