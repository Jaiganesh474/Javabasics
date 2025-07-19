//SIMPLE POLYMORPHISM EXAMPLE

//METHOD OVERLOADING EXAMPLE
class MethodOverloadingExample {

    // Method to print details of a student
    public void printDetails(String name, int rollNo) {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }

    // Overloaded method to print details of a student with section
    public void printDetails(String name, int rollNo, String section) {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }
}

//METHOD OVERRIDING EXAMPLE
class MethodOverridingExample extends MethodOverloadingExample{


    // Overridden method in derived class
    //runtime Polymorphism (IMPORTANT DIFFERENCE)
    @Override
    public void printDetails(String name, int rollNo) {
        System.out.println("Display from Derived Class");
    }
}
public class SimplePolymorphism {
    public static void main(String[] args) {
        MethodOverridingExample sp = new MethodOverridingExample();

        // Calling the first method
        sp.printDetails("Alice", 101);

        sp.printDetails("jai", 103);

        // Calling the overloaded method
        sp.printDetails("Bob", 102, "A");

    }
}
