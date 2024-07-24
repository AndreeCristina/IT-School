package session_15_oop_recap.challenge.loops_and_flow_control;

public class Exercise9 {
    /* Create a Java program that modifies the values of an array using a loop. The modification will be
     a decrement of values at even indices and an increment of values at odd indices. */

    public static void main(String[] args) {
        int[] myArray = {5, 1, 8, 9, 14, 17, 21, 16, 20, 40};

        for (int index = 0; index < myArray.length; index++) {
            if (index % 2 == 0) {
                --myArray[index];
            } else {
                ++myArray[index];
            }
        }

        for (int element : myArray) {
            System.out.print(element + " ");
        }
    }
}