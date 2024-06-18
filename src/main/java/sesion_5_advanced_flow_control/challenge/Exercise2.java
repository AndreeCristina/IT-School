package sesion_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        /* 2. Month Name Finder. Write a program that asks the user to enter a number between 1 and 12.
        Print the name of the corresponding month or "Invalid Month" if out of range.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number:");
        int monthNumber = sc.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
