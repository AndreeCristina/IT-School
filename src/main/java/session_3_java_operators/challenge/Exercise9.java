package session_3_java_operators.challenge;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        // 9. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.

        // first version

        double length = 14.3;
        double breadth = 15.5;

        double area = length * breadth;

        System.out.println("The area of the rectangle is: " + area);

        // second version

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first number: ");
        double length2 = sc.nextDouble();
        System.out.println("Please, enter the second number: ");
        double breadth2 = sc.nextDouble();

        double area2 = length2 * breadth2;

        System.out.println("The area of the rectangle is: " + area2);
    }
}
