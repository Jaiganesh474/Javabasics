package set;

// LinkedHashSet is a part of Java's collection framework and implements the Set interface.
// It is used to store a collection of unique elements, meaning it does not allow duplicate values.
// Unlike HashSet, LinkedHashSet maintains the insertion order of elements.

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcept {
    public static void main(String[] args) {
        int[] count = {34, 22,10,60,30,22};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

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
