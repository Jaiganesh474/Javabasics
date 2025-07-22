package dictionary;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryConcept {
    public static void main(String[] args) {
        // create a new hashtable
        Dictionary<Integer, Integer> dictionary = new Hashtable<>();

        // add 2 elements
        dictionary.put(1, 1);
        dictionary.put(2, 2);

        Enumeration<Integer> enumeration = dictionary.keys();

        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
