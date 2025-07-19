// ABSTRACTION WITH CONSTRUCTORS+INHERITANCE
//an abstraction is a technique of hiding internal details and showing functionalities.
// The abstract classes and interfaces are used to achieve abstraction in Java.

abstract class Vehicle {

    // Concrete method that can be used by subclasses
    public void startEngine() {
        System.out.println("Engine Started");
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}

public class Abstraction extends Vehicle{
    private String color;

    public Abstraction(String color) {
        this.color = color;
    }
    // Implementing the abstract method from Vehicle class
    public void printDetails() {
        System.out.println("Car color is: " + this.color);
    }

    // Implementing the abstract method from Vehicle class
    @Override
    public void display() {
        System.out.println("This is a car.");
    }

    public static void main(String[] args) {
        Abstraction car = new Abstraction("White");
        car.display();
        car.printDetails();
        car.startEngine();

    }
}

