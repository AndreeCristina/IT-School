package session_15_oop_recap.challenge.java_basics;

import java.util.Scanner;

public class Exercise6 {
    /* Boolean Logic: Write a program that prompts the user to enter two boolean values.
    Use logical operators (&&, ||, !) to perform various operations on the values, such as AND, OR, and NOT. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first boolean value: (true or false)");
        boolean firstBoolean = Boolean.parseBoolean(sc.nextLine());

        System.out.println("Please, enter the second boolean value: (true or false)");
        boolean secondBoolean = Boolean.parseBoolean(sc.nextLine());

        boolean andResult = firstBoolean && secondBoolean;
        System.out.println("AND: " + andResult);

        boolean orResult = firstBoolean || secondBoolean;
        System.out.println("OR: " + orResult);

        boolean notFirstBoolean = !firstBoolean;
        boolean notSecondBoolean = !secondBoolean;
        System.out.println("NOT firstBoolean " + notFirstBoolean);
        System.out.println("NOT secondBoolean " + notSecondBoolean);
    }
}