package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
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
