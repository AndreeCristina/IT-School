package session_6_java_core_apis.challenge;

public class Exercise9 {
    /* 9. Frequency Counter. Description: Using StringBuilder, write a program that counts the frequency of each character
    in a string.*/
    public static void countFrequency(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Invalid input.I don't have characters to count.");
            return;
        }

        int[] charCounts = new int[256];
        for (char c : str.toCharArray()) {
            charCounts[c]++;
        }

        for (int index = 0; index < charCounts.length; index++) {
            if (charCounts[index] > 0) {
                char c = (char) index;
                System.out.println("Character " + c + " occurred " + charCounts[index] + " times.");
            }
        }
    }

    public static void main(String[] args) {
        String myString = "Please, count the frequency of the characters in the string.";

        countFrequency(myString);
    }
}
