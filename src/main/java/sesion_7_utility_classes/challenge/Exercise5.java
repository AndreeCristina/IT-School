package sesion_7_utility_classes.challenge;

import java.time.LocalDate;

public class Exercise5 {
    /* 5. Is Today a Specific Date? Description: Write a method named isTodaySpecificDate that checks if today's date
    is 10th December 2019. Expected Output: true if today's date is 2019-12-10. false otherwise.*/

    public static void main(String[] args) {
        LocalDate specificDate = LocalDate.of(2019, 12, 10);

        String compareDates = isTodaySpecificDate(specificDate) ? "true" : "false";
        System.out.println(compareDates);
    }

    public static boolean isTodaySpecificDate(LocalDate specificDate) {
        LocalDate today = LocalDate.now();
        return today.equals(specificDate);
    }
}
