package sesion_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        /* 5. Fibonacci Series Generator. Write a program that generates and prints the first n numbers of the Fibonacci series,
         where n is provided by the user.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number:");
        int n = sc.nextInt();
        int firstNo = 0, secondNo = 1, nextNo;

        for (int index = 0; index < n; index++) {
            if (index <= 0) {
                nextNo = index;
            } else {
                nextNo = firstNo + secondNo;
                firstNo = secondNo;
                secondNo = nextNo;
            }
            System.out.print(nextNo + " ");
        }
    }
}
