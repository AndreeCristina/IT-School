package session_17_equals_hashcode_generics.challenge.exercise_5;

public class ProductTest {

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("ice cream");
        product1.setId(12457L);
        product1.setPrice(12.5);

        Product product2 = new Product();
        product2.setName("wafer");
        product2.setId(12457L);
        product2.setPrice(15.3);

        System.out.println("Is product1 equal product2? " + product1.equals(product2));
        System.out.println("product1 and product2 have the same hashCode? " + (product1.hashCode() == product2.hashCode()));

        product1.setId(147L);

        System.out.println("Is product1 equal product2? " + product1.equals(product2));
        System.out.println("product1 and product2 have the same hashCode? " + (product1.hashCode() == product2.hashCode()));
    }
}