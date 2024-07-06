package session_7_utility_classes.challenge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise3 {
    /* 3. Create a Specific Date. Description: Write a method named createSpecificDate that returns a date object
    representing 19th August 2025. Expected Output: A date object for 2025-8-19.*/

    public static void main(String[] args) {
        LocalDate myDate = LocalDate.of(2025, 8, 19);
        createSpecificDate(myDate);
    }

    public static void createSpecificDate(LocalDate myDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd'th' MMMM yyyy");
        String formattedDate = myDate.format(formatter);
        System.out.println("Formatted date: " + formattedDate);
    }
}
