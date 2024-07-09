package session_9_arrays.challenge;

import java.util.LinkedList;

public class Exercise6 {
    /* 6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list.
    If it does, remove that name from the list.*/

    public static void main(String[] args) {
        LinkedList<String> studentsName = new LinkedList<>();
        studentsName.add("John");
        studentsName.add("George");
        studentsName.add("Julia");
        studentsName.add("Helen");

        String particularName = "Martin";

        if (studentsName.contains(particularName)) {
            studentsName.remove(particularName);
            System.out.println("I removed the name from the list.");
        } else {
            System.out.println("The name " + particularName + " isn't in the list");
        }
    }
}
