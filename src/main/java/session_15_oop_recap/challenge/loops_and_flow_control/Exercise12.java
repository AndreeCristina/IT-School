package session_15_oop_recap.challenge.loops_and_flow_control;

public class Exercise12 {
    /* Write a Java program to find the sum of the series: 1 - 2 + 3 - 4 + 5 - 6 + ... up to n
    terms using a loop. Inside your loop, utilize pre and post increment operators to manage your loop
    counter and to manipulate the values in the series. */

    public static void main(String[] args) {
        int n = 10, sum = 0, sign = 1;

        for (int index = 1; index <= n; ++index) {
            sum += sign * index;
            sign = -sign;
        }

        System.out.println("Sum of the series: " + sum);
    }
}