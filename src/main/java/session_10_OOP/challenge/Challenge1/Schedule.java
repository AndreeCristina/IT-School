package session_10_OOP.challenge.Challenge1;

import java.time.LocalTime;

public class Schedule {

    private Weekday day;
    private LocalTime startCourse;
    private LocalTime endCourse;

    public Schedule(Weekday day, LocalTime startCourse, LocalTime endCourse) {
        this.day = day;
        this.startCourse = startCourse;
        this.endCourse = endCourse;
    }

    public enum Weekday {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "day='" + day + '\'' +
                ", startCourse='" + startCourse + '\'' +
                ", endCourse='" + endCourse + '\'' +
                '}';
    }
}
