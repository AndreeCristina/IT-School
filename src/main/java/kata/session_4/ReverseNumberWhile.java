package kata.session_4;

import java.util.Scanner;

public class ReverseNumberWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive number");
        int number = sc.nextInt();

        if (number > 0 && number < 1000000000 && (number % 10 == 0)) {
            System.out.println("Please enter a valid number: number between 0 and 1000000000 and the last digit is by 0");
        }

        int reverseNo = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverseNo = reverseNo * 10 + lastDigit;
            number /= 10;
        }

        System.out.println("The reversed number is: " + reverseNo);
    }
}