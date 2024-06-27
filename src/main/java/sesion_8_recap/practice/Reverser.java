package sesion_8_recap.practice;

import java.util.Scanner;

/* Description: Write a program that reads a name from the user and prints it in reverse order using a loop.
    Make sure to handle both uppercase and lowercase characters correctly.*/
public class Reverser {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your name:");
            String name = sc.nextLine();
            sc.close();

            for (int index = name.length() - 1; index >= 0; index--) {
                System.out.print(name.charAt(index));
            }
        }
}
