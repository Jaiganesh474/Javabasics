
//Inheritance - extending the characteristics/properties from parent
// class to child/subclass which will make code reusability
// KEYWORD - extends (IMPORTANT)
class Person {
    String name;
    public Person(String name){
        this.name = name;
    }
}

class Address extends Person{
    int doorno;

    public Address(String name,int doorNo) {
        super(name);
        this.doorno=doorNo;
    }

    public void printDetails() {
        System.out.print("Student Details: ");
        System.out.println(this.name+ ", " + this.doorno);
    }

}

// create a Student class
public class Inheritance extends Address {
    // Declaring attributes
    int rollNo;
    String section;

    // initialize attributes
    Inheritance(String name, int doorno, int rollNo, String section){
        super(name,doorno);
        this.rollNo = rollNo;
        this.section = section;
    }

    // print details
    public void printDetails() {
        System.out.print("Student Details: ");
        System.out.println(this.name+ ", " + this.doorno+", "+this.rollNo + ", " + section);
    }

    public static void main(String[] args) {
        // create student objects
        Inheritance student1 = new  Inheritance("Robert", 1, 121,"IX Green");
        Inheritance student2 = new  Inheritance("Adam", 2, 13,"IX Red");
        Inheritance student3 = new  Inheritance("Julie", 3, 14,"IX Blue");
        Address student4=new Address("Jai",12);
        Person student5=new Person("ganesh");

        // print student details
        student1.printDetails();
        student2.printDetails();
        student3.printDetails();
        student4.printDetails();
        student5.name="leo";
    }
}
