package session_17_equals_hashcode_generics.challenge.exercise_1;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(152, 200);
        Rectangle rect2 = new Rectangle(152, 200);
        Rectangle rect3 = new Rectangle(200, 152);

        System.out.println("rect1 equals rect2: " + rect1.equals(rect2));
        System.out.println("rect3 equals rect2: " + rect3.equals(rect2));

        System.out.println("Do rect1 and rect2 have the same hashCode? ");
        System.out.println(rect1.hashCode() == rect2.hashCode());

        System.out.println("Do rect1 and rect3 have the same hashCode? ");
        System.out.println(rect1.hashCode() == rect3.hashCode());
    }
}