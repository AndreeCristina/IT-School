package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class ExerciseThirteen {

    public static void main(String[] args) {
        //13. Write a program to calculate the price after discount. Take the original price and discount percentage as input.
        // Use compound assignment operator to perform the calculation.
        // first version

        double originalPrice = 150.5;
        int myDiscount = 10;
        double priceAfterDiscount = originalPrice - ((originalPrice * myDiscount) / 100);
        System.out.println("The price after discount is: " + priceAfterDiscount);

        // second version

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the price: ");
        double price = sc.nextDouble();
        System.out.println("Please, enter de discount: ");
        int discount = sc.nextInt();

        double myPriceAfterDiscount = price - ((price * discount) / 100);

        System.out.println("The price after discount is: " + myPriceAfterDiscount);
    }
}
