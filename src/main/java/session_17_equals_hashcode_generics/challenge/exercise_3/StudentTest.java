package session_17_equals_hashcode_generics.challenge.exercise_3;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("Simon");
        student1.setLastName("Pike");
        student1.setStudentId(123L);
        student1.setAge(32);
        student1.setEmail("simonpike@gmail.com");

        Student student2 = new Student();
        student2.setFirstName("Simon");
        student2.setLastName("Pike");
        student2.setStudentId(123L);
        student2.setAge(32);
        student2.setEmail("simonpike@gmail.com");

        System.out.println("student1 equals student2: " + student1.equals(student2));

        System.out.println("hashCode for student1: " + student1.hashCode());
        System.out.println("hashCode for student2: " + student2.hashCode());
    }
}