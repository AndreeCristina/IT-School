package sesion_3_java_operators.challenge;

public class Exercise4 {

    public static void main(String[] args) {
        // 4. Write a Java program that uses both the increment (++) and decrement (--) operators
        // in a loop to count up to 10 and then back down to 1.

        // first solution with "while"

        int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            ++count;
        }
        System.out.println();

        while (count > 1) {
            --count;
            System.out.print(count + " ");
        }
        System.out.println();

        // second solution with "for"

        for (int i = 1; i <= 10; ++i) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 10; i > 0; --i) {
            System.out.print(i + " ");
        }
    }
}
