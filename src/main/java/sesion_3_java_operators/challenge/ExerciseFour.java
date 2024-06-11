package sesion_3_java_operators.challenge;

public class ExerciseFour {

    public static void main(String[] args) {
        // first solution with "while"
        int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            ++count;
        }
        System.out.println();
        while (count > 1) {
            --count;
            System.out.print(count + " ");
        }
        System.out.println();

        // second solution with "for"
        for (int i = 1; i <= 10; ++i) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; --i) {
            System.out.print(i + " ");
        }
    }
}
