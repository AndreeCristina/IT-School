package sesion_6_java_core_apis.challenge;

public class Exercise7 {
    /* 7. Duplicate Character Remover / Design a program using StringBuilder that removes duplicate characters from a string.
     For example, "balloon" should become "balon".*/
    public static void main(String[] args) {
        String myString = "Andreea";

        StringBuilder sb = new StringBuilder(myString);

        for (int index = 1; index < myString.length(); index++) {
            if (sb.charAt(index - 1) == sb.charAt(index)) {
                sb.deleteCharAt(index);
            }
        }
        String myNewString = sb.toString();

        System.out.println("My new String is: " + myNewString);
    }
}
