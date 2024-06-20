package sesion_6_java_APIs.challenge;

public class Exercise4 {

    public static void main(String[] args) {
        /* 4. Removing Vowels Description: Create a Java program that uses the StringBuilder class to remove all the vowels
        from an input string.*/
        String myString = "Andreea";
        String myNewString = removeVowels(myString);
        System.out.println("The original string is: " + myString);
        System.out.println("The string after I removed vowels is: " + myNewString);
    }

    public static String removeVowels(String myString) {
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (!isVowels(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean isVowels(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
