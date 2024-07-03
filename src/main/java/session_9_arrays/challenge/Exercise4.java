package session_9_arrays.challenge;

public class Exercise4 {
    // 4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 4, 9, 10, 25, 21, 22, 36};

        int countEven = 0;
        int countOdd = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0) {
                ++countEven;
            } else {
                ++countOdd;
            }
        }

        System.out.println("Even numbers: " + countEven + "\n" + "Odd numbers: " + countOdd);
    }
}
