package sesion_3_java_operators.challenge;

public class ProblemOne {

    public static void main(String[] args) {
        double price = 5.5;
        int itemsNo = 3;

        double cost = price * itemsNo;
        double change = 100 - cost;

        System.out.println("Total cost: " + cost);
        System.out.println("Change: " + change);
        System.out.printf("The total cost is %f and the change is %f.", cost, change);
    }
}
