package sesion_8_recap.practice;

public class ForPractice {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 6, 8};

        for (int number : myArray) {
            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }

        for (int index = 0; index < myArray.length; index++) {
            System.out.println(myArray[index]);
        }
    }
}
