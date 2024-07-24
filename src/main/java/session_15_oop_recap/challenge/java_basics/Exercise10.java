package session_15_oop_recap.challenge.java_basics;


public class Exercise10 {
    /* Constants: Declare a constant using the final keyword, and assign it a value. Use the constant in your code
    to ensure that it cannot be changed. */

    public static void main(String[] args) {
        final int TEN = 10;

        int counterDigit = 0;
        int number = 14789;
        int copyNumber = 14789;

        while (number != 0) {
            counterDigit++;
            number /= TEN;
        }

        System.out.println("The number of digits of the number " + copyNumber + " is: " + counterDigit);
    }
}
