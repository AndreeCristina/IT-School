package session_11_Inheritance_encapsulation.practice;

public class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.eat();
    }
}


