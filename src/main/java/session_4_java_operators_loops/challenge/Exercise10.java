package session_4_java_operators_loops.challenge;

import java.util.ArrayList;

public class Exercise10 {

    public static void main(String[] args) {
        /* 10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
        Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element.
        Print both lists and observe the output.*/
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();

        listOne.add("Andreea");
        listOne.add("Maria");
        listOne.add("Medeea");
        listOne.add("Elena");
        listOne.add("Ariana");

//        listTwo = listOne; // Any changes made to one list will be reflected in the other.
        listTwo.addAll(listOne); // Changes made to one list won't affect the other.
        listOne.add("Cristina");

        System.out.println("The elements of the first list are: " + listOne);
        System.out.println("The elements of the second list are: " + listTwo);
    }
}
