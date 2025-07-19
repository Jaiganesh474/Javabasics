
// This is a simple Java program that demonstrates the use of interfaces.
// An interface is a reference type in Java that can contain only constants,
// method signatures, default methods, static methods, and nested types.

interface Animal {

    void makeSound();

    default void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog implements Animal {
    // Implement the abstract method
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat implements Animal {
    // Implement the abstract method
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();  // Output: Woof Woof
        cat.makeSound();  // Output: Meow Meow

        dog.eat();  // Output: This animal eats food.
        cat.eat();  // Output: This animal eats food.
    }
}