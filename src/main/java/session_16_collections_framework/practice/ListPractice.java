package session_16_collections_framework.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList = initializeList();
        System.out.println(myList);

        List<Integer> updateList = updateList(myList, 3, 7);
        System.out.println(updateList);

        boolean isElementPresent = isElementPresent(updateList, 3);
        System.out.println("Is my element present? " + isElementPresent);
    }

    public static boolean isElementPresent(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static List<Integer> updateList(List<Integer> list, int index, int value) {
        if (index < 0 || index > list.size()) {
            System.out.println("Invalid index");
            return list;
        } else {
            List<Integer> newList = new ArrayList<>(list);
            list.set(index, value);
            return list;
        }
    }

    public static List<Integer> initializeList() {
        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < 10; index++) {
            list.add(index);
        }

        return list;
    }
}