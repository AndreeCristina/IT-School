package session_15_oop_recap.challenge.loops_and_flow_control;

public class Exercise14 {
    /* Write a Java program to reverse the elements of an array in-place. Use pre- and post-decrement
    operators in your loop to swap the elements.*/

    public static void main(String[] args) {
        int[] myArray = {1, 9, 4, 25, 16, 24};

        reverseArray(myArray);

        for (int element : myArray) {
            System.out.print(element + " ");
        }
    }

    public static void reverseArray(int[] myArray) {
        int length = myArray.length;

        for (int i = 0; i < length / 2; ++i) {
            int temp = myArray[i];
            myArray[i] = myArray[length - 1 - i];
            myArray[length - 1 - i] = temp;
        }
    }
}