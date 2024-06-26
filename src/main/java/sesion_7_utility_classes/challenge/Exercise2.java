package sesion_7_utility_classes.challenge;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise2 {
    /* 2. Date Decomposition Description: Write a method named displayDateComponents that accepts a date as an argument
    and prints its year, month (+day of week, day of the year) and day components separately. Input: A date in the format YYYY-MM-DD. Expected Output:
makefile Copy code Year: YYYY Month: MM Day: DD */

    public static void main(String[] args) {
        LocalDate myDate = LocalDate.of(2024, 4, 7);
        displayDateComponents(myDate);
    }

    public static void displayDateComponents(LocalDate myDate) {
        int year = myDate.getYear();
        int month = myDate.getMonthValue();
        int day = myDate.getDayOfMonth();
        DayOfWeek dayOfWeek = myDate.getDayOfWeek();
        int dayOfYear = myDate.getDayOfYear();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Day of week: " + dayOfWeek);
        System.out.println("Day of Year: " + dayOfYear);
    }
}
