package sesion_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        /* 10. Jump Statements. Create a menu-driven program where the user is presented with options:
        Print "Hello World", Print the user's name., Exit. Based on the user's input, perform the necessary action.
        Once an action is completed, show the menu again, unless the user chooses the Exit option.
        Use jump statements to control the flow of the program.*/
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String yourName = scString.nextLine();
        int yourChoice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print \"HelloWorld\"");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");

            yourChoice = scInt.nextInt();

            switch (yourChoice) {
                case 1:
                    System.out.println("HelloWorld");
                    break;
                case 2:
                    System.out.println("The user name is " + yourName + ".");
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice.Try again:");
                    break;
            }
        } while (yourChoice != 3);
        // extra - if we want a goodbye message for the user
        if (yourName != null) {
            System.out.println("Good bye " + yourName + "!");
        }

        scInt.close();
        scString.close();
    }
}
