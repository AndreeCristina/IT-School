package session_9_arrays.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
        /* 3. Create 2 empty ArrayLists: studentList and graduateStudentList
        - populate studentList with 10 students, copy values from studentList to graduateStudentList,
        iterate through graduateStudentList and print each graduated student */

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        int noOfStudents = 10;
        Scanner sc = new Scanner(System.in);

        for (int index = 0; index < noOfStudents; index++) {
            System.out.println("Please, enter a student:");
            studentList.add(sc.nextLine());
        }

        graduateStudentList.add(studentList.get(2));
        graduateStudentList.add(studentList.get(4));
        graduateStudentList.add(studentList.get(6));
        graduateStudentList.add(studentList.get(8));

        System.out.println("Graduate students: ");
        for (String graduateStudent : graduateStudentList) {
            System.out.print(graduateStudent + " ");
        }

        sc.close();
    }
}
