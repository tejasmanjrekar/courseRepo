package LanguageEssentials;

public class LambdaExpressionMain {
    private static void blockedLambdaWithParameter() {
        Calculator subtractor = (n1, n2) -> {
            return n1 - n2;
        };
        int subResult = subtractor.doCalculate(40, 24);
        System.out.println(subResult);
    }
    private static void simpleLambdaWithParameter() {
        Calculator adder = (int n1, int n2) -> n1 + n2;
        int addResult = adder.doCalculate(10, 5);
        System.out.println(addResult);
    }
    private static void blockedLambda() {
        GreetingService myService = () -> {
            String message = "Good afternoon";
            String addressing = " to all my friends";
            String finalMessage = message + " " + addressing;
            return finalMessage;
        };
        String greetingMessage = myService.sayGreeting();
        System.out.println(greetingMessage);
    }
    private static void simpleLambda() {
        GreetingService helloService = () -> "Hello All !!";
        GreetingService welcomeService = () -> "Welcome All !!";

        String firstGreeting = helloService.sayGreeting();
        String secondGreeting = welcomeService.sayGreeting();

        System.out.println(firstGreeting);
        System.out.println(secondGreeting);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        simpleLambda();
        blockedLambda();
        simpleLambdaWithParameter();
        blockedLambdaWithParameter();
    }
}
