package sesion_6_java_APIs.challenge;

public class Exercise1 {

    public static void main(String[] args) {
        /* 1. Reverse a String. Description: Use the StringBuilder class to write a program that reverses an input string.
        For example, the input "hello" should return "olleh".*/
        String myString = "Hello";
        System.out.println("My string is: " + myString);

        StringBuilder reversedMyString = new StringBuilder(myString).reverse();

        System.out.println("My reversed string is: " + reversedMyString);
    }
}