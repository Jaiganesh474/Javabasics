package set;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetConcept {
    public static void main(String[] args) {
        int[] count = {34,22,10,60,30,22};
        HashSet<Integer> set = new HashSet<>();
        try {
            for(int i = 0; i < 5; i++) {
                set.add(count[i]);
            }
            System.out.println(set);

            TreeSet<Integer> sortedSet = new TreeSet<>(set);
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);

            System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
            System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
        }
        catch(Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
