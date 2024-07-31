package session_17_equals_hashcode_generics.challenge.exercise_2;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Simon");
        person1.setLastName("Perry");
        person1.setAge(32);
        person1.setEmail("simonperry@gmail.com");

        Person person2 = new Person();
        person2.setFirstName("Simon");
        person2.setLastName("Perry");
        person2.setAge(32);
        person2.setEmail("simonperry@gmail.com");

        Person person3 = new Person();
        person3.setFirstName("Jenifer");
        person3.setLastName("Perry");
        person3.setAge(33);
        person3.setEmail("jeniferperry@gmail.com");

        System.out.println("The hashCode for person1: " + person1.hashCode());
        System.out.println("The hashCode for person2: " + person2.hashCode());
        System.out.println("The hashCode for person3: " + person3.hashCode());
    }
}