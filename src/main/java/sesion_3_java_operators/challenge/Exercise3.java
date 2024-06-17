package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        // 3. Write a program to check if a number is positive or negative using logical complement operator.
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number:");
        int myNumber = sc.nextInt();

        if (myNumber > 0) {
            System.out.println("The number is positive.");
        } else if (myNumber < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
