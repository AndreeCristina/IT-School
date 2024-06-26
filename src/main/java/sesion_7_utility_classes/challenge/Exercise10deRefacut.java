package sesion_7_utility_classes.challenge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise10deRefacut {
    /* 10. Date Authenticator Description: Engineer a method named isValidDate that captures a date string from the console
    and assesses if it conforms to a valid date format (YYYY-MM-DD). The method should also consider leap years when
    validating February dates. Input: A string of a date from the console. Expected Output: true if the input adheres
    to the date format and denotes a genuine date. false if otherwise. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a date (yyyy-MM-dd): ");
        String dateString = sc.nextLine();
    }

    public static boolean isValidDate(String dateString) {

        LocalDate parsedDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        if (parsedDate.getMonthValue() < 1 || parsedDate.getMonthValue() > 12) {
            return false;
        }

        int day = parsedDate.getDayOfMonth();
        if (day < 1 || day> 31) {
            return false;
        } else if (parsedDate.getMonthValue() == 4 || parsedDate.getMonthValue() == 6 || parsedDate.getMonthValue() == 9 || parsedDate.getMonthValue() == 11) {
            if (day == 30) {
                return false;
            } else if (parsedDate.getMonthValue() == 2) {
                if (parsedDate.getDayOfMonth() == 29 && parsedDate.isLeapYear()) {
                    return false;
                }
            }
        }
        return true;
    }
}
