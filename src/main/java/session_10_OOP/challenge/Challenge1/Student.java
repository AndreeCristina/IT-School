package session_10_OOP.challenge.Challenge1;

import java.time.LocalDate;

public class Student {

    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private String PIN;
    private Address address;

    public Student(String firstName, String lastName, String gender, LocalDate dateOfBirth, String PIN, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.PIN = PIN;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", PIN='" + PIN + '\'' +
                ", address=" + address +
                '}';
    }
}
