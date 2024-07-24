package session_15_oop_recap.challenge.loops_and_flow_control;

import java.util.Scanner;

public class Exercise8 {
    /* Write a Java program that generates the first n numbers in the Fibonacci sequence using a loop.
    Within your loop, utilize both pre and post-increment operators to manage your loop counter and
    to facilitate the generation of the Fibonacci sequence. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number.");
        int number = sc.nextInt();

        int elem1 = 1, elem2 = 1, nextElem;

        System.out.print(elem1 + " " + elem2 + " ");

        for (int index = 3; index <= number; ++index) {
            nextElem = elem1 + elem2;
            System.out.print(nextElem + " ");
            elem1 = elem2;
            elem2 = nextElem;
        }
    }
}