package sesion_3_java_operators;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int x = sc.nextInt();
        System.out.println("Please enter second number: ");
        int y = sc.nextInt();

        int remainder = x % y;
        double power = Math.pow(x, y);

        System.out.println("Remainder: " + remainder);
        System.out.println("Power: " + power);
    }
}
