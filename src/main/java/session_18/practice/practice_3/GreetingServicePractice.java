package session_18.practice.practice_3;

public class GreetingServicePractice {

    public static void main(String[] args) {
        // using anonymous class
        GreetingService anonymousGreetingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println(message + " from anonymous class");
            }
        };

        anonymousGreetingService.greet("Hello World");

        //using lambda expression
        GreetingService lambdaGreetingService = message -> System.out.println(message + " from lambda expression");
        lambdaGreetingService.greet("Hello World");
    }
}