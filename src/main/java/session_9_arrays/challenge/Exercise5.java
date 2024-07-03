package session_9_arrays.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    /* 5. Create an ArrayList that stores city names. Add at least five city names initially.
    Then, prompt the user to add a city name. If the city name is already in the list, display a message saying it's a duplicate;
    otherwise, add it to the list.*/

    public static void main(String[] args) {
        ArrayList<String> cityNames = new ArrayList<>();

        cityNames.add("Brasov");
        cityNames.add("Cluj");
        cityNames.add("Iasi");
        cityNames.add("Timisoara");
        cityNames.add("Oradea");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a city name: ");
        String city = sc.nextLine();

        if (cityNames.contains(city)) {
            System.out.println("It's a duplicate.");
        } else {
            cityNames.add(city);
        }

        sc.close();
    }
}
