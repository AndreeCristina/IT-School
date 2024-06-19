package sesion_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        /* 12. Continue Statement. Create a program that asks the user for 10 numbers.
        Print the sum of all numbers that are greater than 5. If the user enters a number less than or equal to 5,
        use the continue statement to skip the addition for that number.*/
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int index = 0; index < 10; ++index) {
            System.out.println("Please, enter number " + (index + 1) + ":");
            int number = sc.nextInt();
            if (number <= 5) {
                continue;
            }
            sum += number;
        }

        System.out.println("The sum of elements grater than 5 is " + sum);

        sc.close();
    }
}
