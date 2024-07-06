package session_7_utility_classes.challenge;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise12not {
    /* 12. Time Conversion Across Zones Description: Develop a method named convertToTimeZone that collects a date and time
    from the console in the pattern YYYY-MM-DD HH:MM:SS and a timezone (like "EST", "PST"). The objective is to transmute
    the specified date and time to align with the provided timezone and then showcase the result.
    Input: Date and time structured as YYYY-MM-DD HH:MM:SS. A string indicating the timezone (e.g., "EST").
    Expected Output: The recalibrated date and time synchronized with the inputted timezone. */

    public static void main(String[] args) {
        convertToTimeZone();
    }

    public static void convertToTimeZone() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the date and time [YYYY-MM-DDTHH:MM:SS]: ");
        String myDateTime = sc.nextLine();

        System.out.println("Please, enter the timezone: (e.g. EST PST)");
        String targetZone = sc.nextLine();

        LocalDateTime parsedMyDateTime = LocalDateTime.parse(myDateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ZonedDateTime zone = parsedMyDateTime.atZone(ZoneId.of(targetZone));
    }
}
