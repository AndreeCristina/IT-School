package session_4_java_operators_loops.practice;

import java.util.Objects;

public class MemoryReference {

    public static void main(String[] args) {
        String greeting1 = "hello";
        String greeting2 = "Hello";
        String greeting3 = new String("Hello");

//        System.out.println(greeting1 == greeting2);
//        System.out.println(greeting1.equals(greeting2));
//        System.out.println(greeting2 == greeting3);

        User user1 = new User("John");
        user1 = null;
        User user2 = new User("John");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
}

class User {

    String firstName;

    public User(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(firstName);
    }
}
