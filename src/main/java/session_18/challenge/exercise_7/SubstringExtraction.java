package session_18.challenge.exercise_7;

public class SubstringExtraction {
    /* Create a functional interface that takes a string and an integer n as parameters and returns a string.
    Implement it using a lambda expression that returns the first n characters of the string. If n is larger
    than the length of the string, it should return the full string.*/

    public static void main(String[] args) {
        ExtractASubstring extractor = (str, n) -> n >= str.length() ? str : str.substring(0, n);

        String firstSituation = extractor.extract("apple", 10);
        String secondSituation = extractor.extract("strawberry", 5);

        System.out.println(firstSituation);
        System.out.println(secondSituation);
    }
}