package sesion_4_java_operators_loops.challenge;

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {
        /* 20. Write a Java program that takes three integer variables a, b, and c as input. Use nested ternary operators to
         find and print the largest number among the three.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first number:");
        int a = sc.nextInt();
        System.out.println("Please, enter the second number:");
        int b = sc.nextInt();
        System.out.println("Please, enter the third number:");
        int c = sc.nextInt();

        int mostBiggerNo = ((a > b) && (a > c)) ? a : ((b > a) && (b > c)) ? b : c;

        System.out.println("The largest number is: " + mostBiggerNo);
    }
}
