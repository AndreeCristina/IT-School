package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        /* 5. Fibonacci Series Generator. Write a program that generates and prints the first n numbers of the Fibonacci series,
         where n is provided by the user.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number:");
        int n = sc.nextInt();

        System.out.println("Fibonacci series: ");
        printFibonacci(n);

        sc.close();
    }

    public static void printFibonacci(int n) {
        int nextNo;
        if (n <= 0) {
            System.out.println("Invalid number.Please, enter a number grater than 0.");
        } else if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(1 + " " + 1);
        } else {
            int firstNo = 1, secondNo = 1;
            System.out.print(firstNo + " " + secondNo + " ");
            for (int i = 3; i <= n; ++i) {
                nextNo = firstNo + secondNo;
                firstNo = secondNo;
                secondNo = nextNo;
                System.out.print(nextNo + " ");
            }
        }
    }
}
