package sesion_4_java_operators_loops.challenge;

import java.util.Scanner;

public class ExerciseSix {

    public static void main(String[] args) {
        /* 6. Write a Java program where you declare an integer variable temperature. Assign a value to it and print
        "Hot" if the temperature is more than 30, "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the temperature:");
        int temperature = sc.nextInt();

        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Warm");
        } else if (temperature < 20) {
            System.out.println("Cold");
        }
    }
}
