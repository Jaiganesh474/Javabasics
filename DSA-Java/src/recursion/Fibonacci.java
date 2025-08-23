package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 3; // Example input
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }

    static int fibonacci(int n) {
        //base condition
        if(n<2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
