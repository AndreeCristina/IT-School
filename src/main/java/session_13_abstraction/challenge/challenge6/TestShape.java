package session_13_abstraction.challenge.challenge6;

public class TestShape {

    public static void main(String[] args) {
        Area area1 = new Area();

        System.out.println("The square area is: " + area1.squareArea(5.5));
        System.out.println("The rectangle area is: " + area1.rectangleArea(10.5, 4));
        System.out.println("The circle area is: " + area1.circleArea(5.5));
    }
}