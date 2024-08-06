package session_18.challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise4 {
    /* You are given a List<String> representing a list of words. Create a lambda expression to sort the list
    in alphabetical order. Next, modify your lambda expression to sort the list in reverse alphabetical order. */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("zebra", "giraffe", "lion", "elephant", "tiger");

        Collections.sort(myList, (w1, w2) -> w1.compareTo(w2));
        System.out.println("The list in alphabetical order: " + myList);

        Collections.sort(myList, (w1, w2) -> w2.compareTo(w1));
        System.out.println("The list in alphabetical order: " + myList);
    }
}