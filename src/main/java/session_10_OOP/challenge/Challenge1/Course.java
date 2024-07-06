package session_10_OOP.challenge.Challenge1;

public class Course {

    Schedule schedule;
    String duration;
    String name;
    String description;
    Professor professorAssigned;

    public Course(Schedule schedule, String duration, String name, String description, Professor professorAssigned) {
        this.schedule = schedule;
        this.duration = duration;
        this.name = name;
        this.description = description;
        this.professorAssigned = professorAssigned;
    }

    @Override
    public String toString() {
        return "Course{" +
                "schedule=" + schedule +
                ", duration='" + duration + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", professorAssigned=" + professorAssigned +
                '}';
    }
}
