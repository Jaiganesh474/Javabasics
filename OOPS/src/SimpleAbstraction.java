//BASIC ABSTRACTION EXAMPLE
// Abstraction in Java is a fundamental concept in object-oriented programming that allows
// you to hide the complex implementation details and show only the essential features of an object.

abstract class AbstractionSimple {
    // Abstract method (does not have a body)
    public abstract void display();

    // Regular method
    public void show() {
        System.out.println("This is a regular method in the abstract class.");
    }
}
public class SimpleAbstraction {
    public static void main(String[] args) {
        // Create an anonymous class that extends the abstract class
        AbstractionSimple obj = new AbstractionSimple() {
            @Override
            public void display() {
                System.out.println("Display method implemented in the anonymous class.");
            }
        };
        // Call the abstract method
        obj.display();
        // Call the regular method
        obj.show();
    }
}
