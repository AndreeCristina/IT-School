package sesion_6_java_core_apis.challenge;

public class Exercise7 {
    /* 7. Duplicate Character Remover / Design a program using StringBuilder that removes duplicate characters from a string.
     For example, "balloon" should become "balon".*/
    public static String removeDuplicates(String str) {
        if (str.isEmpty() || str == null) {
            return str;
        }

        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));
        for (int index = 1; index <= str.length() - 1; index++) {
            if (str.charAt(index) != str.charAt(index - 1)) {
                sb.append(str.charAt(index));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String myString = "balloon";
        String myNewString = removeDuplicates(myString);

        System.out.println("The original string is: " + myString);
        System.out.println("The string without duplicates is: " + myNewString);
    }
}
