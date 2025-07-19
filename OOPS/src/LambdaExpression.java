//LambdaExpression means an anonymous function or a function without a name.
// It is a feature in Java that allows you to treat functionality as a method argument,
// or to create a concise way to represent a single method interface (functional interface).
// Lambda expressions are used primarily to define the inline implementation of a functional interface.
// A functional interface is an interface that contains only one abstract method.
// Lambda expressions can be used primarily to define the inline implementation of a functional interface.

import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyLambdaExpression {
    void execute();
}
@FunctionalInterface
interface MyLambdaExpressionwithParams {
    void execute(String message);
}
@FunctionalInterface
interface MyLambdaExpressionwithreturn {
    String execute(String message);
}

public class LambdaExpression
{
    public static void main(String[] args)
    {

        MyLambdaExpression lambda = () ->
                System.out.println("Executing the lambda expression!");

        MyLambdaExpressionwithParams lambda1=(String message) ->
                System.out.println("Executing the lambda expression with message: " + message);

        MyLambdaExpressionwithreturn lambda2 = (String message) -> message;

        lambda.execute();
        lambda1.execute("Hello, Lambda!");
        System.out.println(lambda2.execute("Hello, Lambda with return!"));

        // Using a lambda expression to create a thread
        Runnable runnable = () -> System.out.println("Running in a thread using a lambda expression!");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
