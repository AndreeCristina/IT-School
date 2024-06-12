package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class ProblemFour {

    public static void main(String[] args) {
        // 4: Student Grade Check
        //Write a Java program to check if a student has passed or failed an exam.
        // Given the student's score, if the score is 50 or above, print "Passed",
        // otherwise print "Failed".

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the student score:");
        int studentScore = sc.nextInt();

        if (studentScore >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
