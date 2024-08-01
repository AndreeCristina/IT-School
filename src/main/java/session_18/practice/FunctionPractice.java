package session_18.practice;

import java.util.function.Function;

public class FunctionPractice {
    /* For this problem, you need to explore predefined functional interfaces in Java. Utilize Function<T,R> interface
    from java.util.function package to create a lambda expression that takes a string as input and returns its length.*/

    public static void main(String[] args) {
        Function<String, Integer> strLengthFinder = str -> str.length();
        System.out.println(strLengthFinder.apply("Hello"));
    }
}