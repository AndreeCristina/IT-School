package sesion_7_utility_classes.extra_practice.local_date;

import java.time.*;

public class OcpDateTimeZoned {

    public static void main(String[] args) {
        // current date and time
        LocalDate localDate = LocalDate.now();
        System.out.println("Date: " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("Time: " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and Time: " + localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Date Time: " + zonedDateTime);

        // create date object
        var date1 = LocalDate.of(2022, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2022, 1, 20);
        System.out.println("Specific date: " + date1);

        // create time object
        LocalTime time1 = LocalTime.of(12,13);
        LocalTime time2 = LocalTime.of(12, 13, 15);
        LocalTime time3 = LocalTime.of(12, 15, 25, 11);
        System.out.println("Specific time: " + time3 );

        //create date and time object
        LocalDateTime dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println("Specific date and time: " + dateTime1);

        //create a ZoneDateTime
        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(date1, time1, zone);
        var zoned3 = ZonedDateTime.of(dateTime1, zone);





    }
}
