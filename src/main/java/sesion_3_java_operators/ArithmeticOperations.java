package sesion_3_java_operators;

public class ArithmeticOperations {

    // psvm - generare main method
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 3;

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        // sout -
        System.out.println("Sum of numbers: " + sum);
        // ctr + d - duplicate line
        // ctr + y - delete line
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);


    }

    public static class LogicalComplementAndNegotiationOperators {
        public static void main(String[] args) {
            boolean isFirstTime = true;
            boolean isRegistered = false;

            System.out.println("Default value: isFirstTime " + isFirstTime);
            System.out.println("Updated value: isFirstTime " + !isFirstTime);

            System.out.println("Default value: isRegistered " + isRegistered);
            System.out.println("Updated value: isRegistered " + !isRegistered);


        }
    }
}
