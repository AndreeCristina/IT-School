package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class ProblemTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the temperature in Celsius degrees:");
        double tempCelsius = sc.nextDouble();

        double tempFahrenheit = (tempCelsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit degrees is: " + tempFahrenheit);
    }
}
