package sesion_7_utility_classes.extra_practice.local_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDate {

    public static void main(String[] args) {
        // Creating a LOcalDate object for a specific date
        LocalDate specificDate = LocalDate.of(2024, 12, 28);

        System.out.println("Date before format: " + specificDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedDate = specificDate.format(formatter);
        System.out.println("Formatted date: " + formattedDate);
    }
}
