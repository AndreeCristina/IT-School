package session_7_utility_classes.extra_practice.local_date_time;

import java.time.LocalDateTime;

public class DateTimeExample {

    public static void main(String[] args) {
        // Creating a LocalDateTime object for the curent date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        // Creating a LocalDateTime object for a specific  date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 3, 28, 12, 30, 1);
        System.out.println(specificDateTime);

        int year = specificDateTime.getYear();
        int month = specificDateTime.getMonthValue();
        int day = specificDateTime.getDayOfMonth();
        int hour = specificDateTime.getHour();
        int minute = specificDateTime.getMinute();
        int second = specificDateTime.getSecond();


        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
    }
}
