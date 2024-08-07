package session_4_java_operators_loops.challenge;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {
        /* 17. Write a Java program that simulates a simple authentication system. Declare a boolean variable hasUsername and hasPassword.
        Set up a series of logical conditions using these two variables that will check the following conditions:
        If both hasUsername and hasPassword are true, print "Authentication successful".
        If either hasUsername or hasPassword is false, print "Authentication failed".
        If hasUsername is true but hasPassword is false, print "Password is incorrect".*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a value:");
        boolean hasUsername = sc.nextBoolean();
        System.out.println("Please, enter a value:");
        boolean hasPassword = sc.nextBoolean();

        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        } else {
            System.out.println("Authentication failed");
        }
    }
}
