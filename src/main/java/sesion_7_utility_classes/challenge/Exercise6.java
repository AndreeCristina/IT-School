package sesion_7_utility_classes.challenge;

import java.time.LocalTime;

public class Exercise6 {
    /* 6. Getting Current Time. Description: Write a method named displayCurrentTime that prints the current time to the console.
    Expected Output: The current time in the format HH:MM:SS.*/
    public static void main(String[] args) {
        displayCurrentTime();
    }

    public static void displayCurrentTime() {
        LocalTime time = LocalTime.now();
        System.out.println("The time is: " + time);
    }
}
