package sesion_4_java_operators_loops.challenge;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        /* 7. Write a Java program that determines the type of a triangle based on its sides. Declare three variables
        sideOne, sideTwo and sideThree to represent the sides of the triangle. Use the ternary operator to determine and print
         whether the triangle is "Equilateral", "Isosceles", or "Scalene". */
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first side of the triangle: ");
        double sideOne = sc.nextDouble();
        System.out.println("Please, enter the second side of the triangle:");
        double sideTwo = sc.nextDouble();
        System.out.println("Please, enter the third side of the triangle:");
        double sideThree = sc.nextDouble();

        if (sideOne <= 0 || sideTwo <= 0 || sideThree <= 0) {
            System.out.println("Please, enter positive values for the sides of triangle.");
            return;
        }

        String triangle = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" :
                (sideOne != sideTwo && sideTwo != sideThree && sideThree != sideOne) ? "Scalene" : "Isosceles";

        System.out.println("The triangle is " + triangle);
    }
}
