package session_7_utility_classes.challenge;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Exercise11 {
    /* 11. Duration Since Description: Construct a method called elapsedTimeSince that ingests a prior time
    (in the HH:MM:SS format) as its input and displays the time duration from that moment to the present.
    Input: A time given in the format HH:MM:SS. Expected Output: The time span given as X hours, Y minutes, Z seconds.*/

    public static void main(String[] args) {
        LocalTime momentTime = LocalTime.of(14, 52, 0);
        LocalTime presentTime = LocalTime.now();

        System.out.println(elapsedTimeSince(momentTime, presentTime));
    }

    public static String elapsedTimeSince(LocalTime momentTime, LocalTime presentTime) {
        long durationHours = ChronoUnit.HOURS.between(momentTime, presentTime);
        long durationMinutes = ChronoUnit.MINUTES.between(momentTime, presentTime);
        long durationSeconds = ChronoUnit.SECONDS.between(momentTime, presentTime);

        LocalTime duration = LocalTime.of(0, 0, 0);

        duration = duration.plusHours(durationHours);
        duration = duration.plusMinutes(durationMinutes);
        duration = duration.plusSeconds(durationSeconds);

        return duration.toString();
    }
}
