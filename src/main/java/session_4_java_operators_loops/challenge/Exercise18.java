package session_4_java_operators_loops.challenge;

public class Exercise18 {

    public static void main(String[] args) {
        /* 18. Write a Java program where you declare an integer array with 5 elements. Use a for loop to initialize the array
        such that each element is equal to its index incremented by 1. Then use another for loop to decrement each element by 1.
        Print the array before and after the decrement operation using a for-each loop.*/
        int[] myArray = new int[5];
        for (int index = 0; index < myArray.length; index++) {
            myArray[index] = index + 1;
        }

        System.out.print("The array before decrement: ");
        for (int numbers : myArray) {
            System.out.print(numbers + " ");
        }

        System.out.println();

        for (int index = 0; index < myArray.length; index++) {
            myArray[index] = myArray[index] - 1;
        }

        System.out.print("The array after decrement: ");
        for (int numbers : myArray) {
            System.out.print(numbers + " ");
        }
    }
}
