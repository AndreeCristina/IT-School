package sesion_7_utility_classes.challenge;

import java.time.LocalDate;

public class Exercise1 {
    /* 1. Displaying Today's Date Description: Write a method named displayTodaysDate that, when called,
    prints the current date to the console. Expected Output: Today's date in the format YYYY-MM-DD. */
    public static void main(String[] args) {
        displayTodaysDate();
    }

    public static void displayTodaysDate() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's day is: " + today);
    }
}
