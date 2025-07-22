

public class StaticExample {

    static class StaticKeyword {
        // Static variable
        static int staticVariable = 10;

        // Static method
        static void staticMethod() {
            staticVariable+= 10; // Incrementing static variable
            System.out.println("Static method called. Static variable: " + staticVariable);
        }

        // Static block
        static {
            System.out.println("Static block executed. Static variable initialized to: " + staticVariable);
        }
    }
    public static void main(String[] args) {
        // Accessing static variable
        //Does not require an instance of the class

        StaticKeyword.staticMethod();
    }
}
