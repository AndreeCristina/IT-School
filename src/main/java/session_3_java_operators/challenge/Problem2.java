package session_3_java_operators.challenge;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        /* 2. Temperature Conversion. Write a Java program to convert a temperature from Celsius to Fahrenheit.
         Use the formula F = (C * 9/5) + 32. Given a temperature in Celsius celsius, calculate and print the temperature in Fahrenheit.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the temperature in Celsius degrees:");
        double tempCelsius = sc.nextDouble();

        double tempFahrenheit = (tempCelsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit degrees is: " + tempFahrenheit);
    }
}
