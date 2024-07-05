package session_10_OOP.challenge.Challenge1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Andreea", "Cepoi", "F", 35, LocalDate.of(1989, 4, 7),
                "2890407080082", new Address("Str.", "Ion Luca Caragiale", 40, 5, "Botosani", "Botosani", 710339, "Romania"));

        Professor profMath = new Professor("Ioana", "Ignat", "F", 55, LocalDate.of(1969, 6, 3), "2690603080042", "Iasi");
        Professor profCompScience = new Professor("Gabriel", "Ionescu", "M", 43, LocalDate.of(1980, 9, 8), "1800908070062", "Brasov");
        Professor profPhysics = new Professor("Marius", "Damean", "M", 46, LocalDate.of(1978, 2, 15), "1780215080040", "Iasi");
        Professor profChemistry = new Professor("Alina", "Savescu", "F", 40, LocalDate.of(1984, 4, 18), "2840418070050", "Botosani");
        Professor profBiology = new Professor("Monica", "Balan", "F", 31, LocalDate.of(1992, 10, 25), "2921025070045", "Galati");
        Professor profGeography = new Professor("Gabriel", "Marin", "M", 34, LocalDate.of(1989, 8, 28), "1890828080012", "Iasi");
        Professor profEnglish = new Professor("Ariana", "Marin", "F", 28, LocalDate.of(1995, 7, 14), "2950714070014", "Vaslui");
        Professor profHistory = new Professor("Flavius", "Sauciuc", "M", 37, LocalDate.of(1987, 3, 22), "1870322080013", "Brasov");

        Courses math = new Courses(new Schedule("Luni", "10:00", "10:50"), "50 minute", "Math", "online", profMath);
        Courses computerScience = new Courses(new Schedule("Luni", "11:00", "10:50"), "50 minute", "Computer Science", "hybrid", profCompScience);
        Courses physics = new Courses(new Schedule("Marti", "09:00", "09:50"), "50 minute", "Physics", "hybrid", profPhysics);
        Courses chemistry = new Courses(new Schedule("Marti", "10:00", "11:00"), "50 minute", "Chemistry", "hybrid", profChemistry);
        Courses biology = new Courses(new Schedule("Miercuri", "08:00", "08:50"), "50 minute", "Biology", "online", profBiology);
        Courses geography = new Courses(new Schedule("Miercuri", "09:00", "09:50"), "50 minute", "Geography", "online", profGeography);
        Courses english = new Courses(new Schedule("Joi", "08:00", "08:50"), "50 minute", "English", "online", profEnglish);
        Courses history = new Courses(new Schedule("Joi", "09:00", "09:50"), "50 minute", "History", "online", profHistory);

        System.out.println("Math " + math);
        System.out.println("Computer Science " + computerScience);
        System.out.println();
        System.out.println("Biology professor" + profBiology);
        System.out.println();
        System.out.println("First student " + s1);
    }
}
