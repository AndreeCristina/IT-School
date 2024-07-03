package session_9_arrays.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise7 {
    /* 7. Create an ArrayList containing names of fruits.
    Implement a custom sorting mechanism to arrange them in descending order based on their length.
    If two fruits have the same length, sort them in alphabetical order.*/

    public static void main(String[] args) {
        ArrayList<String> fruitsList = new ArrayList<>();

        fruitsList.add("mere");
        fruitsList.add("pere");
        fruitsList.add("gutui");
        fruitsList.add("struguri");
        fruitsList.add("prune");
        fruitsList.add("nectarine");

        Collections.sort(fruitsList);
    }
}
