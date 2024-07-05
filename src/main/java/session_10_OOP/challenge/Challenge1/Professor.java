package session_10_OOP.challenge.Challenge1;

import java.time.LocalDate;

public class Professor {

    String firstName;
    String lastName;
    String gender;
    int age;
    LocalDate dateOfBirth;
    String CNP;
    String address;

    public Professor(String firstName, String lastName, String gender, int age, LocalDate dateOfBirth, String CNP, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        this.address = address;
    }
}
