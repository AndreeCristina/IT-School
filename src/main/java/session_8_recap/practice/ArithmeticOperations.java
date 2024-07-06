package session_8_recap.practice;

public class ArithmeticOperations {

    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 46;
        int value3 = 63;
        int value4 = 27;

        System.out.println("Addition: " + getSum(value1, value2));
        System.out.println("Addition: " + getSum(value3, value4));
        System.out.println("Substract: " + substract(value1, value2));
    }

    public static int getSum(int input1, int input2) {
        return input1 + input2;
    }

    public static int substract(int input1, int input2) {
        return input1 - input2;
    }
}
