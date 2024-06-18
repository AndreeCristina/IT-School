package sesion_5_advanced_flow_control.challenge;

public class Exercise8 {

    public static void main(String[] args) {
        /* 8. For Loop. Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to
        accomplish this.*/
        int firstNo = 0, secondNo = 1;

        System.out.print(1 + " ");

        for (int i = 2; i <= 10; ++i) {
            int nextNo = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = nextNo;

            System.out.print(nextNo + " ");
        }
    }
}
