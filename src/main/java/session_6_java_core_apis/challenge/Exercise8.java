package session_6_java_core_apis.challenge;

public class Exercise8 {
    /* 8. Inserting at Index. Description: Write a Java program that inserts a given string into another string
    at a specified index using the StringBuilder class.*/
    public static String insertString(String str1, String strToInsert, int indexToInsert) {
        if (str1 == null || strToInsert == null || indexToInsert < 0 || indexToInsert > str1.length()) {
            return "Invalid input.";
        }
        StringBuilder sb = new StringBuilder(str1);

        sb.insert(indexToInsert, strToInsert);

        return sb.toString();
    }

    public static void main(String[] args) {
        String firstString = "Andreea";
        String stringToInsert = "Cristina";
        int indexToInsert = 6;

        String stringInserted = insertString(firstString, stringToInsert, indexToInsert);

        System.out.println("The string inserted is: " + stringInserted);
    }
}
