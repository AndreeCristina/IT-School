package session_3_java_operators.challenge;

public class Exercise11 {

    public static void main(String[] args) {
        //11. Write a Java program that takes two boolean inputs from a user.
        // Apply the logical negation operator (!) to each and print the result.
        boolean isWinter = false;
        boolean isSummer = true;

        boolean negatedIsWinter = !isWinter;
        boolean negatedIsSummer = !isSummer;

        System.out.println("Negation of the isWinter value is: " + negatedIsWinter);
        System.out.println("Negation of the isSummer value is: " + negatedIsSummer);
    }
}
