package session_3_java_operators.challenge;

import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args) {
        /* 10: Calorie Tracker. Write a Java program to track calories consumed in a meal. Given the calories of three different food items
         calories1, calories2, and calories3, calculate and print the total calories consumed in the meal.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the calories for first food item.");
        double calories1 = sc.nextDouble();
        System.out.println("Please, enter the calories for second food item.");
        double calories2 = sc.nextDouble();
        System.out.println("Please, enter the calories for third food item.");
        double calories3 = sc.nextDouble();

        double totalCalories = calories1 + calories2 + calories3;

        System.out.println("The total calories consumed in the meal are: " + totalCalories);
    }
}
