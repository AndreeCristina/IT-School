package sesion_3_java_operators.challenge;

public class Exercise8 {

    public static void main(String[] args) {
        // 8. Create a program that takes two byte values,adds them together,
        // and stores the result in a byte variable.

        byte number1 = 10;
        byte number2 = 15;
        int sum = number1 + number1;
        byte result = (byte) sum;

        System.out.println("Sum of " + number1 + " and " + number2 + " is: " + result);
    }
}
