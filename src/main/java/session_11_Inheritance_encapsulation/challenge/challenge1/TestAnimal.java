package session_11_Inheritance_encapsulation.challenge.challenge1;

public class TestAnimal {
    /* Create a TestAnimal Class with a main method, create objects with each animal class created
    (dog, cat, wolf) and call sound() */

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.sound();

        Cat cat1 = new Cat();
        cat1.sound();

        Wolf wolf1 = new Wolf();
        wolf1.sound();
    }
}
