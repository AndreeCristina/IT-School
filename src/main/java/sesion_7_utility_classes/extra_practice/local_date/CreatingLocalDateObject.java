package sesion_7_utility_classes.extra_practice.local_date;

import java.time.LocalDate;

public class CreatingLocalDateObject {

    public static void main(String[] args) {
        // Creating a LocalDate object for today's date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        // Creating a LocalObject for a specific date
        LocalDate specificDate = LocalDate.of(2024, 3, 28);
        System.out.println(specificDate);

        // Parsing a string to get a LocalDate object
        LocalDate parsedDate = LocalDate.parse("2024-03-28");
        System.out.println(parsedDate);
    }
}
