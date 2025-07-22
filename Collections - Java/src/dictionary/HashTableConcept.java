package dictionary;

import java.util.Hashtable;

public class HashTableConcept {
    public static void main(String[] args) {
        // create hash table
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();

        // populate hash table
        hashtable.put(1, 1);
        hashtable.put(2, 2);
        hashtable.put(3, 3);

        System.out.println("Initial table elements: " + hashtable);
        System.out.println("Hashtable contains 2 as value: " + hashtable.contains(2));
        System.out.println("Hashtable contains 4 as value: " + hashtable.contains(4));
    }
}
