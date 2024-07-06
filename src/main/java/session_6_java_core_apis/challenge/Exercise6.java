package session_6_java_core_apis.challenge;

public class Exercise6 {
    /* Use the StringBuilder class to replace every occurrence of a substring within a given string with another substring.
    For instance, replace "cat" with "dog" in the string "The cat sat on the mat."*/

    public static String replaceSubstring(String myString, String from, String to) {
        if (myString == null || from.isEmpty()) {
            return myString;
        }

        StringBuilder sb = new StringBuilder();
        int start = 0;
        int index = 0;

        while ((index = myString.indexOf(from, index)) != -1) {
            sb.append(myString.substring(start, index));
            sb.append(to);
            start = index + from.length();
            index++;
        }

        sb.append(myString.substring(start));

        return sb.toString();
    }

    public static void main(String[] args) {
        String originalString = "The cat sat on the mat.";
        String replacedString = replaceSubstring(originalString, "cat", "dog");
        System.out.println("Original String: " + originalString);
        System.out.println("String with Replaced Substrings: " + replacedString);
    }
}
