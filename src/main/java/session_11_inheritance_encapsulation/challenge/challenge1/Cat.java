package session_11_inheritance_encapsulation.challenge.challenge1;

public class Cat extends Animal {
    // Create a Cat class that extends Animal and overrides sound() method,and in this case, we want to print in our method “meow” */

    @Override
    public void sound() {
        System.out.println("meow");
    }
}
