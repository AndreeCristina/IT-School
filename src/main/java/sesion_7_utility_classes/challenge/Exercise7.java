package sesion_7_utility_classes.challenge;

import java.time.LocalDate;

public class Exercise7 {
    /* 7. Date Arithmetic Description: Write a method named addWeeksToToday that accepts an integer as its argument.
    This integer denotes the number of weeks. The method should add this number of weeks to today's date and return the resultant
    date. Input: An integer n (e.g., 4). Expected Output: A date object that is n weeks from today. */

    public static void main(String[] args) {
        int numberOfWeeks = 4;
        System.out.println("The date after added " + numberOfWeeks + " weeks is: " + addWeeksToToday(numberOfWeeks) );
    }

    public static LocalDate addWeeksToToday(int numberOfWeeks) {
        LocalDate today = LocalDate.now();
        return today.plusWeeks(numberOfWeeks);
    }
}
