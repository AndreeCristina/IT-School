package session_10_OOP.challenge.Challenge1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Andreea", "Cepoi", "F", 35, LocalDate.of(1989,4, 7), "2890407080082", "Botosani");

        Professor profMath = new Professor("Ioana", "Ignat", "F", 55, LocalDate.of(1969, 6, 3), "2690603080042", "Iasi");
        Professor profCompScience = new Professor("Gabriel", "Ionescu", "M", 43, LocalDate.of(1980, 9, 8), "1800908070062", "Brasov");
        Professor profPhysics = new Professor("Marius", "Damean", "M", 46, LocalDate.of(1978, 2, 15), "1780215080040", "Iasi" );
        Professor profChemistry = new Professor("Alina", "Savescu", "F", 40, LocalDate.of(1984, 4, 18), "2840418070050", "Botosani");
        Professor profBiology = new Professor("Monica", "Balan", "F", 31, LocalDate.of(1992, 10, 25), "2921025070045", "Galati");
        Professor profGeography = new Professor("Gabriel", "Marin", "M", 34, LocalDate.of(1989, 8, 28), "1890828080012", "Iasi");
        Professor profEnglish = new Professor("Ariana", "Marin", "F", 28, LocalDate.of(1995, 7, 14), "2950714070014", "Vaslui");
        Professor profHistory = new Professor("Flavius", "Sauciuc", "M", 37, LocalDate.of(1987,03, 22), "1870322080013", "Brasov");

        Courses math = new Courses(new Schedule("Luni", "10:00", "10:50"), "", "Math", "online/fizic", profMath);
        Courses computerScience = new Courses(new Schedule("Luni", "11:00", "10:50"), "1", "Computer Science", "prezenta fizica", profCompScience);
        Courses physics = new Courses(new Schedule("Marti","09:00", "09:50"), "1", "Physics", "fizic", profPhysics);
        Courses chemistry = new Courses("Marti", "1", "")

    }

}
