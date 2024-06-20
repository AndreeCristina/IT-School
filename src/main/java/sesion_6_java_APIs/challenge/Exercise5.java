package sesion_6_java_APIs.challenge;


public class Exercise5 {

    public static void main(String[] args) {
        /* 5. Word Capitalizer: Write a program that capitalizes the first letter of every word in a sentence using
        the StringBuilder class.*/
        String mySentence = "this is my favorite song.";
        String myCapitalizeSentence = capitalizeWord(mySentence);

        System.out.println("My original sentence is: " + mySentence);
        System.out.println("My capitalize sentence is: " + myCapitalizeSentence);
    }

    public static String capitalizeWord(String sentence) {
        if (sentence.isEmpty() || sentence == null) {
            return sentence;
        }

        StringBuilder sb = new StringBuilder();
        boolean next = true;

        for (char c : sentence.toCharArray()) {
            if (Character.isWhitespace(c)) {
                sb.append(c);
                next = true;
            } else {
                sb.append(next ? Character.toUpperCase(c) : c);
                next = false;
            }
        }
        return sb.toString();
    }
}
