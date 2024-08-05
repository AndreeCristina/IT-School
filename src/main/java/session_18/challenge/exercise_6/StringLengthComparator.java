package session_18.challenge.exercise_6;

public class StringLengthComparator {
    /* Create a functional interface with a method that takes two strings as input and returns an integer.
    Implement this interface using a lambda expression to create a custom comparator that compares strings based on
    their length (not lexicographically). */

    public static void main(String[] args) {
        StringComparator comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        String s1 = "apple";
        String s2 = "banana";

        int result = comparator.compare(s1, s2);

        System.out.println(result);
    }
}