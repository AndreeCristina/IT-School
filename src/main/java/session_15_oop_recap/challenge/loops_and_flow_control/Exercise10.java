package session_15_oop_recap.challenge.loops_and_flow_control;

public class Exercise10 {
    /* Write a Java program to calculate the factorial of a number using a loop. In the loop,
    use the pre-increment operator to increase the value of your loop control variable */

    public static void main(String[] args) {
        int number = 5;

        long factorialNumber = 1;
        for (int i = 1; i <= number; ++i) {
            factorialNumber *= i;
        }

        System.out.println("The factorial: " + factorialNumber);
    }
}