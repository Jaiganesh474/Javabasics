//POLYMORPHISM WITH CONSTRUCTORS
// Polymorhism - used to create many forms with same name of the single entity
//usually consists of two types
//METHOD OVERLOADING - means that using same method name but diff parameters
//METHOD OVERRIDING - means that using the inheritance
// where we can have multiple methods with the same name in parent and child classes.

public class Polymorphism {
    // Declaring attributes
    String name;
    int rollNo;
    String section;

    // initialize attributes
    Polymorphism(String name, int rollNo, String section){
        this.name= name;
        this.rollNo = rollNo;
        this.section = section;
    }
    // print details	 Method overloading - same method name diff parameters
    public void printDetails() {
        System.out.print("Student Details: ");
        System.out.println(this.name+ ", " + this.rollNo + ", " + section);
    }

    // print details without section if required Method overloading - same method name diff parameters
    public void printDetails(boolean hideSection) {
        System.out.print("Student Details: ");
        System.out.println(this.name+ ", " + this.rollNo + ", " + (hideSection ? "" : section));
    }

    public static void main(String[] args) {
        // create student objects
        Polymorphism student1 = new Polymorphism("Robert", 1, "IX Blue");
        Polymorphism student2 = new Polymorphism("Adam", 2, "IX Red");
        Polymorphism student3 = new Polymorphism("Julie", 3, "IX Blue");

        // print student details
        student1.printDetails();
        student2.printDetails(true);
        student3.printDetails(false);
    }
}
