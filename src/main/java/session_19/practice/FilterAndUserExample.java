package session_19.practice;

import session_19.practice.user.User;

import java.util.Arrays;
import java.util.List;

public class FilterAndUserExample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", "Doe", 25),
                new User("Bob", "Smith", 28),
                new User("Alice", "Carter", 23)
        );

        // filter users alder than 26 and map to their first name
        List<String> results = users.stream()
                .filter(user -> user.getAge() > 26)
                // .map(user -> user.getFirstName())
                .map(User::getFirstName)
                .toList();

        System.out.println(results);
    }
}