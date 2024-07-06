package session_7_utility_classes.extra_practice.local_date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ComparingLocalDate {

    public static void main(String[] args) {
        // Creating a LOcalDate object for a specific date
        LocalDate specificDate = LocalDate.of(2024, 3, 28);
        LocalDate anotherDate = LocalDate.of(2024, 4, 30);

        if (specificDate.isBefore(anotherDate)) {
            System.out.println("specificDate: " + specificDate + " is before anotherDate: " + anotherDate);
        } else if (specificDate.isAfter(anotherDate)) {
            System.out.println("SpecificDate: " + specificDate + " is after anotherDate: " + anotherDate);
        } else {
            System.out.println("specificDate:" + specificDate + " is equal to anotherDate: " + anotherDate);
        }
        long days = ChronoUnit.DAYS.between(specificDate, anotherDate);
        System.out.println("Days between " + specificDate + " and " + anotherDate + ":" + days);

        long month = ChronoUnit.MONTHS.between(specificDate, anotherDate);
        System.out.println("Month between " + specificDate + " and " + anotherDate + ":" + month);
    }
}
