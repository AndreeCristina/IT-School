package sesion_4_java_operators_loops.challenge;

public class Exercise5 {

    public static void main(String[] args) {
        /* 5. Write a Java program to print the numbers from 1 to 10 using a for loop.
        As a next step, modify your program to print only the even numbers from 1 to 10. */
        for (int index = 1; index <= 10; index++) {
            System.out.print(index + " ");
        }

        System.out.println();

        for (int index = 1; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.print(index + " ");
            }
        }

        System.out.println();

        for (int index = 2; index <= 10; index += 2) {
            System.out.print(index + " ");
        }
    }
}
