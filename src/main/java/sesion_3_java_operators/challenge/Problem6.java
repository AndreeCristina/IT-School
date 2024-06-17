package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        /*6:Age Verification. Write a Java program to verify if a person is eligible to vote.
        Given a person's age, if the age is 18 or above, print "Eligible to vote", otherwise print "Not eligible to vote".*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the age: ");
        int personAge = sc.nextInt();

        if (personAge >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
