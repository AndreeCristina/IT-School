package sesion_6_java_core_apis.extra_practice;

public class SearchingForSubstrings {
    public static void main(String[] args) {
        System.out.println("abc".startsWith("a"));
        System.out.println("abc".startsWith("A"));

        System.out.println("abc".endsWith("c"));
        System.out.println("abc".endsWith("C"));
        System.out.println("abc".endsWith("bc"));

        System.out.println("abc".contains("b"));
        System.out.println("abc".contains("abc"));
        System.out.println("abc".contains("B"));
    }
}
