package sesion_7_utility_classes.challenge;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise4 {
    /* 4. Comparing User-Entered Dates Description: Write a method named areDatesEqual that reads two dates from the console
     and returns true if they are equal, and false otherwise.Input: Two dates entered by the user in the format YYYY-MM-DD.
     Expected Output: true if both dates are equal. false if they are different.*/

    public static void main(String[] args) {
        areDatesEqual();
    }

    public static void areDatesEqual() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the first date (YYYY-MM-DD):");
        String firstDate = sc.nextLine();
        System.out.println("Please, enter the second date (YYYY-MM-DD)");
        String secondDate = sc.nextLine();

        LocalDate parsedFirstDate = LocalDate.parse(firstDate);
        LocalDate parsedSecondDate = LocalDate.parse(secondDate);

        boolean compareDates = parsedFirstDate.isEqual(parsedSecondDate);
        System.out.println(compareDates);
//        if (parsedFirstDate.isEqual(parsedSecondDate)) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
    }
}
