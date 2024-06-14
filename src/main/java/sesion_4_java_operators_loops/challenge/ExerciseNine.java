package sesion_4_java_operators_loops.challenge;

public class ExerciseNine {

    public static void main(String[] args) {
        /* 9. Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA".
        Check if countryOne and countryTwo are equal using the equals() method and print the result.
        Then change the value of countryTwo to "UK" and check for equality again. Print the result.*/
        String countryOne = "USA";
        String countryTwo = "USA";

        if (countryOne.equals(countryTwo)) {
            System.out.println("The strings have the same content.");
        } else {
            System.out.println("The strings have different content.");
        }

        countryTwo = "UK";

        if (countryOne.equals(countryTwo)) {
            System.out.println("The strings have the same content.");
        } else {
            System.out.println("The strings have different content.");
        }
    }
}
