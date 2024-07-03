package session_9_arrays.challenge;

import java.util.ArrayList;

public class Exercise2 {
    // 2. Create a wishlist for christmas with ArrayList and print the values

    public static void main(String[] args) {
        ArrayList<String> christmasWishList = new ArrayList<>();

        christmasWishList.add("books");
        christmasWishList.add("plane ticket to Madeira");
        christmasWishList.add("a paid course");

        for (int index = 0; index < christmasWishList.toArray().length; index++) {
            System.out.println((index + 1) + " " + christmasWishList.get(index));
        }
    }
}
