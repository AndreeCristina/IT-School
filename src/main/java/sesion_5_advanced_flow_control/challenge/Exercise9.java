package sesion_5_advanced_flow_control.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        /* 9. For-Each Loop. Given an array of integers, write a program that prints each number in the array followed by
        "Even" if the number is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.*/
        // first version - with array
        int[] myArrayNo = {1, 7, 10, 8, 5, 101, 202, 71};

        for (int no : myArrayNo) {
            String parity = (no % 2 == 0) ? "Even" : "Odd";
            System.out.println("Number " + no + " is " + parity);
        }

        System.out.println();

        // second version - with ArrayList + add
        ArrayList<Integer> myArray = new ArrayList<>();

        myArray.add(7);
        myArray.add(6);
        myArray.add(12);
        myArray.add(21);
        myArray.add(55);
        myArray.add(60);
        myArray.add(61);
        myArray.add(11);
        myArray.add(2);

        for (int number : myArray) {
            if (number % 2 == 0) {
                System.out.println("The number " + number + " is Even.");
            } else {
                System.out.println("The number " + number + " is Odd.");
            }
        }

        System.out.println();

        // third version - with ArrayList and Scanner
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> mySecondArray = new ArrayList<>();

        System.out.println("Please enter the length of array:");
        int numberOfElements = sc.nextInt();

        for (int index = 0; index < numberOfElements; index++) {
            System.out.println("Please, enter the element: " + (index + 1) + " :");
            int element = sc.nextInt();
            mySecondArray.add(element);
        }

        for (int elemNo : mySecondArray) {
            if (elemNo % 2 == 0) {
                System.out.println("The number " + elemNo + " is Even.");
            } else {
                System.out.println("The number " + elemNo + " is Odd.");
            }
        }

        sc.close();
    }
}
