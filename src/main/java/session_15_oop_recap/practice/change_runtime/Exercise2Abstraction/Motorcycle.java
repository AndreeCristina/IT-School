package session_15_oop_recap.practice.change_runtime.Exercise2Abstraction;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating");
    }
}