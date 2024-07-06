package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        /* 7. Do-While Loop. Create a program where the user is prompted to guess a predefined number.After each guess,
        the program should inform the user if the guess is too high or too low.The program should keep prompting the user
        until they guess correctly.Using a do-while loop, ensure the user is always asked at least once.*/
        Scanner sc = new Scanner(System.in);

        int targetNumber = 10;
        int guessNumber;

        System.out.println("Please enter a number:");
        do {
            guessNumber = sc.nextInt();
            if (guessNumber < targetNumber) {
                System.out.println("Your number is too low. Enter a higher number:");
            } else if (guessNumber > targetNumber) {
                System.out.println("Your number is too hight. Enter a lower number:");
            } else {
                System.out.println("Congratulations! You guessed the number!");
            }
        } while (guessNumber != targetNumber);
    }
}
