package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class ExerciseOne {

    public static void main(String[] args) {
        // 1
//        int no1 = 21;
//        int no2 = 5;
//        int addition = no1 + no2;
//        int subtraction = no1 - no2;
//        int product = no1 * no2;
//        double division = (double) no1 / no2;
//        int modulus = no1 % no2;
//        System.out.println("Addition: " + addition);
//        System.out.println("Subtraction: " + subtraction);
//        System.out.println("Multiplication: " + product);
//        System.out.println("Division: " + division);
//        System.out.println("Modulus: " + modulus);
        // 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Please enter second number: ");
        int number2 = sc.nextInt();

        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int product = number1 * number2;
        double division = (double) number1 / number2;
        int modulus = number1 % number2;
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

    }
}