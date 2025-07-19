//BASIC INHERITANCE EXAMPLE
//To inherit from a class in Java, you use the `extends` keyword.
// This allows you to create a new class
// that is a subclass of an existing class, inheriting its properties and methods.

class A{
    public void display() {
        System.out.println("Display method of class A");
    }
    public void display(int x) {
        System.out.println("Display method of class A with parameter: " + x);
    }
}
class B extends A {
    public void show() {
        System.out.println("Show method of class B");
    }

    @Override
    public void display(int x) {
        super.display(x);
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        // Create an object of class B
        B objB = new B();

        // Call the display method from class A
        objB.display();

        // Call the show method from class B
        objB.show();
        // Call the display method with an integer parameter from class A
        objB.display(10);
    }
}
