package kata.session_5;

public class StringChecker {

    public static void main(String[] args) {
        String input1 = "abaaaaa";
        String input2 = "bbb";
        String input3 = "aaa";
        String input4 = "abb";
        String input5 = "abbaabbaa";
        System.out.println(checkString(input1));
        System.out.println(checkString(input2));
        System.out.println(checkString(input3));
        System.out.println(checkString(input4));
        System.out.println(checkString(input5));
    }

    public static boolean checkString(String input) {
        if (!input.toLowerCase().contains("a")) {
            return true;
        }
        if (input.toLowerCase().lastIndexOf("a") < input.toLowerCase().indexOf("b")) {
            return true;
        }
        return false;
    }
}