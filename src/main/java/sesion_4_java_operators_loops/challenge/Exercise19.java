package sesion_4_java_operators_loops.challenge;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {
        /*19. Write a Java program that takes an integer variable age as input. Use a ternary operator to classify the person
        into one of the following categories: "Child" (age < 12), "Teenager" (age between 12 and 17), "Adult" (age between 18 and 64),
        and "Senior" (age 65 and above). Print the resulting classification. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your age: ");
        int age = sc.nextInt();

        String message = (age < 12) ? "Child" : (age <= 17) ? "Teenager" : (age <= 64) ? "Adult" : "Senior";

        System.out.println("You are: " + message);
    }
}
