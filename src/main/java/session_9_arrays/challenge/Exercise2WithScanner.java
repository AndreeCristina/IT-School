package session_9_arrays.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2WithScanner {
    // 2. Create a wishlist for christmas with ArrayList and print the values

    public static void main(String[] args) {
        ArrayList<String> christmasWishList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number of wishes:");
        int noOfWishes = sc.nextInt();

        for (int index = 0; index < noOfWishes; index++) {
            System.out.println("Please, enter a wish: ");
            christmasWishList.add(sc.nextLine());
        }

        for (String elements : christmasWishList) {
            System.out.print(elements + " ");
        }

        sc.close();
    }
}
