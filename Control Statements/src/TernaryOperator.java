//Syntax: variable=(condition) ? expression1 : expression2
// The ternary operator is a shorthand for if-else statements.
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println("The maximum number is: " + max);


        String result = (a < b) ? "a is less than b" : "a is not less than b";
        System.out.println(result);
    }
}
