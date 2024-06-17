package sesion_4_java_operators_loops.challenge;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        /* 4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
        Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first height:");
        int heightOne = sc.nextInt();
        System.out.println("Please, enter the second height:");
        int heightTwo = sc.nextInt();

        int maximumHeight = heightOne > heightTwo ? heightOne : heightTwo;

        System.out.println("The maximum height is " + maximumHeight);
    }
}
