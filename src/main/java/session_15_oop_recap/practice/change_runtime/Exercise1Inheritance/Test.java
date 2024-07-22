package session_15_oop_recap.practice.change_runtime.Exercise1Inheritance;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 2, "dog", "labrador", Size.MEDIUM);

        dog.bark();
        dog.fetch();
    }
}