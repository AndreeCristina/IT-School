package sesion_7_utility_classes.challenge;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Exercise10not {
    /* 10. Date Authenticator Description: Engineer a method named isValidDate that captures a date string from the console
    and assesses if it conforms to a valid date format (YYYY-MM-DD). The method should also consider leap years when
    validating February dates. Input: A string of a date from the console. Expected Output: true if the input adheres
    to the date format and denotes a genuine date. false if otherwise. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a date (yyyy-MM-dd): ");
        String dateString = sc.nextLine();

        boolean valid = isValidDate(dateString);
        System.out.println("Is the date valid? " + valid);
    }

    public static boolean isValidDate(String dateString) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate parsedDate = LocalDate.parse(dateString, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
