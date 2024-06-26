package sesion_7_utility_classes.extraPractice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class GettingInformationFromLocalDate {

    public static void main(String[] args) {
        // Creating a LocalDate object for a specific date
        LocalDate specificDate = LocalDate.of(2024,3,28);
        int year = specificDate.getYear();
        int month = specificDate.getMonthValue();
        int day = specificDate.getDayOfMonth();
        DayOfWeek dayOfWeek = specificDate.getDayOfWeek();
        int dayOfYear = specificDate.getDayOfYear();


        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Day of week: " + dayOfWeek);
        System.out.println("Day of year: " + dayOfYear);
    }
}
