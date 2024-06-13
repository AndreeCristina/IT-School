package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class ExerciseFourteen {

    public static void main(String[] args) {
        /* 14. Create a program that checks if a user entered number is within a specific range (e.g., [1-100]).
        Use relational operators for the checks. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int number = sc.nextInt();

        while (true) {
            if (number < 1) {
                System.out.println("The number " + number + " is too low, please enter a larger number:");
                number = sc.nextInt();
            } else if (number > 100) {
                System.out.println("The number " + number + " is too high, please enter a smaller number:");
                number = sc.nextInt();
            } else {
                System.out.println("Congrats! The number is between [1,100].");
                break;
            }
        }
    }
}
