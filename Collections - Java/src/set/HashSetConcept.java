package set;//HashSet is a part of Java's collection framework and implements the Set interface.
// It is used to store a collection of unique elements, meaning it does not allow duplicate values.
//Unlike List, HashSet does not maintain the order of elements.

import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {
    public static void main(String[] args) {
        int[] count = {34,22,10,60,30,22};
        Set<Integer> set = new HashSet<>();
        try {
            for(int i = 0; i < 5; i++) {
                set.add(count[i]);
            }
            System.out.println(set);
        }
        catch(Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

