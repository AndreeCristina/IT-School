package session_5_advanced_flow_control.challenge;

public class Exercise8 {

    public static void main(String[] args) {
        /* 8. For Loop. Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to
        accomplish this.*/
        int firstNo = 1, secondNo = 1;

        System.out.print(firstNo + " " + secondNo + " ");

        for (int i = 3; i <= 10; ++i) {
            int nextNo = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = nextNo;

            System.out.print(nextNo + " ");
        }
    }
}
