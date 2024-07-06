package session_6_java_core_apis.challenge;

import java.util.Scanner;

public class Exercise11 {
    /* 11. Encode and Decode using Caesar Cipher Description: Implement a Caesar Cipher encoder and decoder using
    the StringBuilder class. The Caesar Cipher involves rotating letters a certain number of steps down or up the alphabet.
    For example, with a shift of 1, 'A' would be replaced by 'B', 'B' would become 'C', and so on.*/

    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encoding(String pText, int key) {
        pText = pText.toLowerCase();
        String cText = "";
        for (int i = 0; i < pText.length(); i++) {
            int charIndex = alphabet.indexOf(pText.charAt(i));
            int newIndex = (charIndex + key) % 26;
            char cipherChar = alphabet.charAt(newIndex);
            cText = cText + cipherChar;
        }
        return cText;
    }

    public static String decoding(String cText, int key) {
        cText = cText.toLowerCase();
        String pText = "";
        for (int i = 0; i < cText.length(); i++) {
            int charIndex = alphabet.indexOf(cText.charAt(i));
            int newIndex = (charIndex - key) % 26;
            if (newIndex < 0) {
                newIndex = alphabet.length() + newIndex;
            }
            char plainChar = alphabet.charAt(newIndex);
            pText = pText + plainChar;
        }
        return pText;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter plain text >> ");
        String plain = sc.nextLine();

        System.out.println("Enter the key >> ");
        int key = sc.nextInt();

        String cipherText = encoding(plain, key);

        System.out.println("The cipher text is: " + cipherText);

        System.out.println("The decoder message is: " + decoding(cipherText, key));
    }
}
