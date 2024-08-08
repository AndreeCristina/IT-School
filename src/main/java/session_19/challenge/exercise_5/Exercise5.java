package session_19.challenge.exercise_5;

import java.util.Arrays;
import java.util.List;

public class Exercise5 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", "Johnson", 20),
                new Person("Bob", "Smith", 17));

        List<String> resultList = people.stream()
                .filter(person -> person.getAge() > 18)
                .map(person -> person.firstName + " " + person.lastName)
                .toList();

        System.out.println(resultList);
    }
}