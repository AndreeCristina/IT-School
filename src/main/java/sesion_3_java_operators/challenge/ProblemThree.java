package sesion_3_java_operators.challenge;

import java.util.Scanner;

public class ProblemThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.println("Please, enter the deposit amount: ");
        double depositAmount = sc.nextDouble();

        double newBalance = initialBalance + depositAmount;

        System.out.printf("The initial balance was %f, the deposit amount was %f and the new balance is %f", initialBalance, depositAmount, newBalance);
    }
}
