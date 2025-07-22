package comparators;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dog implements Comparator<Dog>, Comparable<Dog> {
    private String name;
    private int age;
    Dog() {
    }

    Dog(String n, int a) {
        name = n;
        age = a;
    }


    // Overriding the compareTo method
    public int compareTo(Dog d) {
        return (this.name).compareTo(d.name);
    }

    // Overriding the compare method to sort the age
    public int compare(Dog d, Dog d1) {
        return d.age - d1.age;
    }

    @Override
    public String toString() {
        return this.name + "," + this.age;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        // Takes a list o Dog objects
        List<Dog> list = new ArrayList<>();

        list.add(new Dog("Shaggy", 3));
        list.add(new Dog("Lacy", 2));
        list.add(new Dog("Roger", 10));
        list.add(new Dog("Tommy", 4));
        list.add(new Dog("Tammy", 1));

        Collections.sort(list);   // Sorts the array list
        System.out.println("Sorted by name:");
        // printing the sorted list of names
        System.out.print(list);

        // Sorts the array list using comparator
        list.sort(new Dog());
        System.out.println(" ");

        System.out.println("Sorted by age:");
        // printing the sorted list of ages
        System.out.print(list);
    }
}
