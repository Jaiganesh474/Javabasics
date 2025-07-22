package arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Example of an array declaration and initialization
        // syntax - dataType[] arrayName = new dataType[size];
        int[] numbers = new int[5]; // Array of integers with size 5

        // Example of assigning values to an array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;


        // Example of accessing array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("The Array is "+Arrays.toString(numbers));

        // Example of an array with initial values
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Example of iterating through an array using a for-each loop
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
