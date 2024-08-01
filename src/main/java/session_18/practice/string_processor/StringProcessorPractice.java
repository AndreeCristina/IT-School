package session_18.practice.string_processor;

public class StringProcessorPractice {

    public static void main(String[] args) {
        StringProcessor removeWhiteSpaces = string -> string.replace(" ", "");
        StringProcessor toUpperCase = str -> str.toUpperCase();

        StringProcessor combined = removeWhiteSpaces.anThen(toUpperCase);
        System.out.println(combined.processor("Hello world"));
    }
}