package session_8_recap.practice;

public class FirstLetter {
    /* Capitalize First Letter Description: Write a method that takes a string and capitalizes the first letter of each word.
    Use loops and string manipulation methods. Test the method with different strings and print the results.*/

    public static void main(String[] args) {
        String input = "apple,banana,orange,blueberry";
        String[] inputArray = input.split(",");

        StringBuilder sb = new StringBuilder();
        for (String word : inputArray) {
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(",");
        }

        System.out.println(sb);
    }
}
