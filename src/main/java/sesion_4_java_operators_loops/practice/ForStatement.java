package sesion_4_java_operators_loops.practice;


public class ForStatement {

    public static void main(String[] args) {
        printNumbers(10);
        int[] array = {1, 7, 3, 9, 34};
        printArray(array);
    }

    public static void printNumbers(int number) {
        for (int index = 0; index < number; index++) {
            System.out.print(index + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] numbersArray) {
        //numberArray = {1, 7, 3, 9, 34}
        for (int number : numbersArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(numbersArray[2]);
    }
}
