package kata.session_6;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first number:");
        int number1 = sc.nextInt();

        System.out.println("Please, enter the second number:");
        int number2 = sc.nextInt();

        System.out.println("Please, enter the third number:");
        int number3 = sc.nextInt();

        int theLargestNo;

        if (number1 >= number2 && number1 >= number3) {
            theLargestNo = number1;
        } else if (number2 >= 1 && number2 >= number3) {
            theLargestNo = number2;
        } else {
            theLargestNo = number3;
        }

        System.out.println("The largest number is: " + theLargestNo);
    }
}