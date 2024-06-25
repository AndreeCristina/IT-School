package sesion_7_utility_classes.practice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name:");
        String userName = scanner.next();

        System.out.println("Please, enter your age:");
        int userAge = scanner.nextInt();

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("User: " + userName + " Age: " + userAge + " is student: " + isStudent);
        scanner.close();
    }
}
