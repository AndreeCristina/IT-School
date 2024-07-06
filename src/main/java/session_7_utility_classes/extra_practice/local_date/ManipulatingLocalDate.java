package session_7_utility_classes.extra_practice.local_date;

import java.time.LocalDate;

public class ManipulatingLocalDate {

    public static void main(String[] args) {
        // Creating a LocalDate object for a specific date
        LocalDate specificDate = LocalDate.of(2024, 3, 28);

        LocalDate futureDate = specificDate.plusDays(5);
        LocalDate pastDate = specificDate.minusMonths(2);
        LocalDate nextYear = specificDate.plusYears(1);

        System.out.println("Specific date: " + specificDate);
        System.out.println();
        System.out.println("Future date: " + futureDate);
        System.out.println("Past date: " + pastDate);
        System.out.println("Next year: " + nextYear);
    }
}
