package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {
    //Write a Java program to increase the size of an array list.

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");

        System.out.println("Initial size: " + colors.size());

        colors.add("pink");
        colors.add("brown");
        colors.add("purple");

        System.out.println("Size after adding elements: " + colors.size());
    }
}