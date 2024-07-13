package session_10_OOP.challenge.challenge1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Maria", "Nedelcu", "F", LocalDate.of(1989, 4, 7),
                "2890407080082", new Address("Str Ion Creanga ", "25", "B15", 5, "Botosani", "Botosani", "710456"));

        Professor professor1 = new Professor("Ioana", "Ignat", "F", LocalDate.of(1969, 6, 3), "2690603080042", new Address("Str. A T Laurian", "15", "-", 4, "Iasi", "Iasi", "741545"));
        Professor professor2 = new Professor("Gabriel", "Ionescu", "M", LocalDate.of(1980, 9, 8), "1800908070062", new Address("Str. Caragiale", "17", "-", 10, "Iasi", "Iasi", "791456"));
        Professor professor3 = new Professor("Marius", "Damean", "M", LocalDate.of(1978, 2, 15), "1780215080040", new Address("Ale. Nucului", "45", "-", 10, "Botosani", "Botosani", "733457"));
        Professor professor4 = new Professor("Alina", "Savescu", "F", LocalDate.of(1984, 4, 18), "2840418070050", new Address("Bld. Mihai Eminescu", "20", "-", 0, "Botosani", "Botosani", "741575"));
        Professor professor5 = new Professor("Monica", "Balan", "F", LocalDate.of(1992, 10, 25), "2921025070045", new Address("Ale. Fericirii ", "7", "-", 7, "Iasi", "Iasi", "741875"));
        Professor professor6 = new Professor("Gabriel", "Marin", "M", LocalDate.of(1989, 8, 28), "1890828080012", new Address("Str. Armeana", "78", "-", 7, "Iasi", "Iasi", "878974"));
        Professor professor7 = new Professor("Ariana", "Marin", "F", LocalDate.of(1995, 7, 14), "2950714070014", new Address("Str. Maxim", "1", "-", 11, "Vaslui", "Vaslui", "741500"));

        Course math = new Course(new Schedule(Schedule.Weekday.MONDAY, LocalTime.of(10, 0), LocalTime.of(10, 50)), "50 minute", "Math", "online", professor1);
        Course computerScience = new Course(new Schedule(Schedule.Weekday.MONDAY, LocalTime.of(11, 0), LocalTime.of(11, 50)), "50 minute", "Computer Science", "hybrid", professor4);
        Course physics = new Course(new Schedule(Schedule.Weekday.TUESDAY, LocalTime.of(9, 0), LocalTime.of(9, 50)), "50 minute", "Physics", "hybrid", professor3);
        Course chemistry = new Course(new Schedule(Schedule.Weekday.TUESDAY, LocalTime.of(10, 0), LocalTime.of(10, 50)), "50 minute", "Chemistry", "hybrid", professor2);
        Course biology = new Course(new Schedule(Schedule.Weekday.WEDNESDAY, LocalTime.of(8, 0), LocalTime.of(8, 50)), "50 minute", "Biology", "online", professor2);
        Course geography = new Course(new Schedule(Schedule.Weekday.WEDNESDAY, LocalTime.of(9, 0), LocalTime.of(9, 50)), "50 minute", "Geography", "online", professor5);
        Course english = new Course(new Schedule(Schedule.Weekday.THURSDAY, LocalTime.of(8, 0), LocalTime.of(8, 50)), "50 minute", "English", "online", professor6);
        Course history = new Course(new Schedule(Schedule.Weekday.THURSDAY, LocalTime.of(9, 0), LocalTime.of(9, 50)), "50 minute", "History", "online", professor7);

        System.out.println("Math " + math);
        System.out.println("Computer Science " + computerScience);
        System.out.println();
        System.out.println("Biology professor" + professor2);
        System.out.println();
        System.out.println("First student " + s1);
    }
}
