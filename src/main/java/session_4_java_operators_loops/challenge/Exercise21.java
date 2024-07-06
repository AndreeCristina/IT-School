package session_4_java_operators_loops.challenge;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        /* 21. Write a Java program that takes a double variable score representing a student’s score on a test.
        Use a ternary operator to classify the score into letter grades A, B, C, D, or F according to the following scale:
        A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: 0-59 Print the resulting letter grade.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the score:");
        double studentScore = sc.nextDouble();

        char letterGrade = (studentScore < 60) ? 'F' : (studentScore < 70) ? 'D' : (studentScore < 80) ? 'C' : (studentScore < 90) ? 'B' : 'A';
        System.out.println("The letter grade for score " + studentScore + " is: " + letterGrade);
    }
}
