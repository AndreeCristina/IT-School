package sesion_3_java_operators.challenge;

public class ExerciseTwo {

    public static void main(String[] args) {
        int number = 99;

        // version 1
//        System.out.println(++number);
//        System.out.println(--number);
//        System.out.println(number++);
//        System.out.println(number--);

        // version 2

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
