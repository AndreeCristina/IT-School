package session_19.challenge;

import java.util.stream.IntStream;

public class Exercise3 {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .filter(Exercise3::isPrime)
                .forEach(System.out::println);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
}