package session_15_oop_recap.challenge.loops_and_flow_control;

public class Exercise12 {
    /* Create a Java program that prints a number pyramid of n levels.
    Utilize pre and post increment operators in your nested loops to construct the pyramid. */
    public static void main(String[] args) {
        int numberOfLevels = 5;

        for (int i = 1; i <= numberOfLevels; i++) {
            for (int j = 1; j <= numberOfLevels - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}