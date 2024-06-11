package sesion_3_java_operators.challenge;

public class ExerciseTwo {

    public static void main(String[] args) {
        // 2. Create a Java program where you increment and decrement the same variable.
        // Display the value of the variable after each operation.

        int number = 99;

        // first version

//        System.out.println(++number);
//        System.out.println(--number);
//        System.out.println(number++);
//        System.out.println(number--);

        // second version

        ++number;
        System.out.println(number);
        --number;
        System.out.println(number);
        number++;
        System.out.println(number);
        number--;
        System.out.println(number);
    }
}
