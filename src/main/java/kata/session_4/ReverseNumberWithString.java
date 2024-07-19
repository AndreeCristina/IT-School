package kata.session_4;

import java.util.Scanner;

public class ReverseNumberWithString {

    static final int TEN = 10;
    static final int MAX_VALUE = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive number");
        int number = sc.nextInt();

        if (number > 0 && number < MAX_VALUE && (number % TEN == 0)) {
            System.out.println("Please enter a valid number: number between 0 and 1000000000 and the last digit of the number is different from 0");
        } else {
            String stringNumber = Integer.toString(number);

            for (int index = stringNumber.length() - 1; index >= 0; --index) {
                System.out.print(stringNumber.charAt(index));
            }
        }
    }
}