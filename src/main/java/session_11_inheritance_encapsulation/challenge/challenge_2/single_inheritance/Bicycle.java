package session_11_inheritance_encapsulation.challenge.challenge_2.single_inheritance;

public class Bicycle {

       private int speed;
       private int gear;

    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("The gear changed to " + gear);
    }

    public void speedUp(int increaseWith) {
        this.speed += increaseWith;
        System.out.println("Speed increase to " + speed + "km/h");
    }

    public void applyBrake(int decreaseWith) {
        this.speed -= decreaseWith;
        System.out.println("Speed decreased to " + speed + " km/h");
    }

       public void setSpeed(int speed) {
           this.speed = speed;
       }

       public int getSpeed() {
           return speed;
       }

       public void setGear(int gear) {
           this.gear = gear;
       }

       public int getGear() {
           return gear;
       }
}