package map;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        // Create a hash map
        SortedMap<String, Double> map = new TreeMap<>();

        // Put elements to the map
        map.put("Zara", Double.valueOf(3434.34));
        map.put("Mahnaz", Double.valueOf(123.22));
        map.put("Ayan", Double.valueOf(1378.00));
        map.put("Daisy", Double.valueOf(99.22));
        map.put("Qadir", Double.valueOf(-19.08));
        // Example of using Map.entry for a single entry

        // Get a set of the entries
        Set<Map.Entry<String, Double>> set = map.entrySet();

        //entrySet() returns a Set view of the mappings contained in this map.


        // Get an iterator
        Iterator<Map.Entry<String, Double>> i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry<String, Double> me = i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        BitSet set1 = new BitSet();
        // Set some bits
        set1.set(0);
        set1.set(2);
        set1.set(4);
        System.out.println("BitSet: " + set1);

    }
}
