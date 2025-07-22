package map;

import java.util.Map;
import java.util.TreeMap;

//TreeMap is a part of Java's collection framework and implements the Map interface.
// It stores key-value pairs in a sorted order based on the
// natural ordering of the keys or by a specified comparator.
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, String> m1 = new TreeMap<>();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");

        System.out.println();
        System.out.println("Map Elements");
        System.out.print(m1);

    }
}
