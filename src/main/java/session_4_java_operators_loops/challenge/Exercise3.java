package session_4_java_operators_loops.challenge;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        /* 3. Write a Java program that declares an integer variable age with a value of 20.
         Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult". */
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your age:");
        int age = sc.nextInt();
//        int age = 20;

        if (age >= 18) {
            System.out.println("I am adult.");
        } else {
            System.out.println("I am not an adult.");
        }
    }
}
