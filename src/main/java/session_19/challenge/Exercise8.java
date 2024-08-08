package session_19.challenge;

public class Exercise8 {
    // Given a string, use streams to count the number of vowels in it. (Input: String sentence = "Hello World";)

    public static void main(String[] args) {
        String sentence = "Hello World";

        long noOfVowels = sentence.chars()
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .count();

        System.out.println("Numbers of vowels: " + noOfVowels);
    }
}