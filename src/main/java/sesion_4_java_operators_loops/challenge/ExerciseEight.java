package sesion_4_java_operators_loops.challenge;

public class ExerciseEight {

    public static void main(String[] args) {
     /* 8. Write a Java program to calculate the factorial of a number using a for loop.
     Declare an integer variable number and assign a value to it. Then calculate and print the factorial of number.*/
        int number = 15;
        long factorial = 1;

        for (int index = 1; index <= number; index++) {
            factorial *= index;
        }

        System.out.println(number + "! is " + factorial);
    }
}
