package sesion_7_utility_classes.challenge;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise8 {
    /* 8. Weekday Identifier Description: Construct a method named findDayOfWeek that takes in a date and returns the specific
     day of the week (e.g., Monday, Tuesday, etc.) for that date. Input: A date in the format YYYY-MM-DD.
     Expected Output: The day of the week in string format (e.g., "Wednesday").*/

    public static void main(String[] args) {
        LocalDate myDate = LocalDate.of(2024,4,7);
        System.out.println("The day of the week is: " + findDayOfWeek(myDate));
    }

    public static String findDayOfWeek(LocalDate myDate) {
        DayOfWeek dayOfTheWeek = myDate.getDayOfWeek();
        return dayOfTheWeek.toString();
    }
}
