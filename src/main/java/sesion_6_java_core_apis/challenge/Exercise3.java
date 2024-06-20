package sesion_6_java_core_apis.challenge;

public class Exercise3 {

    public static String concatenateStrings(String[] myListOfString) {
        if (myListOfString == null || myListOfString.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (String str : myListOfString) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        /* 3. Concatenate Multiple Strings. Description: Given a list of strings,
        use StringBuilder to concatenate them into a single string efficiently.*/
        String[] myListOfString = {"This", " ", "is", " ", "a", " ", "list", " ", "of", " ", "string", "."};

        String mySentence = concatenateStrings(myListOfString);

        System.out.println("My concatenated list is: " + mySentence);
    }
}
