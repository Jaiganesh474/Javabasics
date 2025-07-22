package set;

// SortedSet is a part of the Java Collections Framework
// It extends the Set interface and provides additional methods for sorted order

// Example usage of SortedSet can be done using TreeSet
// TreeSet is a popular implementation of SortedSet

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetConcept {
    public static void main(String[] args) {
        // Create the sorted set
        SortedSet<String> set = new TreeSet<>();

        // Add elements to the set
        set.add("b");
        set.add("c");
        set.add("a");
        set.add("d");
        set.add("e");
        set.add("f");

        // remove elements
        set.remove("c");
        set.remove("f");

        Comparator comparator = set.comparator();
        if (comparator == null) {
            System.out.println("The set is sorted in natural order.");
        } else {
            System.out.println("The set is sorted using a custom comparator: " + comparator);
        }

        Object firstElement = set.first();
        Object lastElement = set.last();

        SortedSet headSet = set.headSet("d");
        SortedSet tailSet = set.tailSet("b");
        SortedSet subSet = set.subSet("b", "e");
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
        System.out.println("Head Set (elements before 'd'): " + headSet);
        System.out.println("Tail Set (elements from 'd' onwards): " + tailSet);
        System.out.println("Sub Set (elements from 'b' to 'e'): " + subSet);

        // Display the sorted set
        System.out.println("Sorted Set: " + set);

        // Iterating over the elements in the set
//        Iterator it = set.iterator();
//
//        while (it.hasNext()) {
//            // Get element
//            Object element = it.next();
//            System.out.println(element.toString());
//        }
    }
}
