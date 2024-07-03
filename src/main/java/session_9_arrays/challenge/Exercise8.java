package session_9_arrays.challenge;

public class Exercise8 {
    /* 8. In an array of strings representing movie titles, implement a linear search method
    to find whether a given movie title exists. If it does, print out its position in the array.*/

    public static void main(String[] args) {
        String[] movieTitle = {"Troll", "The Platform", "Black Crab", "Blood Red Sky", "My name is Vendetta"};

        String movieToFind = "Black Crab";
        for (int index = 0; index < movieTitle.length; index++) {
            if (movieTitle[index].equals(movieToFind)) {
                System.out.println(index);
            }
        }
    }
}
