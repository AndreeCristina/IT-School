package session_15_oop_recap.practice.change_runtime.Exercise2Abstraction;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println();
    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }
}