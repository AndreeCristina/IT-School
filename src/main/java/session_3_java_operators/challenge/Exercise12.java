package session_3_java_operators.challenge;

public class Exercise12 {

    public static void main(String[] args) {
        // 12. Create a program that takes an integer as input and
        // then increments and decrements it by 1, displaying the output at each stage.

        int myNumber = 17;

        System.out.print("The default value for the variable myNumber is " + myNumber);
        ++myNumber;
        System.out.println(" and the updated value, after increments it by 1 is " + myNumber);

        System.out.print("The default value for the variable myNumber is " + myNumber);
        --myNumber;
        System.out.println(" and the updated value, after decrements it by 1 is " + myNumber);
    }
}
