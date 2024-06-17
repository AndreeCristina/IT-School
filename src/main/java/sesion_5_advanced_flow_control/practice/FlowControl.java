package sesion_5_advanced_flow_control.practice;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {

    public static void main(String[] args) {
//        printNumberWithWill(10);
//        printNumberWithDoWhile(10);
//        printNumberWithFor(10);
//        int[] arrayExample = {1, 5, 7};

        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Bucharest");
        cities.add("Hong Kong");

//        printListWithForEach(cities);

        printCitiesWithFor(cities);
    }

    public static void printNumberWithWill(int input) {
        int number = 1;

        while (number <= input) {
            System.out.println("Number: " + number);
            ++number;
        }
    }

    public static void printNumberWithDoWhile(int input) {
        int number = 1;

        do {
            System.out.println("Number: " + number);
            ++number;
        } while (number <= input);
    }

    public static void printNumberWithFor(int input) {
        for (int index = 1; index <= 10; index++) {
            System.out.println("Number: " + index);
        }
    }

    public static void printListWithForEach(List<String> list) {
        for (String city : list) {
            System.out.println("City from the list: " + city);
        }
    }

    public static void printCitiesWithFor(List<String> list) {
        for (int index = 0; index < list.size(); index++) {
            System.out.println("City from the list: " + list.get(index));
        }
    }
}
