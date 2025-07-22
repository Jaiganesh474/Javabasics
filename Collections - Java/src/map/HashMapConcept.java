package map;

// HashMap is a part of Java's collection framework and provides a way to store key-value pairs.
// It allows null values and one null key.
// It is not synchronized, meaning it is not thread-safe.
// It does not maintain the order of elements.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapConcept {
    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        HashMap<String, Integer> mapclone = new HashMap<>();
        map.put("One", 1);
        map.put("four", 4);
        map.put("Three", 3);

        System.out.println("HashMap: " + map);

        boolean containsKey = map.containsKey("Two");
        System.out.println("Contains key 'Two': " + containsKey);

        boolean containsValue = map.containsValue(3);
        System.out.println("Contains value 3: " + containsValue);

        Set entrySet = map.entrySet();
        System.out.println("Entry Set: " + entrySet);

        int hashcode = map.hashCode();
        System.out.println("HashCode: " + hashcode);

        map.putAll(mapclone);
        System.out.println("After putAll: " + map);

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
