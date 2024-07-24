package session_15_oop_recap.challenge.loops_and_flow_control;

import java.util.Scanner;

public class Exercise2 {
    /*Switch Statement: Write a program that prompts the user to enter a day of the week and prints out a message
     indicating whether it is a weekday or a weekend day, using a switch statement. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a day of the week. (Monday, Tuesday, etc.)");
        String dayOfWeek = sc.nextLine().toLowerCase();

        switch (dayOfWeek) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("It's a weekday.");
                break;
            case "saturday":
            case "sanday":
                System.out.println("It's a weekend day");
                break;
            default:
                System.out.println("Your week is not valid, please, enter a valid day of the week.");
        }
    }
}