package session_7_utility_classes.challenge;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise9 {
    /* 9. Interval Between Dates Description: Design a method titled daysBetween that reads two dates from the console
    and computes the total number of days between them. Input: Two dates given by the user in the format YYYY-MM-DD.
    Expected Output: An integer showcasing the difference in days between the two dates. */

    public static void main(String[] args) {
        System.out.println(daysBetween());
    }

    public static long daysBetween() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first date:");
        String firstDate = sc.nextLine();
        System.out.println("Please, enter the second date:");
        String secondDate = sc.nextLine();

        LocalDate parsedFirstDate = LocalDate.parse(firstDate);
        LocalDate parsedSecondDate = LocalDate.parse(secondDate);

        sc.close();

        return ChronoUnit.DAYS.between(parsedFirstDate, parsedSecondDate);
    }
}
