package session_20.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class Problem2 {
    /* Using Java's built-in date/time libraries, generate a list of all Mondays in the upcoming year.
    Print out each Monday's date. */

    public static void main(String[] args) {
        int nextYear = Year.now().getValue() + 1;
        LocalDate date = LocalDate.of(nextYear, 1, 1);
        LocalDate firstMonday = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));

        while (firstMonday.getYear() == nextYear) {
            System.out.println(firstMonday);
            firstMonday = firstMonday.plusWeeks(1);
        }
    }
}