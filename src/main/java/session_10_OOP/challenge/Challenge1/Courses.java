package session_10_OOP.challenge.Challenge1;

public class Courses {

    Schedule schedule;
    String duration;
    String courseName;
    String description;
    Professor professorAssigned;

    public Courses(Schedule schedule, String duration, String courseName, String description, Professor professorAssigned) {
        this.schedule = schedule;
        this.duration = duration;
        this.courseName = courseName;
        this.description = description;
        this.professorAssigned = professorAssigned;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "schedule='" + schedule + '\'' +
                ", duration='" + duration + '\'' +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", professorAssigned=" + professorAssigned +
                '}';
    }
}
