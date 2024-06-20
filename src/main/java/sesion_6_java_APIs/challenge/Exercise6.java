package sesion_6_java_APIs.challenge;

public class Exercise6 {

    public static void main(String[] args) {
        /* 6. String Replacement. Use the StringBuilder class to replace every of a substring within a given string
        with another substring. For instance, replace "cat" with "dog" in the string "The cat sat on the mat." */
        String myString = "The cat sat on the mat.";
        String replaceString = replace(myString, "cat", "dog");

        System.out.println("The original sentence is: " + myString);
        System.out.println("The sentence after replaced string: " + replaceString);
    }

    public static String replace(String myString, String subsFrom, String subsTo) {
        if (myString.isEmpty() || myString == null) {
            return myString;
        }

        StringBuilder sb = new StringBuilder();
        int start = 0;

        int index = myString.indexOf(subsFrom);
        while (index != -1) {
            sb.append(myString.substring(start,index));
            sb.append(subsTo);
            start = index + subsFrom.length();
            index = myString.indexOf(subsFrom, start);
        }
        sb.append(myString.substring(start));
        return myString.toString();
    }
}
