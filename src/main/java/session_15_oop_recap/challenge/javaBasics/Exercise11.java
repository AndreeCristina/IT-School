package session_15_oop_recap.challenge.javaBasics;

public class Exercise11 {
    /* Scope: Declare variables in different scopes, such as local scope, instance scope, and static scope.
    Use the variables in your code to ensure that they are only accessible within their respective scopes.*/
    static int staticVariable = 25;

    int instanceVariable = 40;

    public static void main(String[] args) {
        int localVariable = 15;

        System.out.println("Static variable: " + staticVariable);
        //System.out.println("Instance variable: " + instanceVariable); //can be access only
        System.out.println("Local variable: " + localVariable);
    }
}