package sesion_4_java_operators_loops.challenge;

public class Exercise16 {

    public static void main(String[] args) {
        /* 16. Write a Java program where you use unary operators to perform a series of transformations on an integer variable number
        initialized to 50. First, negate number, then take the absolute value, and finally increment it by 1.
        Print the result at each step.*/
        int number = 50;

        int negateNumber = -number;
        System.out.println("number after negate: " + negateNumber);

        int absValue;
        absValue = Math.abs(negateNumber);
//        if (negateNumber < 0) {
//            absValue = -negateNumber;
//        } else {
//            absValue = negateNumber;
//        }
        System.out.println("the absolute number is " + absValue);

        ++absValue;
        System.out.println("the absolute value after increment is: " + absValue);
    }
}
