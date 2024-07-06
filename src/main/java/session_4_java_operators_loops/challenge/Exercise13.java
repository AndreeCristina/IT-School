package session_4_java_operators_loops.challenge;

public class Exercise13 {

    public static void main(String[] args) {
        /* 13. Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false,
        respectively. Use the logical complement operator to negate the values of both variables and print the new values.*/
        boolean isRaining = true;
        boolean isSunny = false;

        boolean notIsRaining = !isRaining;
        boolean notIsSunny = !isSunny;

        System.out.println("isRaining after negation: " + notIsRaining);
        System.out.println("isSunny after negation: " + notIsSunny);
    }
}
