package session_4_java_operators_loops.challenge;

public class Exercise14 {

    public static void main(String[] args) {
        /* 14. Write a Java program where you declare an integer variable counter with a value of 0.
        Use the increment operator to increase the value of counter by 1 and then print the value.
        After that, use the decrement operator to decrease the value of counter by 1 and then print the value.*/
        int counter = 0;

        ++counter;
        System.out.println("The value of counter after incrementation: " + counter);

        --counter;
        System.out.println("The value of counter after decrementation: " + counter);
    }
}
