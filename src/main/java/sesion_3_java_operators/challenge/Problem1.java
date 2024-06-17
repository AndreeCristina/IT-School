package sesion_3_java_operators.challenge;

public class Problem1 {

    public static void main(String[] args) {
        /* Write a Java program to calculate the total cost and change you get back when buying items.
        Given the price of an item price and the quantity, calculate the total cost.
        Assume you paid with a bill of 100. Print the total cost and the change you receive.*/

        double price = 5.5;
        int itemsNo = 3;

        double cost = price * itemsNo;
        double change = 100 - cost;

        System.out.println("Total cost: " + cost);
        System.out.println("Change: " + change);
        System.out.printf("The total cost is %f and the change is %f.", cost, change);
    }
}
